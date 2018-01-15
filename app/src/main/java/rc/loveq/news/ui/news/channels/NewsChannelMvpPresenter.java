package rc.loveq.news.ui.news.channels;

import rc.loveq.baselib.ui.mvp.MvpPresenter;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public interface NewsChannelMvpPresenter<V extends NewsChannelView> extends MvpPresenter<V> {
    void loadData();
}
