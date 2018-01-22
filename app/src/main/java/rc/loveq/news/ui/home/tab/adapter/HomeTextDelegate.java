package rc.loveq.news.ui.home.tab.adapter;

import rc.loveq.baselib.ui.adapter.base.ItemViewDelegate;
import rc.loveq.baselib.ui.adapter.base.ViewHolder;
import rc.loveq.news.R;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeTextDelegate implements ItemViewDelegate<NewsChannel> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_home_text;
    }

    @Override
    public boolean isForViewType(NewsChannel item, int position) {
        return true;
    }

    @Override
    public void convert(ViewHolder holder, NewsChannel channel, int position) {
        holder.setText(R.id.title,"text : "+ channel.getTitle());
    }
}
