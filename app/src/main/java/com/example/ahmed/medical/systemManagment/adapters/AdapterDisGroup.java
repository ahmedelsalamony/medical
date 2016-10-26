package com.example.ahmed.medical.systemManagment.adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.models.disUserControl;
import com.example.ahmed.medical.systemManagment.models.fragDisGroup;

import java.util.List;

/**
 * Created by ahmed on 10/25/2016.
 */

public class AdapterDisGroup extends RecyclerView.Adapter<AdapterDisGroup.MyViewHolder> {

    private List<fragDisGroup> displayList;

    public AdapterDisGroup(List<fragDisGroup> displayList) {
        this.displayList = displayList;
    }

    @Override
    public AdapterDisGroup.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_fragment_display_group, parent, false);

        return new AdapterDisGroup.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AdapterDisGroup.MyViewHolder holder, int position) {

        fragDisGroup disUserControl = displayList.get(position);
        holder.gname.setText(disUserControl.getGroupName());
        holder.link.setText(disUserControl.getGroupPlace());
        holder.sort.setText(Integer.toString(disUserControl.getSort()));
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
        public TextView sort, gname, link;
        public Button btn_delete, btn_edit;

        public MyViewHolder(View view) {
            super(view);
            sort = (TextView) view.findViewById(R.id.txt_serial);
            gname = (TextView) view.findViewById(R.id.txt_groupname);
            link = (TextView) view.findViewById(R.id.txt_linkplace);
            btn_delete = (Button) view.findViewById(R.id.btn_delete);
            btn_edit = (Button) view.findViewById(R.id.btn_edit);

        }
    }
}
