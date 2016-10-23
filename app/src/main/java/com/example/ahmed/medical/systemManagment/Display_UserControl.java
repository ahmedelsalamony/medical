package com.example.ahmed.medical.systemManagment;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.adapters.disUserControlAdapter;
import com.example.ahmed.medical.systemManagment.models.disUserControl;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmed on 10/19/2016.
 */

public class Display_UserControl extends Fragment {

    View v;
    private List<disUserControl> disList = new ArrayList<>();
    private RecyclerView recyclerView;
    private disUserControlAdapter mAdapter;


    public Display_UserControl() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.display_users_control, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        mAdapter = new disUserControlAdapter(disList);
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

        String[] dates = {"20/1/2016", "20/1/2016", "20/1/2016", "20/1/2016", "20/1/2016"};

        for (int x = 0; x < serials.length; x++) {
            disUserControl disUserControl = new disUserControl(serials[x], names[x], true, dates[x]);
            disList.add(disUserControl);
            mAdapter.notifyDataSetChanged();


        }
    }


}
