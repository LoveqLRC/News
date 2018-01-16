package rc.loveq.news.data.api;

import android.util.SparseArray;

import okhttp3.OkHttpClient;
import rc.loveq.news.data.api.news.NewsService;

/**
 * Author：Rc
 * 0n 2018/1/16 22:04
 */

public class AppApiHelper {

    private static volatile OkHttpClient sOkhttpClient;
    // 管理不同HostType的单例
    private static SparseArray<AppApiHelper> sInstanceManger = new SparseArray<>();

    private NewsService mNewsService;

    private AppApiHelper() {
    }

    private AppApiHelper(int HostType) {

    }


}
