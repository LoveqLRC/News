package rc.loveq.news.ui.home.tab.entity;

import android.content.Context;

import com.bumptech.glide.Glide;

import java.util.List;

import rc.loveq.baselib.ui.adapter.BaseAdapter;
import rc.loveq.baselib.ui.adapter.base.ViewHolder;
import rc.loveq.baselib.ui.widget.FourThreeImageView;
import rc.loveq.news.R;
import rc.loveq.news.data.api.news.model.NewsChannel;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeBannerAdapter extends BaseAdapter<NewsChannel.AdsBean> {

    public HomeBannerAdapter(Context context, int layoutId, List<NewsChannel.AdsBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, NewsChannel.AdsBean adsBean, int position) {
        FourThreeImageView bannerView = holder.getView(R.id.ftiv_banner);
        Glide.with(bannerView).load(adsBean.getImgsrc())
                .into(bannerView);
        holder.setText(R.id.tv_banner_title, adsBean.getTitle());
    }
}
