package com.example.dmitro.bullsvscows;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.dmitro.bullsvscows.adapter.TabsFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
        initTab();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
    }

    private void initTab() {
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        TabsFragmentPagerAdapter tabsFragmentPagerAdapter = new TabsFragmentPagerAdapter(
                getSupportFragmentManager(),
                MainActivity.this
        );
        viewPager.setAdapter(tabsFragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
