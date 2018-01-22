package rc.loveq.news.ui.video.adapter;

import android.text.TextUtils;

import rc.loveq.baselib.ui.adapter.base.ItemViewDelegate;
import rc.loveq.baselib.ui.adapter.base.ViewHolder;
import rc.loveq.news.R;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/18.
 * Description:
 */

public class TextCardDelegate implements ItemViewDelegate<Eyepetizer.ItemListBean> {
    public static final String TEXT_CARD_DELEGATE = "textCard";

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_text_card;
    }

    @Override
    public boolean isForViewType(Eyepetizer.ItemListBean item, int position) {
        return TextUtils.equals(item.getType(), TEXT_CARD_DELEGATE);
    }

    @Override
    public void convert(ViewHolder holder, Eyepetizer.ItemListBean bean, int position) {
        holder.setText(R.id.tv_title, bean.getData().getText());
    }
}
