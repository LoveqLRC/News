package rc.loveq.news.ui.news;

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

public class NewsFragment extends BaseFragment {

    public TabLayout mTabLayout;
    public ViewPager mVpNews;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView(View view) {
        mTabLayout = view.findViewById(R.id.tl_news);
        mVpNews = view.findViewById(R.id.vp_news);
    }

    @Override
    protected void initData() {
        List<String> channelNames = Arrays.asList(mActivity.getResources().getStringArray(R.array.news_channel));
        List<String> channelIds = Arrays.asList(mActivity.getResources().getStringArray(R.array.news_channel_id));
        mVpNews.setAdapter(new NewsPagerAdapter(getChildFragmentManager(), channelNames, channelIds));
        mTabLayout.setupWithViewPager(mVpNews);
    }


}
