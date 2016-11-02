package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters;

/**
 * Created by ahmed on 10/20/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.SecondControlDepartment;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.models.disUserControl;

import java.util.List;

public class SecondAdapterDepartment extends RecyclerView.Adapter<SecondAdapterDepartment.MyViewHolder> {

    private List<SecondControlDepartment> displayList;

    public SecondAdapterDepartment(List<SecondControlDepartment> displayList) {
        this.displayList = displayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adddepartmentrow2, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        SecondControlDepartment disUserControl = displayList.get(position);
        holder.serial.setText(disUserControl.getSerial1());

    }

    @Override
    public int getItemCount() {
        return displayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView serial;


        public MyViewHolder(View view) {
            super(view);
            serial = (TextView) view.findViewById(R.id.muldep);

        }
    }


}
