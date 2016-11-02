package com.example.ahmed.medical.MangmentAndDepartment.AddMangment.adapters;

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

import com.example.ahmed.medical.MangmentAndDepartment.AddMangment.modles.AddMangmentControl;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.models.disUserControl;

import java.util.List;

public class AddMangmentAdapter extends RecyclerView.Adapter<AddMangmentAdapter.MyViewHolder> {

    private List<AddMangmentControl> displayList;

    public AddMangmentAdapter(List<AddMangmentControl> displayList) {
        this.displayList = displayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.addmangmentrow, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        AddMangmentControl disUserControl = displayList.get(position);
        holder.serial.setText((position+1)+"");
        holder.name.setText(disUserControl.getName());
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
            serial = (TextView) view.findViewById(R.id.txt_serialDepName);
            name = (TextView) view.findViewById(R.id.DepName);
            swt = (SwitchCompat) view.findViewById(R.id.switchcomptMange);
            btn_delete = (Button) view.findViewById(R.id.btn_deleteAddMangment);
            btn_edit = (Button) view.findViewById(R.id.btn_editAddMangment);

        }
    }


}
