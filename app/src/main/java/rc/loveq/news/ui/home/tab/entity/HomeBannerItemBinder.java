package rc.loveq.news.ui.home.tab.entity;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.ItemViewBinder;
import rc.loveq.news.R;

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

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final RecyclerView mRecyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            mRecyclerView = itemView.findViewById(R.id.rv_home_banner);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(),
                    LinearLayoutManager.HORIZONTAL, false));
            HomeBannerAdapter homeBannerAdapter = new HomeBannerAdapter(itemView.getContext(), R.layout.item_home_banner_detail, null);
            mRecyclerView.setAdapter(homeBannerAdapter);
        }
    }


}
