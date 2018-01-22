package rc.loveq.news.ui.home.tab;

import java.util.List;
import java.util.Map;

import rc.loveq.baselib.http.BaseSubscriber;
import rc.loveq.baselib.http.RequestCallback;
import rc.loveq.baselib.ui.BasePresenter;
import rc.loveq.baselib.utils.RxSchedulers;
import rc.loveq.news.data.api.RetrofitClient;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public class TabPresenter<V extends TabView> extends BasePresenter<V>
        implements TabMvpPresenter<V> {
    private final static String TAG = TabPresenter.class.getSimpleName();

    @Override
    public void loadData(String tabName, String tabIndex) {
//        getMvpView().showLoading();
        RetrofitClient.getNewsService().getNewsList(tabName, tabIndex, 0)
                .compose(bindToLifecycle())
                .compose(RxSchedulers.io_main())
                .subscribe(new BaseSubscriber<>(new RequestCallback<Map<String, List<NewsChannel>>>() {
                    @Override
                    public void requestFail(String failMsg) {

                    }

                    @Override
                    public void requestComplete() {

                    }

                    @Override
                    public void requestSuccess(Map<String, List<NewsChannel>> map) {
                        getMvpView().dataLoadFinish(map.get(tabIndex));
                    }
                }));


    }


}
