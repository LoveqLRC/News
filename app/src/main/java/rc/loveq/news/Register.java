package rc.loveq.news;

import android.app.Activity;

import me.drakeet.multitype.MultiTypeAdapter;
import rc.loveq.news.ui.home.tab.entity.HomeBanner;
import rc.loveq.news.ui.home.tab.entity.HomeBannerItemBinder;
import rc.loveq.news.ui.home.tab.entity.HomeImage;
import rc.loveq.news.ui.home.tab.entity.HomeImageItemBinder;
import rc.loveq.news.ui.home.tab.entity.HomeText;
import rc.loveq.news.ui.home.tab.entity.HomeTextItemBinder;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class Register {
    public static void registerHomeItem(MultiTypeAdapter adapter, Activity context) {
        adapter.register(HomeBanner.class, new HomeBannerItemBinder());
        adapter.register(HomeImage.class, new HomeImageItemBinder());
        adapter.register(HomeText.class, new HomeTextItemBinder());
    }
}
