package rc.loveq.news.data.api.news;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Author：Rc
 * 0n 2018/1/14 22:47
 */

public interface NewsService {
    /**
     * 获取频道的新闻信息
     * 例子：http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html
     *type
     * @param type      新闻类别：headline为头条,list为其他，house为房产
     * @param id        新闻类别id
     * @param startPage 开始的页码
     * @return 被观察对象
     */
    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Observable<Map<String, List<String>>> getNewsList(
            @Path("type") String type,
            @Path("id") String id,
            @Path("startPage") int startPage);
}
