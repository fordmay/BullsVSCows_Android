package com.example.dmitro.bullsvscows.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmitro.bullsvscows.R;

public class FirstFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_first;

    public static FirstFragment getInstance() {
        Bundle args = new Bundle();
        FirstFragment firstFragment = new FirstFragment();
        firstFragment.setArguments(args);

        return firstFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
