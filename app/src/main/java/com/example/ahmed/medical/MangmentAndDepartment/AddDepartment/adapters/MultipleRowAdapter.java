package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.MainControlDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.MultipleRowControl;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.modles.SecondControlDepartment;
import com.example.ahmed.medical.R;

import java.util.List;

/**
 * Created by ok on 29/10/2016.
 */
public class MultipleRowAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<MainControlDepartment> displayList;
    private List<SecondControlDepartment> displayList1;

    public MultipleRowAdapter(List<MainControlDepartment> displayList) {
        this.displayList = displayList;
        //this.displayList1 = displayList1;
         }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType %2== 0) {
            return new AdsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adddepartmentrow2, parent, false));
        } else {
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adddepartmentrow1, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int item = getItemViewType(position);
        if (item%2==0) {
         //   AdsHolder adsHolder = (AdsHolder) holder;
            MyViewHolder m = (MyViewHolder) holder;
            SecondControlDepartment disUserControl1 = displayList1.get(position);
            m.serial.setText(disUserControl1.getSerial1());
        } else {

            MyViewHolder m = (MyViewHolder) holder;

            MainControlDepartment disUserControl = displayList.get(position);
            m.serial.setText(Integer.toString(disUserControl.getSerial()));
            m.name.setText(disUserControl.getName());

        }
    }

    @Override
    public int getItemCount() {
        return displayList.size();
    }

    @Override
    public int getItemViewType(int position) {


            return super.getItemViewType(position);

    }


        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView serial, name,serial1;


            public MyViewHolder(View view) {
                super(view);
                serial = (TextView) view.findViewById(R.id.num);
                name = (TextView) view.findViewById(R.id.namedep);
                serial = (TextView) view.findViewById(R.id.muldep);
                System.out.println("rrrr");



            }
    }

    public class AdsHolder extends RecyclerView.ViewHolder {

        public AdsHolder(View itemView) {
            super(itemView);
        }
    }
}
