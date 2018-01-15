package rc.loveq.news.ui.news.channels;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import rc.loveq.baselib.ui.BasePresenter;

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
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
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
