package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters;

/**
 * Created by ahmed on 10/20/2016.
 */

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.MainControlDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.SecondControlDepartment;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.models.disUserControl;

import java.util.ArrayList;
import java.util.List;

public class MainAdapterDepartment extends RecyclerView.Adapter<MainAdapterDepartment.MyViewHolder> {

    private List<MainControlDepartment> displayList;
    private List<SecondControlDepartment> disList = new ArrayList<>();

    private SecondAdapterDepartment mAdapter;

    public MainAdapterDepartment(List<MainControlDepartment> displayList) {
        this.displayList = displayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adddepartmentrow1, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        MainControlDepartment disUserControl = displayList.get(position);
        holder.serial.setText(Integer.toString(disUserControl.getSerial()));
        holder.name.setText(disUserControl.getName());

//back

    }

    @Override
    public int getItemCount() {
        return displayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView serial, name;
        public RecyclerView recyclerView1;


        public MyViewHolder(View view) {
            super(view);
            serial = (TextView) view.findViewById(R.id.num);
            name = (TextView) view.findViewById(R.id.namedep);

            recyclerView1 = (RecyclerView) view.findViewById(R.id.recycler_viewDisDep2);
            mAdapter = new SecondAdapterDepartment(disList);

            RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(view.getContext());
            recyclerView1.setLayoutManager(mLayoutManager1);
            recyclerView1.setItemAnimator(new DefaultItemAnimator());
            recyclerView1.setAdapter(mAdapter);
            prepareMovieData();


        }
    }

        private void prepareMovieData() {


        String[] serials = {"احمد عبدالحميد شعبان السلامونى"};


        for (int x = 0; x <1; x++) {
            SecondControlDepartment disUserControl = new SecondControlDepartment(serials[x]);
            disList.add(disUserControl);
            mAdapter.notifyDataSetChanged();


        }
    }


}
