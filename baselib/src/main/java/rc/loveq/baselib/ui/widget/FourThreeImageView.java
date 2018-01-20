package rc.loveq.baselib.ui.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by rc on 2018/1/20.
 * Description:
 */

public class FourThreeImageView extends ForegroundImageView {
    public FourThreeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int fourThreeHeight = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthSpec) * 3 / 4,
                MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, fourThreeHeight);
    }

}
