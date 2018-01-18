package rc.loveq.news.data.api;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public interface ApiHelper {
    Observable<Map<String, List<NewsChannel>>> getNewsChannelList(String channel, String id, int page);
}
