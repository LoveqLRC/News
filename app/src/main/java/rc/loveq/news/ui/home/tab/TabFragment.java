package rc.loveq.news.ui.home.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import rc.loveq.baselib.ui.LazyLoadFragment;
import rc.loveq.baselib.ui.adapter.wrapper.LoadMoreWrapper;
import rc.loveq.news.R;
import rc.loveq.news.Register;
import rc.loveq.news.data.api.news.model.NewsChannel;
import rc.loveq.news.ui.home.tab.adapter.HomeTabAdapter;
import rc.loveq.news.ui.home.tab.entity.HomeBanner;
import rc.loveq.news.ui.home.tab.entity.HomeImage;
import rc.loveq.news.ui.home.tab.entity.HomeText;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class TabFragment extends LazyLoadFragment implements TabView {
    public static final String TAB_INDEX = "TAB_INDEX";
    public static final String TAB_NAME = "TAB_NAME";
    private TabPresenter mPresenter;
    private String mTabIndex;
    private String mTabName;
    private RecyclerView mRecyclerView;
    private List<NewsChannel> mNewsChannelList;
    private Items mItems = new Items();
    private HomeTabAdapter mHomeTabAdapter;
    private LoadMoreWrapper mLoadMoreWrapper;
    private MultiTypeAdapter mMultiTypeAdapter;

    public static TabFragment newInstance(String tabIndex, String tabName) {
        Bundle args = new Bundle();
        args.putString(TAB_INDEX, tabIndex);
        args.putString(TAB_NAME, tabName);
        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_tab;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTabIndex = getArguments().getString(TAB_INDEX);
        String tabName = getArguments().getString(TAB_NAME);
        if (TextUtils.equals(tabName, "头条")) {
            mTabName = "headline";
        } else if (TextUtils.equals(tabName, "房产")) {
            mTabName = "house";
        } else {
            mTabName = "list";
        }
    }

    @Override
    protected void initView(View view) {
        mNewsChannelList = new ArrayList<>();
        mRecyclerView = view.findViewById(R.id.recycler);

        mMultiTypeAdapter = new MultiTypeAdapter(mItems);
        mRecyclerView.setAdapter(mMultiTypeAdapter);
        Register.registerHomeItem(mMultiTypeAdapter, mActivity);


//        mHomeTabAdapter = new HomeTabAdapter(mActivity, mNewsChannelList);
//        mLoadMoreWrapper = new LoadMoreWrapper(mHomeTabAdapter);
//        mLoadMoreWrapper.setLoadMoreView(R.layout.default_loading);
//        mRecyclerView.setAdapter(mLoadMoreWrapper);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        mPresenter = new TabPresenter();
        mPresenter.onAttach(this);
    }


    @Override
    protected void lazyLoadData() {
        mPresenter.loadData(mTabName, mTabIndex);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }

    @Override
    public void dataLoadFinish(List<NewsChannel> itemList) {
        for (NewsChannel newsChannel : itemList) {
            if (newsChannel.getOrder() == 1 && newsChannel.getAds() != null && newsChannel.getAds().size() > 0) {
                mItems.add(new HomeBanner(newsChannel));
            } else if (newsChannel.getImgextra() != null && newsChannel.getImgextra().size() > 0 &&
                    TextUtils.equals(newsChannel.getSkipType(), "photoset")) {
                mItems.add(new HomeImage(newsChannel));
            } else {
                mItems.add(new HomeText(newsChannel));
            }
        }
        mMultiTypeAdapter.notifyDataSetChanged();

//        mNewsChannelList.addAll(itemList);
//        mLoadMoreWrapper.notifyDataSetChanged();
    }
}
