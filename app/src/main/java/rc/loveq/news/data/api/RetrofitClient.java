package rc.loveq.news.data.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import rc.loveq.baselib.http.HttpCacheInterceptor;
import rc.loveq.news.App;
import rc.loveq.news.data.api.eyepetizer.EyepetizerService;
import rc.loveq.news.data.api.news.interceptor.HttpHeaderInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public class RetrofitClient {

    private Retrofit mRetrofit;
    private EyepetizerService mEyepetizerService;
    private static volatile OkHttpClient sOkHttpClient;


    private HttpCacheInterceptor mCacheInterceptor = new HttpCacheInterceptor();
    private HttpHeaderInterceptor mHeaderInterceptor = new HttpHeaderInterceptor();
    private HttpLoggingInterceptor mHttpLoggingInterceptor = new HttpLoggingInterceptor();

    private RetrofitClient() {
        File file = new File(App.getContext().getCacheDir(), "cache");
        mHttpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Cache cache = new Cache(file, 1024 * 1024 * 100);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache)
                .addNetworkInterceptor(mCacheInterceptor)
                .addInterceptor(mCacheInterceptor)
                .addInterceptor(mHeaderInterceptor)
                .addInterceptor(mHttpLoggingInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
        mRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(EyepetizerService.EYEPETIZER_END_POINT)
                .build();
        mEyepetizerService = mRetrofit.create(EyepetizerService.class);
    }

    private static class SingletonHolder {
        private static final RetrofitClient INSTANCE = new RetrofitClient();
    }

    public static EyepetizerService getEyepetizerService() {
        return SingletonHolder.INSTANCE.mEyepetizerService;
    }


    private OkHttpClient getOkHttpClient() {
        if (sOkHttpClient == null) {
            synchronized (RetrofitClient.class) {
                if (sOkHttpClient != null) {
                    File file = new File(App.getContext().getCacheDir(), "cache");
                    Cache cache = new Cache(file, 1024 * 1024 * 100);
                    sOkHttpClient = new OkHttpClient.Builder()
                            .cache(cache)
                            .addNetworkInterceptor(mCacheInterceptor)
                            .addInterceptor(mCacheInterceptor)
                            .addInterceptor(mHeaderInterceptor)
                            .addInterceptor(mHttpLoggingInterceptor)
                            .retryOnConnectionFailure(true)
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return sOkHttpClient;
    }

}

