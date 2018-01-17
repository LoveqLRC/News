package rc.loveq.baselib.http;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public interface RequestCallback<T> {

    void requestFail(String failMsg);

    void requestComplete();

    void requestSuccess(T t);
}
