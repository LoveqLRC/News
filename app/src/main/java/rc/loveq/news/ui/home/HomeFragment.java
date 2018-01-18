package rc.loveq.news.ui.home;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import rc.loveq.baselib.ui.BaseFragment;
import rc.loveq.news.R;

/**
 * Author：Rc
 * 0n 2018/1/13 16:26
 */

public class HomeFragment extends BaseFragment {

    public TabLayout mTabLayout;
    public ViewPager mVpHome;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View view) {
        mTabLayout = view.findViewById(R.id.tl_news);
        mVpHome = view.findViewById(R.id.vp_home);
    }

    @Override
    protected void initData() {
        List<String> tabNames = Arrays.asList(mActivity.getResources().getStringArray(R.array.eye_tab_name));
        List<String> tabIndexs = Arrays.asList(mActivity.getResources().getStringArray(R.array.eye_tab_index));
        mVpHome.setAdapter(new HomePagerAdapter(getChildFragmentManager(), tabNames, tabIndexs));
        mTabLayout.setupWithViewPager(mVpHome);
    }


}
