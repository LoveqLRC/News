package rc.loveq.news.ui.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

import rc.loveq.news.ui.news.channels.NewsChannelFragment;

/**
 * Author：Rc
 * 0n 2018/1/13 20:41
 */

public class NewsPagerAdapter extends FragmentStatePagerAdapter {
    private List<String> mChannelNames;
    private List<String> mChannelIds;
    private List<String> mChannelType;
    private final String mHeadChannelType = "headline";
    private final String mHouseChannelType = "house";
    private final String mHeadId = "T1348647909107";
    private final String mHouseId = "5YyX5Lqs";

    public NewsPagerAdapter(FragmentManager fm, List<String> channelNames, List<String> channelIds) {
        super(fm);
        mChannelNames = channelNames;
        mChannelIds = channelIds;
        mChannelType = new ArrayList<>();
        for (String id : mChannelIds) {
            if (TextUtils.equals(id, mHeadChannelType)) {
                mChannelType.add(mHeadChannelType);
            } else if (TextUtils.equals(id, mHouseChannelType)) {
                mChannelType.add(mHouseChannelType);
            } else {
                mChannelType.add("list");
            }
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mChannelNames.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return NewsChannelFragment.newInstance(mChannelIds.get(position), mChannelType.get(position));
    }

    @Override
    public int getCount() {
        return mChannelIds.size();
    }
}
