package rc.loveq.news.ui.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import rc.loveq.news.ui.home.tab.TabFragment;

/**
 * Author：Rc
 * 0n 2018/1/13 20:41
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter {
    private List<String> mTabNames;
    private List<String> mTabIndex;


    public HomePagerAdapter(FragmentManager fm, List<String> tabNames, List<String> tabIndexs) {
        super(fm);
        mTabNames = tabNames;
        mTabIndex = tabIndexs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabNames.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(mTabIndex.get(position), mTabNames.get(position));
    }

    @Override
    public int getCount() {
        return mTabIndex.size();
    }
}
