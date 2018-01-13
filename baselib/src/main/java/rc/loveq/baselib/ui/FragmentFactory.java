package rc.loveq.baselib.ui;

/**
 * Author：Rc
 * 0n 2018/1/13 17:07
 */

public class FragmentFactory {
    public static <T extends BaseFragment> T createFragment(Class<T> clz) {
        BaseFragment fragment = null;
        try {
            fragment = ((BaseFragment) Class.forName(clz.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) fragment;
    }
}
