package rc.loveq.news.ui.news;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import rc.loveq.baselib.ui.BaseFragment;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class NewsFragment extends BaseFragment {
    public static NewsFragment newInstance() {
        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView(View view) {
        TextView tv = view.findViewById(R.id.textView);
        tv.setText(getFragmentTag());
    }

    @Override
    protected void initData() {

    }
}
