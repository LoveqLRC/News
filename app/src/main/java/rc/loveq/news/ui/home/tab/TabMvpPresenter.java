package rc.loveq.news.ui.home.tab;

import rc.loveq.baselib.ui.mvp.MvpPresenter;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public interface TabMvpPresenter<V extends TabView> extends MvpPresenter<V> {
    void loadData(String tabName, String tabIndex);
}
