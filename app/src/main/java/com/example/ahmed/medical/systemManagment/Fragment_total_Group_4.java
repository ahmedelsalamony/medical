package com.example.ahmed.medical.systemManagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.adapters.AdapterDisGroup;
import com.example.ahmed.medical.systemManagment.adapters.AdapterDisGrouptotal;
import com.example.ahmed.medical.systemManagment.models.fragDisGroup;
import com.example.ahmed.medical.systemManagment.models.fragDisGrouptotal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmed on 10/24/2016.
 */

public class Fragment_total_Group_4 extends Fragment{

    View v;
    private List<fragDisGrouptotal> disList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AdapterDisGrouptotal mAdapter;

    public Fragment_total_Group_4() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_total_group, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        mAdapter = new AdapterDisGrouptotal(disList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
        return v;
    }
    private void prepareMovieData() {

        int[] serials = {1, 2, 3, 4, 5};
        String[] names = {"عرض الهدف", "نوع الهدف", "الشئون الادارية"
                , "الادارات ولاقسام", "ادارة النظام"};

        String[] link = {"يمين", "اعلى", "يمين", "اعلى", "يمين"};

        for (int x = 0; x < serials.length; x++) {
            fragDisGrouptotal fragDisGrouptotal = new fragDisGrouptotal(names[x],  link[x],serials[x]);
            disList.add(fragDisGrouptotal);
            mAdapter.notifyDataSetChanged();


        }
    }
}
