package rc.loveq.news.ui;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import rc.loveq.baselib.BaseActivity;
import rc.loveq.baselib.adapter.MyAdapter;
import rc.loveq.baselib.bottomnavigation.BottomNavigationViewHelper;
import rc.loveq.news.R;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setupToolbar();
        setupNavigationView();
        RecyclerView recyclerView = findViewById(R.id.container);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bnv_bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
    }

    @Override
    protected void initData() {

    }
}
