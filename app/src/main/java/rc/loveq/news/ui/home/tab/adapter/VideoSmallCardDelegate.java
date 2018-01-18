package rc.loveq.news.ui.home.tab.adapter;

import android.text.TextUtils;

import rc.loveq.baselib.ui.adapter.ItemViewDelegate;
import rc.loveq.baselib.ui.adapter.ViewHolder;
import rc.loveq.news.R;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/18.
 * Description:
 */

public class VideoSmallCardDelegate implements ItemViewDelegate<Eyepetizer.ItemListBean> {

    public static final String VIDEO_SMALL_CARD_DELEGATE = "videoSmallCard";

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_video_small_card;
    }

    @Override
    public boolean isForViewType(Eyepetizer.ItemListBean item, int position) {
        return TextUtils.equals(item.getType(), VIDEO_SMALL_CARD_DELEGATE);
    }

    @Override
    public void convert(ViewHolder holder, Eyepetizer.ItemListBean bean, int position) {

    }
}