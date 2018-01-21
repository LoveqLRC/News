package rc.loveq.news.ui.home.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import rc.loveq.baselib.ui.LazyLoadFragment;
import rc.loveq.news.R;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;
import rc.loveq.news.ui.home.tab.adapter.TabAdapter;

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
//    private List<Eyepetizer.ItemListBean> mItemList;
    public TabAdapter mTabAdapter;
    public RecyclerView mRecyclerView;

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
        mTabName = getArguments().getString(TAB_NAME);
    }

    @Override
    protected void initView(View view) {
        mRecyclerView = view.findViewById(R.id.recycler);
//        mItemList = new ArrayList<>();

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
    public void dataLoadFinish(List<Eyepetizer.ItemListBean> itemList) {
        mTabAdapter = new TabAdapter(mActivity, itemList);
        mRecyclerView.setAdapter(mTabAdapter);
//        recyclerView.setAdapter(new MyAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
