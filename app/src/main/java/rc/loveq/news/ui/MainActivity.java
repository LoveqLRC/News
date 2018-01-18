package rc.loveq.news.ui;

import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import rc.loveq.baselib.ui.BaseActivity;
import rc.loveq.baselib.ui.FragmentFactory;
import rc.loveq.baselib.ui.bottomnavigation.BottomNavigationViewHelper;
import rc.loveq.news.R;
import rc.loveq.news.ui.discover.DiscoverFragment;
import rc.loveq.news.ui.home.HomeFragment;
import rc.loveq.news.ui.profile.ProfileFragment;
import rc.loveq.news.ui.video.VideoFragment;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    public HomeFragment mHomeFragment;
    public VideoFragment mVideoFragment;
    public DiscoverFragment mDiscoverFragment;
    public ProfileFragment mProfileFragment;
    private @FragmentTabs
    int mCurrentFragmentIndex;
    public static final String POSITION = "POSITION";
    public static final String BNV_SELECTED_ID = "";
    public BottomNavigationView mBottomNavigationView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setupToolbar();
        setupNavigationView();
        setupFragment(savedInstanceState);
        requestPermissions();
    }

    private void requestPermissions() {
    }


    private void setupNavigationView() {
        mBottomNavigationView = findViewById(R.id.bnv_bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSITION, mCurrentFragmentIndex);
        outState.putInt(BNV_SELECTED_ID, mBottomNavigationView.getSelectedItemId());
    }

    private void setupFragment(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mHomeFragment = (HomeFragment) getSupportFragmentManager().findFragmentByTag(HomeFragment.class.getName());
            mVideoFragment = (VideoFragment) getSupportFragmentManager().findFragmentByTag(VideoFragment.class.getName());
            mDiscoverFragment = (DiscoverFragment) getSupportFragmentManager().findFragmentByTag(DiscoverFragment.class.getName());
            mProfileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag(ProfileFragment.class.getName());
            showFragment(savedInstanceState.getInt(POSITION));
            mBottomNavigationView.setSelectedItemId(savedInstanceState.getInt(BNV_SELECTED_ID));
        } else {
            showFragment(FragmentTabs.NEWS);
        }
    }

    @Override
    protected void initData() {

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bnv_news:
                showFragment(FragmentTabs.NEWS);
                break;
            case R.id.bnv_video:
                showFragment(FragmentTabs.VIDEO);
                break;
            case R.id.bnv_discover:
                showFragment(FragmentTabs.DISCOVER);
                break;
            case R.id.bnv_profile:
                showFragment(FragmentTabs.PROFILE);
                break;
        }
        return true;//这里必须返回true
    }

    private void showFragment(@FragmentTabs int index) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideFragment(transaction);
        mCurrentFragmentIndex = index;
        switch (index) {
            case FragmentTabs.NEWS:
                mToolbar.setTitle(R.string.title_news);
                if (mHomeFragment == null) {
                    mHomeFragment = FragmentFactory.createFragment(HomeFragment.class);
                    transaction.add(R.id.container, mHomeFragment, HomeFragment.class.getName());
                } else {
                    transaction.show(mHomeFragment);
                }
                break;
            case FragmentTabs.VIDEO:
                mToolbar.setTitle(R.string.title_video);
                if (mVideoFragment == null) {
                    mVideoFragment = FragmentFactory.createFragment(VideoFragment.class);
                    transaction.add(R.id.container, mVideoFragment, VideoFragment.class.getName());
                } else {
                    transaction.show(mVideoFragment);
                }
                break;
            case FragmentTabs.DISCOVER:
                mToolbar.setTitle(R.string.title_discover);
                if (mDiscoverFragment == null) {
                    mDiscoverFragment = FragmentFactory.createFragment(DiscoverFragment.class);
                    transaction.add(R.id.container, mDiscoverFragment, DiscoverFragment.class.getName());
                } else {
                    transaction.show(mDiscoverFragment);
                }
                break;
            case FragmentTabs.PROFILE:
                mToolbar.setTitle(R.string.title_profile);
                if (mProfileFragment == null) {
                    mProfileFragment = FragmentFactory.createFragment(ProfileFragment.class);
                    transaction.add(R.id.container, mProfileFragment, ProfileFragment.class.getName());
                } else {
                    transaction.show(mProfileFragment);
                }
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (mHomeFragment != null) {
            transaction.hide(mHomeFragment);
        }
        if (mVideoFragment != null) {
            transaction.hide(mVideoFragment);
        }
        if (mDiscoverFragment != null) {
            transaction.hide(mDiscoverFragment);
        }
        if (mProfileFragment != null) {
            transaction.hide(mProfileFragment);
        }
    }


    @IntDef({FragmentTabs.NEWS, FragmentTabs.VIDEO, FragmentTabs.DISCOVER,
            FragmentTabs.PROFILE})
    @Retention(RetentionPolicy.SOURCE)
    @interface FragmentTabs {
        int NEWS = 0;
        int VIDEO = 1;
        int DISCOVER = 2;
        int PROFILE = 3;
    }
}
