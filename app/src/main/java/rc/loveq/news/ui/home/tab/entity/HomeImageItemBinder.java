package rc.loveq.news.ui.home.tab.entity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.drakeet.multitype.ItemViewBinder;
import rc.loveq.news.R;

/**
 * Created by rc on 2018/1/23.
 * Description:
 */

public class HomeImageItemBinder extends ItemViewBinder<HomeImage, HomeImageItemBinder.ViewHolder> {
    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_home_text, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull HomeImage item) {
        holder.mTvTitle.setText("image : "+ item.mNewsChannel.getTitle());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView mTvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvTitle = itemView.findViewById(R.id.title);
        }
    }
}
