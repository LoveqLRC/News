package rc.loveq.news.ui.home.tab.entity;

import android.content.Context;

import java.util.List;

import rc.loveq.baselib.ui.adapter.BaseAdapter;
import rc.loveq.baselib.ui.adapter.base.ViewHolder;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeBannerAdapter extends BaseAdapter<HomeBanner> {

    public HomeBannerAdapter(Context context, int layoutId, List<HomeBanner> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, HomeBanner banner, int position) {

    }
}
