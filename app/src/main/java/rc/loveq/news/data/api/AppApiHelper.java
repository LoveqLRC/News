package rc.loveq.news.data.api;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Author：Rc
 * 0n 2018/1/16 22:04
 */

public class AppApiHelper implements ApiHelper {

    @Override
    public Observable<Map<String, List<NewsChannel>>> getNewsChannelList(String channel, String id, int page) {
        return null;
    }
}
