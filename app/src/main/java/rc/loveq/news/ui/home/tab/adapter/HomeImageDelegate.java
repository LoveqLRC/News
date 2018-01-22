package rc.loveq.news.ui.home.tab.adapter;

import android.text.TextUtils;

import rc.loveq.baselib.ui.adapter.base.ItemViewDelegate;
import rc.loveq.baselib.ui.adapter.base.ViewHolder;
import rc.loveq.news.R;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeImageDelegate implements ItemViewDelegate<NewsChannel> {

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_home_text;
    }

    @Override
    public boolean isForViewType(NewsChannel item, int position) {
        return item.getImgextra() != null && item.getImgextra().size() > 0 &&
                TextUtils.equals(item.getSkipType(), "photoset");
    }

    @Override
    public void convert(ViewHolder holder, NewsChannel channel, int position) {
        holder.setText(R.id.title, "Image : " + channel.getTitle());
    }
}
