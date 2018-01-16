package rc.loveq.news.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;

import java.util.List;

import rc.loveq.baselib.ui.BaseActivity;
import rc.loveq.baselib.utils.permission.PermissionConstants;
import rc.loveq.baselib.utils.permission.PermissionUtils;
import rc.loveq.news.R;

public class SearchActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }

    public void request(View view) {
        PermissionUtils.permission(PermissionConstants.STORAGE)
                .rationale(new PermissionUtils.OnRationaleListener() {
                    @Override
                    public void rationale(final ShouldRequest shouldRequest) {
                        new AlertDialog.Builder(SearchActivity.this)
                                .setTitle(android.R.string.dialog_alert_title)
                                .setMessage(rc.loveq.baselib.R.string.permission_rationale_message)
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        shouldRequest.again(true);
                                    }
                                })
                                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        shouldRequest.again(false);
                                    }
                                })
                                .setCancelable(false)
                                .create()
                                .show();
                    }
                })
                .callback(new PermissionUtils.FullCallback() {
                    @Override
                    public void onGranted(List<String> permissionsGranted) {
                    }

                    @Override
                    public void onDenied(List<String> permissionsDeniedForever,
                                         List<String> permissionsDenied) {
                        if (!permissionsDeniedForever.isEmpty()) {
                            new AlertDialog.Builder(SearchActivity.this)
                                    .setTitle(android.R.string.dialog_alert_title)
                                    .setMessage(rc.loveq.baselib.R.string.permission_denied_forever_message)
                                    .setPositiveButton(android.R.string.ok, (dialog, which) -> PermissionUtils.openAppSettings())
                                    .setNegativeButton(android.R.string.cancel, (dialog, which) -> {

                                    })
                                    .setCancelable(false)
                                    .create()
                                    .show();
                        }
                    }
                })
                .request();
    }
}
