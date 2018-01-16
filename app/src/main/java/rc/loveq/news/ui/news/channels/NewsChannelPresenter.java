package rc.loveq.news.ui.news.channels;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import rc.loveq.baselib.ui.BasePresenter;
import rc.loveq.baselib.utils.RxSchedulers;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public class NewsChannelPresenter<V extends NewsChannelView> extends BasePresenter<V>
        implements NewsChannelMvpPresenter<V> {
    private final static String TAG = NewsChannelPresenter.class.getSimpleName();

    @Override
    public void loadData() {
        Observable.interval(1, TimeUnit.SECONDS)
                .compose(RxSchedulers.io_main())
                .compose(this.bindToLifecycle())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.d(TAG, "ON NEXT " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "COMPLETE");
                    }
                });
    }

}
