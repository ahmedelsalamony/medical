package com.example.ahmed.medical.systemManagment.adapters;

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
import android.widget.Toast;

import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.models.*;

import java.util.List;

import static java.security.AccessController.getContext;

public class disUserControlAdapter extends RecyclerView.Adapter<disUserControlAdapter.MyViewHolder> {

    private List<disUserControl> displayList;

    public disUserControlAdapter(List<disUserControl> displayList) {
        this.displayList = displayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dis_user_control_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        disUserControl disUserControl = displayList.get(position);
        holder.serial.setText(Integer.toString(disUserControl.getSerial()));
        holder.name.setText(disUserControl.getName());
        holder.lastvist.setText(disUserControl.getLastvisit());
        holder.swt.setChecked(disUserControl.isActive());
        holder.swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (compoundButton.getId()) {

                    case R.id.switchcompt:

                        if (!b) {

                            System.out.println("hello i am off");

                        } else {

                            System.out.println("hello i am on");
                        }
                        break;

                    default:
                        break;
                }
            }
        });
        holder.btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("edit button click listener");
            }
        });
        holder.btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("delete button click listener");
            }
        });
    }

    @Override
    public int getItemCount() {
        return displayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView serial, name, lastvist;
        public SwitchCompat swt;
        public Button btn_delete, btn_edit;

        public MyViewHolder(View view) {
            super(view);
            serial = (TextView) view.findViewById(R.id.txt_serial);
            name = (TextView) view.findViewById(R.id.txt_name);
            lastvist = (TextView) view.findViewById(R.id.txt_date);
            swt = (SwitchCompat) view.findViewById(R.id.switchcompt);
            btn_delete = (Button) view.findViewById(R.id.btn_delete);
            btn_edit = (Button) view.findViewById(R.id.btn_edit);

        }
    }


}
