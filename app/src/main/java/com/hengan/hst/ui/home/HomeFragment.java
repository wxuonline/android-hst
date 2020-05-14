package com.hengan.hst.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hengan.hst.MainActivity;
import com.hengan.hst.R;
import com.hengan.hst.common.GoodsListLayoutAdaper;

import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private String TAG = "log home -> ";
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView headerTitle = (ImageView) root.findViewById(R.id.home_title);
        ViewGroup.MarginLayoutParams mp = (ViewGroup.MarginLayoutParams) headerTitle.getLayoutParams();
        MainActivity mainActivity = (MainActivity) getActivity();
        mp.topMargin = mainActivity.getStatusBarHeight(getContext());
        headerTitle.setLayoutParams(mp);

        recyclerView = (RecyclerView) root.findViewById(R.id.goods_list);

        View listTitle = (View) inflater.inflate(R.layout.list_title, null, false);
//        List<String> data = initData();
        RecyclerView rv = (RecyclerView) root.findViewById(R.id.goods_list);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new GoodsListLayoutAdaper(getContext()));


        return root;
    }



}
