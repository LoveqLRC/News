package rc.loveq.news.ui.home.tab;

import java.util.List;

import rc.loveq.baselib.ui.mvp.MvpView;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public interface TabView extends MvpView {
    void dataLoadFinish(List<Eyepetizer.ItemListBean> itemList);
}
