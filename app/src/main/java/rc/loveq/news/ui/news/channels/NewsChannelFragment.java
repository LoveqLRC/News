package rc.loveq.news.ui.news.channels;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import rc.loveq.baselib.ui.LazyLoadFragment;
import rc.loveq.baselib.ui.adapter.MyAdapter;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class NewsChannelFragment extends LazyLoadFragment implements NewsChannelView {
    public static final String NEWS_ID = "NEWS_ID";
    private NewsChannelPresenter mPresenter;

    public static NewsChannelFragment newInstance(String newsId) {
        Bundle args = new Bundle();
        args.putString(NEWS_ID, newsId);
        NewsChannelFragment fragment = new NewsChannelFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news_channel;
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
        mPresenter.loadData();
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }
}
