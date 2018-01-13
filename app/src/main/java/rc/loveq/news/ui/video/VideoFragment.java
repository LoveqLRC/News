package rc.loveq.news.ui.video;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import rc.loveq.baselib.ui.BaseFragment;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class VideoFragment extends BaseFragment {
    public static VideoFragment newInstance() {
        Bundle args = new Bundle();
        VideoFragment fragment = new VideoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_video;
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
