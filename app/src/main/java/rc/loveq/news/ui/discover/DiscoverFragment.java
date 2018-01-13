package rc.loveq.news.ui.discover;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import rc.loveq.baselib.ui.BaseFragment;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:24
 */

public class DiscoverFragment extends BaseFragment {
    public static DiscoverFragment newInstance() {
        Bundle args = new Bundle();
        DiscoverFragment fragment = new DiscoverFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover;
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
