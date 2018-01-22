package rc.loveq.baselib.http;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public class BaseSubscriber<T> implements Observer<T>,SingleObserver<T> {

    private RequestCallback<T> mCallback;

    public BaseSubscriber(RequestCallback<T> callback) {
        mCallback = callback;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onSuccess(T t) {
        if (mCallback != null) {
            mCallback.requestSuccess(t);
        }
    }

    @Override
    public void onNext(T t) {
        if (mCallback != null) {
            mCallback.requestSuccess(t);
        }
    }

    @Override
    public void onError(Throwable e) {
        if (mCallback != null) {
            mCallback.requestFail(e.getMessage());
        }
    }

    @Override
    public void onComplete() {
        if (mCallback != null) {
            mCallback.requestComplete();
        }
    }
}
