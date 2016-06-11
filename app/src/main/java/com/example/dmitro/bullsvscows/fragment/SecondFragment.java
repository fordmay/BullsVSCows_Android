package com.example.dmitro.bullsvscows.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmitro.bullsvscows.R;

public class SecondFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_second;

    public static SecondFragment getInstance() {
        Bundle args = new Bundle();
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(args);

        return secondFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
