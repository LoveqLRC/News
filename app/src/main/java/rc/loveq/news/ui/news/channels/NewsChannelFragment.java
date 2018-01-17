package rc.loveq.news.ui.news.channels;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import rc.loveq.baselib.MyAdapter;
import rc.loveq.baselib.ui.LazyLoadFragment;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class NewsChannelFragment extends LazyLoadFragment implements NewsChannelView {
    public static final String NEWS_ID = "NEWS_ID";
    public static final String NEWS_TYPE = "NEWS_TYPE";
    private NewsChannelPresenter mPresenter;
    private String mNewsId;
    private String mNewsType;

    public static NewsChannelFragment newInstance(String newsId, String newsType) {
        Bundle args = new Bundle();
        args.putString(NEWS_ID, newsId);
        args.putString(NEWS_TYPE, newsType);
        NewsChannelFragment fragment = new NewsChannelFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news_channel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNewsId = getArguments().getString(NEWS_ID);
        mNewsType = getArguments().getString(NEWS_TYPE);
    }

    @Override
    protected void initView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mPresenter = new NewsChannelPresenter();
        mPresenter.onAttach(this);
    }


    @Override
    protected void lazyLoadData() {
        mPresenter.loadData(mNewsType, mNewsId);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }
}
