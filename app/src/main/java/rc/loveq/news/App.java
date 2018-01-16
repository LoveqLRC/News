package rc.loveq.news;

import rc.loveq.baselib.BaseApp;
import rc.loveq.baselib.utils.Utils;

/**
 * Author：Rc
 * 0n 2018/1/11 21:58
 */

public class App extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
