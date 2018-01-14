package rc.loveq.news.ui.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import rc.loveq.news.ui.news.channels.NewsChannelFragment;

/**
 * Author：Rc
 * 0n 2018/1/13 20:41
 */

public class NewsPagerAdapter extends FragmentStatePagerAdapter {
    private List<String> mChannelNames;
    private List<String> mChannelIds;


    public NewsPagerAdapter(FragmentManager fm, List<String> channelNames, List<String> channelIds) {
        super(fm);
        mChannelNames = channelNames;
        mChannelIds = channelIds;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mChannelNames.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return NewsChannelFragment.newInstance(mChannelIds.get(position));
    }

    @Override
    public int getCount() {
        return mChannelIds.size();
    }
}
