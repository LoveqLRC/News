package rc.loveq.baselib;

import android.app.Application;
import android.content.Context;

/**
 * Author：Rc
 * 0n 2018/1/16 22:09
 */

public class BaseApp extends Application {
    private static Context sApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext = this;
    }

    public static Context getContext() {
        return sApplicationContext;
    }
}
