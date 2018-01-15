package rc.loveq.baselib.ui.mvp;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);

    void onDetach();
}
