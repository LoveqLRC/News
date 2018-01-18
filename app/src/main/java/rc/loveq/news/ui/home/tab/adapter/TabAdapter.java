package rc.loveq.news.ui.home.tab.adapter;

import android.content.Context;

import java.util.List;

import rc.loveq.baselib.ui.adapter.MultiItemTypeAdapter;
import rc.loveq.news.data.api.eyepetizer.model.Eyepetizer;

/**
 * Created by rc on 2018/1/17.
 * Description:
 */

public class TabAdapter extends MultiItemTypeAdapter<List<Eyepetizer.ItemListBean>> {
    public TabAdapter(Context context, List<List<Eyepetizer.ItemListBean>> datas) {
        super(context, datas);

    }
}
