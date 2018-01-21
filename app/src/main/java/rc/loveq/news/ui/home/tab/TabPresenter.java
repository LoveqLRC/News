package rc.loveq.news.ui.home.tab;

import rc.loveq.baselib.http.RequestCallback;
import rc.loveq.baselib.ui.BasePresenter;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public class TabPresenter<V extends TabView> extends BasePresenter<V>
        implements TabMvpPresenter<V>, RequestCallback<Eyepetizer> {
    private final static String TAG = TabPresenter.class.getSimpleName();

    @Override
    public void loadData(String tabName, String tabIndex) {
        getMvpView().showLoading();
//        RetrofitClient.getEyepetizerService()
//                .getTabList(Integer.valueOf(tabIndex), 0, 10)
//                .compose(bindToLifecycle())
//                .compose(RxSchedulers.io_main())
//                .subscribe(new BaseSubscriber<>(this));

    }

    @Override
    public void requestFail(String failMsg) {
        getMvpView().hideLoading();
    }

    @Override
    public void requestComplete() {
        getMvpView().hideLoading();
    }

    @Override
    public void requestSuccess(Eyepetizer eyepetizer) {
        getMvpView().hideLoading();
        getMvpView().dataLoadFinish(eyepetizer.getItemList());
    }


}
