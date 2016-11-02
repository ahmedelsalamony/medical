package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters.MainAdapterDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters.MultipleRowAdapter;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters.SecondAdapterDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.MainControlDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.SecondControlDepartment;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.adapters.disUserControlAdapter;
import com.example.ahmed.medical.systemManagment.models.disUserControl;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Display_AddDepartment extends Fragment {

    View v;
    private List<SecondControlDepartment> disList1 = new ArrayList<>();

    private SecondAdapterDepartment mAdapter1;
    private List<MainControlDepartment> disList = new ArrayList<>();
    private RecyclerView recyclerView,recyclerView1;
    private MainAdapterDepartment mAdapter;

    public Display_AddDepartment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_add_departmentf, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_viewDisDep);
        mAdapter = new MainAdapterDepartment(disList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

        return v;
    }



    private void prepareMovieData() {

        int[] serials = {1, 2, 3, 4, 5};
        String[] names = {"احمد عبدالحميد شعبان السلامونى", "احمد عبدالحميد شعبان السلامونى", "احمد عبدالحميد شعبان السلامونى"
                , "احمد عبدالحميد شعبان السلامونى", "احمد عبدالحميد شعبان السلامونى"};



        for (int x = 0; x < serials.length; x++) {
            MainControlDepartment disUserControl = new MainControlDepartment(serials[x], names[x]);
            disList.add(disUserControl);
            mAdapter.notifyDataSetChanged();


        }
    }

}
