package rc.loveq.news.data;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/16.
 * Description:
 */

public class AppDataManager implements DataManager {
    @Override
    public Observable<Map<String, List<NewsChannel>>> getNewsChannelList(String channel, String id, int page) {
        return null;
    }
}
