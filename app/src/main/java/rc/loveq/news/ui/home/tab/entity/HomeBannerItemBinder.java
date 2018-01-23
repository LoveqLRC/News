package rc.loveq.news.ui.home.tab.entity;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.ItemViewBinder;
import rc.loveq.news.R;
import rc.loveq.news.data.api.news.model.NewsChannel;
import rc.loveq.news.ui.home.tab.adapter.HomeBannerAdapter;

/**
 * Created by rc on 2018/1/22.
 * Description:
 */

public class HomeBannerItemBinder extends ItemViewBinder<HomeBanner, HomeBannerItemBinder.ViewHolder> {
    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_home_banner, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull HomeBanner item) {
        holder.setBanners(item.mNewsChannel.getAds());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final RecyclerView mRecyclerView;
        private List<NewsChannel.AdsBean> mAdsBeanList;
        private final HomeBannerAdapter mHomeBannerAdapter;

        public ViewHolder(View itemView) {
            super(itemView);
            mAdsBeanList = new ArrayList<>();

            mRecyclerView = itemView.findViewById(R.id.rv_home_banner);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(),
                    LinearLayoutManager.HORIZONTAL, false));
            mHomeBannerAdapter = new HomeBannerAdapter(itemView.getContext(),
                    R.layout.item_home_banner_detail, mAdsBeanList);
            mRecyclerView.setAdapter(mHomeBannerAdapter);
        }

        public void setBanners(List<NewsChannel.AdsBean> mlist) {
            mAdsBeanList.addAll(mlist);
            mHomeBannerAdapter.notifyDataSetChanged();
        }

    }


}
