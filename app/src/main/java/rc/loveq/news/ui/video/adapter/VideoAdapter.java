package rc.loveq.news.ui.video.adapter;

import android.content.Context;

import java.util.List;

import rc.loveq.baselib.ui.adapter.MultiItemTypeAdapter;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public class VideoAdapter extends MultiItemTypeAdapter<Eyepetizer.ItemListBean> {

    public VideoAdapter(Context context, List<Eyepetizer.ItemListBean> datas) {
        super(context, datas);
        addItemViewDelegate(new TextCardDelegate());
        addItemViewDelegate(new FollowCardDelegate());
//        addItemViewDelegate(new VideoSmallCardDelegate());
    }
}
