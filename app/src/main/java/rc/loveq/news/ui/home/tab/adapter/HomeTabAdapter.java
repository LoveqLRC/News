package rc.loveq.news.ui.home.tab.adapter;

import android.content.Context;

import java.util.List;

import rc.loveq.baselib.ui.adapter.MultiItemTypeAdapter;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeTabAdapter extends MultiItemTypeAdapter<NewsChannel> {

    public HomeTabAdapter(Context context, List<NewsChannel> datas) {
        super(context, datas);
        addItemViewDelegate(new HomeBannerDelegate());
        addItemViewDelegate(new HomeImageDelegate());
        addItemViewDelegate(new HomeTextDelegate());
    }
}
