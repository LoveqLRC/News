package rc.loveq.news.data.api;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author：Rc
 * 0n 2018/1/21 21:36
 */

@IntDef({ApiHost.NEWS, ApiHost.Eyepetizer})
@Retention(RetentionPolicy.SOURCE)
public @interface ApiHost {
    int NEWS = 0;
    int Eyepetizer = 1;
}
