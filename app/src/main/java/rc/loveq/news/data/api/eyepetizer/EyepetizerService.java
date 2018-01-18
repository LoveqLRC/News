package rc.loveq.news.data.api.eyepetizer;

import java.util.List;

import io.reactivex.Observable;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;
import rc.loveq.news.data.api.news.model.NewsChannel;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by rc on 2018/1/18.
 * Description:开眼视频
 */

public interface EyepetizerService {
    String EYEPETIZER_END_POINT = "http://baobab.kaiyanapp.com/";

    /**
     * 开眼推荐栏
     * 例如 ：http://baobab.kaiyanapp.com/api/v5/index/tab/allRec?page=0
     *
     * @param pageOffset 分页
     * @return
     */
    @GET("api/v5/index/tab/allRec")
    Observable<List<NewsChannel>> getTabRec(@Query("page") int pageOffset);

    /**
     * 获取对应tab的列表信息
     *
     * @param tabIndex   tabIndex下标
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/{tabIndex}")
    Observable<Eyepetizer> getTabList(@Path("tabIndex") int tabIndex, @Query("start") int startIndex, @Query("num") int numCount);

    /**
     * 音乐专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/20?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/20")
    Observable<Eyepetizer> getTabMusic(@Query("start") int startIndex, @Query("num") int numCount);


    /**
     * 记录专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/22?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/22")
    Observable<Eyepetizer> getTabRecord(@Query("start") int startIndex, @Query("num") int numCount);


    /**
     * 时尚专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/24?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     */
    @GET("api/v5/index/tab/category/24")
    Observable<Eyepetizer> getTabFashion(@Query("start") int startIndex, @Query("num") int numCount);

    /**
     * 萌宠专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/26?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/26")
    Observable<Eyepetizer> getTabPet(@Query("start") int startIndex, @Query("num") int numCount);

    /**
     * 搞笑专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/28?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/28")
    Observable<Eyepetizer> getTabFunny(@Query("start") int startIndex, @Query("num") int numCount);


    /**
     * 游戏专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/30?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount   返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/30")
    Observable<Eyepetizer> getTabGame(@Query("start") int startIndex, @Query("num") int numCount);

    /**
     * 科普专栏
     * 例如：http://baobab.kaiyanapp.com/api/v5/index/tab/category/32?start=10&num=10
     *
     * @param startIndex 开始的下标
     * @param numCount  返回的个数,注意默认返回10个，如果传10，那么返回20 如果传0，那么返回10个
     * @return
     */
    @GET("api/v5/index/tab/category/32")
    Observable<Eyepetizer> getTabScience(@Query("start") int startIndex, @Query("num") int numCount);
}
