package rc.loveq.news.ui.home.tab.entity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import me.drakeet.multitype.ItemViewBinder;
import rc.loveq.news.R;

/**
 * Created by rc on 2018/1/23.
 * Description:
 */

public class HomeTextItemBinder extends ItemViewBinder<HomeText, HomeTextItemBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_home_text, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull HomeText item) {
        holder.mTvTitle.setText("text : " + item.mNewsChannel.getTitle());
        Glide.with(holder.mFivNewsImg).load(item.mNewsChannel.getImgsrc())
                .into(holder.mFivNewsImg);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTvTitle;
        public ImageView mFivNewsImg;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvTitle = itemView.findViewById(R.id.title);
            mFivNewsImg = itemView.findViewById(R.id.fiv_news_img);
        }
    }
}
