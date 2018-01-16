package rc.loveq.news.data.api;

import android.util.SparseArray;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import rc.loveq.baselib.http.CacheControlInterceptor;
import rc.loveq.news.App;
import rc.loveq.news.data.api.news.NewsService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author：Rc
 * 0n 2018/1/16 22:04
 */

public class AppApiHelper {

    private static volatile OkHttpClient sOkHttpClient;
    // 管理不同HostType的单例
    private static SparseArray<AppApiHelper> sInstanceManger = new SparseArray<>();

    private NewsService mNewsService;

    private CacheControlInterceptor mCacheControlInterceptor = new CacheControlInterceptor();

    private AppApiHelper() {
    }

    private AppApiHelper(int HostType) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(NewsService.NEW_END_POINT)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mNewsService = retrofit.create(NewsService.class);
    }

    public static AppApiHelper getInstance(int hostType) {
        AppApiHelper apiHelper = sInstanceManger.get(hostType);
        if (apiHelper == null) {
            apiHelper = new AppApiHelper(hostType);
            sInstanceManger.put(hostType, apiHelper);
            return apiHelper;
        } else {
            return apiHelper;
        }
    }

    private OkHttpClient getOkHttpClient() {
        if (sOkHttpClient == null) {
            synchronized (AppApiHelper.class) {
                if (sOkHttpClient == null) {
                    File file = new File(App.getContext().getCacheDir(), "cache");
                    Cache cache = new Cache(file, 1024 * 1024 * 100);

                    sOkHttpClient = new OkHttpClient.Builder()
                            .addNetworkInterceptor(mCacheControlInterceptor)
                            .addInterceptor(mCacheControlInterceptor)
                            .retryOnConnectionFailure(true)
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .build();
                }
            }
        }

        return sOkHttpClient;
    }


}
