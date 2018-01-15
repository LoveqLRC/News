package rc.loveq.baselib.ui.mvp;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public interface MvpView {
    void showLoading();

    void hideLoading();

    void showMessage(String message);

}
