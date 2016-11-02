package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ahmed.medical.MainActivity;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.ActivityUsersControl;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Insert_AddDepart extends Fragment implements View.OnClickListener {
    EditText Dep1,Dep2,Dep3,Dep4,Dep5,Dep6,Dep7,Dep8,Dep9,Dep10;
    TextInputLayout Dept1,Dept2,Dept3,Dept4,Dept5,Dept6,Dept7,Dept8,Dept9,Dept10;
    Spinner spinner1,spinner2;

    String[] arraySpinner1, arraySpinner2, arraySpinner,DdpartNumer;


    public Insert_AddDepart() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_add_department, container, false);
        component(v);
// Create an ArrayAdapter using the string array and a default spinner layout
        DdpartNumer = new String[]{
              "ادخل عدد الاقسام" , "1","2","3","4","5","6","7","8","9","10"};
        arraySpinner1 = new String[]{
                "اختر اسم الادارة"};
        arraySpinner2 = new String[]{
                "الادارة الاولى ", "الادارة الثانية"};

        List<String> list = new ArrayList<String>(Arrays.asList(arraySpinner1));
        list.addAll(Arrays.asList(arraySpinner2));
        Object[] c = list.toArray();
        arraySpinner = Arrays.copyOf(c, c.length, String[].class);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, arraySpinner);
        spinner1.setAdapter(adapter);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, DdpartNumer);
        spinner2.setAdapter(adapter1);

// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                String Dep = spinner2.getSelectedItem().toString();

               if(Dep.equals("1")){
                   System.out.println("MMss"+Dep+"");
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.GONE);
                   Dept3.setVisibility(View.GONE);
                   Dept4.setVisibility(View.GONE);
                   Dept5.setVisibility(View.GONE);
                   Dept6.setVisibility(View.GONE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("2")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.GONE);
                   Dept4.setVisibility(View.GONE);
                   Dept5.setVisibility(View.GONE);
                   Dept6.setVisibility(View.GONE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("3")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.GONE);
                   Dept5.setVisibility(View.GONE);
                   Dept6.setVisibility(View.GONE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("4")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.GONE);
                   Dept6.setVisibility(View.GONE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("5")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.GONE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("6")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.VISIBLE);
                   Dept7.setVisibility(View.GONE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("7")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.VISIBLE);
                   Dept7.setVisibility(View.VISIBLE);
                   Dept8.setVisibility(View.GONE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("8")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.VISIBLE);
                   Dept7.setVisibility(View.VISIBLE);
                   Dept8.setVisibility(View.VISIBLE);
                   Dept9.setVisibility(View.GONE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("9")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.VISIBLE);
                   Dept7.setVisibility(View.VISIBLE);
                   Dept8.setVisibility(View.VISIBLE);
                   Dept9.setVisibility(View.VISIBLE);
                   Dept10.setVisibility(View.GONE);
               }else if(Dep.equals("10")){
                   Dept1.setVisibility(View.VISIBLE);
                   Dept2.setVisibility(View.VISIBLE);
                   Dept3.setVisibility(View.VISIBLE);
                   Dept4.setVisibility(View.VISIBLE);
                   Dept5.setVisibility(View.VISIBLE);
                   Dept6.setVisibility(View.VISIBLE);
                   Dept7.setVisibility(View.VISIBLE);
                   Dept8.setVisibility(View.VISIBLE);
                   Dept9.setVisibility(View.VISIBLE);
                   Dept10.setVisibility(View.VISIBLE);
               }

            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        return v;

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.DdpartNum:

                break;
        }


    }

    public void component(View v){
        spinner1 = (Spinner) v.findViewById(R.id.MainManegment);
        spinner2 = (Spinner) v.findViewById(R.id.DdpartNum);
        Dep1=(EditText)v.findViewById(R.id.Dep1);
        Dep2=(EditText)v.findViewById(R.id.Dep2);
        Dep3=(EditText)v.findViewById(R.id.Dep3);
        Dep4=(EditText)v.findViewById(R.id.Dep4);
        Dep5=(EditText)v.findViewById(R.id.Dep5);
        Dep6=(EditText)v.findViewById(R.id.Dep6);
        Dep7=(EditText)v.findViewById(R.id.Dep7);
        Dep8=(EditText)v.findViewById(R.id.Dep8);
        Dep9=(EditText)v.findViewById(R.id.Dep9);
        Dep10=(EditText)v.findViewById(R.id.Dep10);
        Dept1=(TextInputLayout) v.findViewById(R.id.input_layout_password);
        Dept2=(TextInputLayout) v.findViewById(R.id.input_layout_password1);
        Dept3=(TextInputLayout) v.findViewById(R.id.input_layout_password3);
        Dept4=(TextInputLayout) v.findViewById(R.id.input_layout_password4);
        Dept5=(TextInputLayout) v.findViewById(R.id.input_layout_password5);
        Dept6=(TextInputLayout) v.findViewById(R.id.input_layout_password6);
        Dept7=(TextInputLayout) v.findViewById(R.id.input_layout_password7);
        Dept8=(TextInputLayout) v.findViewById(R.id.input_layout_password8);
        Dept9=(TextInputLayout) v.findViewById(R.id.input_layout_password9);
        Dept10=(TextInputLayout) v.findViewById(R.id.input_layout_password10);


    }


}
