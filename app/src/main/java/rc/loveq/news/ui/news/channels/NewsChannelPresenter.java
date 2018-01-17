package rc.loveq.news.ui.news.channels;

import android.util.Log;

import java.util.List;
import java.util.Map;

import rc.loveq.baselib.http.BaseSubscriber;
import rc.loveq.baselib.http.RequestCallback;
import rc.loveq.baselib.ui.BasePresenter;
import rc.loveq.baselib.utils.RxSchedulers;
import rc.loveq.news.data.api.RetrofitClient;
import rc.loveq.news.data.api.model.NewsChannel;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public class NewsChannelPresenter<V extends NewsChannelView> extends BasePresenter<V>
        implements NewsChannelMvpPresenter<V>, RequestCallback<Map<String, List<NewsChannel>>> {
    private final static String TAG = NewsChannelPresenter.class.getSimpleName();

    @Override
    public void loadData(String channelType, String newsId) {
        getMvpView().showLoading();
        RetrofitClient.getNewsService().getNewsList(channelType, newsId, 0)
                .compose(bindToLifecycle())
                .compose(RxSchedulers.io_main())
                .subscribe(new BaseSubscriber<>(this));
        Log.d(TAG, "RetrofitClient.getNewsService():" + RetrofitClient.getNewsService());
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
    public void requestSuccess(Map<String, List<NewsChannel>> map) {

    }
}
