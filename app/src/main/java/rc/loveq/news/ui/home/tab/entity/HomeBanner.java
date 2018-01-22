package rc.loveq.news.ui.home.tab.entity;

import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeBanner {
    public NewsChannel mNewsChannel;

    public HomeBanner(NewsChannel newsChannel) {
        mNewsChannel = newsChannel;
    }
}
