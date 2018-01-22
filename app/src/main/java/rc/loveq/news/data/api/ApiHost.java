package rc.loveq.news.data.api;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author：Rc
 * 0n 2018/1/21 21:36
 */

@StringDef({ApiHost.NEWS, ApiHost.EYEPETIZER})
@Retention(RetentionPolicy.SOURCE)
public @interface ApiHost {
    String NEWS = "http://c.m.163.com/";
    String EYEPETIZER = "http://baobab.kaiyanapp.com/";
}
