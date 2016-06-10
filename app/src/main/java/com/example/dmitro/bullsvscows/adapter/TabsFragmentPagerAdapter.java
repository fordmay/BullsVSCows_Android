package com.example.dmitro.bullsvscows.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dmitro.bullsvscows.fragment.FirstFragment;
import com.example.dmitro.bullsvscows.fragment.SecondFragment;

public class TabsFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] tabs = new String[]{"Tab 1", "Tab 2"};;
    private Context context;

    public TabsFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.getInstance();
            case 1:
                return SecondFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
