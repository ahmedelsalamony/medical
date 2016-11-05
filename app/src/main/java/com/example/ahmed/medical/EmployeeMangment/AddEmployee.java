package com.example.ahmed.medical.EmployeeMangment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ahmed.medical.BlurImage.TypefaceUtil;
import com.example.ahmed.medical.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class AddEmployee extends AppCompatActivity implements View.OnClickListener {
    private int year, month, day;
    EditText Date;
    private static final int ID_Dialog = 0;
    private static DatePickerDialog.OnDateSetListener FetchDate;
    EditText Birthemp, Medto, Medfrom, to2, from2, to3,from3, to4, from4;
    View v;
    TextInputLayout input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13;
    Spinner kindemp, Mangeemp, DepNameemp, Workemp;
    String[] spiner1,spiner2,spiner3,spiner4,spiner5,spiner6,spiner7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        spiner1=new String[]{"المسمى الوظيفى"};
        spiner2=new String[]{"hg]hjh fd. "};

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        componant();
        font();
        click();
        getDate();
        //DialogDate
        FetchDate = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                year = i;
                month = i1;
                day = i2;
                Date.setText(year + "/" + month + "/" + day);
            }
        };
    }

    public void componant() {
        Birthemp = (EditText) findViewById(R.id.Birthemp);
        Medto = (EditText) findViewById(R.id.Medto);
        Medfrom = (EditText) findViewById(R.id.Medfrom);
        to2 = (EditText) findViewById(R.id.to2);
        from2 = (EditText) findViewById(R.id.from2);
        to3 = (EditText) findViewById(R.id.to3);
        from3 = (EditText) findViewById(R.id.from3);
        to4 = (EditText) findViewById(R.id.to4);
        from4 = (EditText) findViewById(R.id.from4);
        kindemp=(Spinner)findViewById(R.id.kindemp);
        Mangeemp=(Spinner)findViewById(R.id.Mangeemp);
        DepNameemp=(Spinner)findViewById(R.id.DepNameemp);
        Workemp=(Spinner)findViewById(R.id.Workemp);
        v = findViewById(R.id.activity_add_employee);
        input1 = (TextInputLayout) findViewById(R.id.input1);
        input2 = (TextInputLayout) findViewById(R.id.input2);
        input3 = (TextInputLayout) findViewById(R.id.input3);
        input4 = (TextInputLayout) findViewById(R.id.input4);
        input5 = (TextInputLayout) findViewById(R.id.input5);
        input6 = (TextInputLayout) findViewById(R.id.input6);
        input7 = (TextInputLayout) findViewById(R.id.input7);
        input8 = (TextInputLayout) findViewById(R.id.input8);
        input9 = (TextInputLayout) findViewById(R.id.input9);
        input10 = (TextInputLayout) findViewById(R.id.input10);
        input11 = (TextInputLayout) findViewById(R.id.input11);
        input12 = (TextInputLayout) findViewById(R.id.input12);
        input13 = (TextInputLayout) findViewById(R.id.input13);


    }

    public void click() {
        Birthemp.setOnClickListener(this);
        Medfrom.setOnClickListener(this);
        Medto.setOnClickListener(this);
        to2.setOnClickListener(this);
        to3.setOnClickListener(this);
        to4.setOnClickListener(this);
        from2.setOnClickListener(this);
        from3.setOnClickListener(this);
        from4.setOnClickListener(this);

        input1.setOnClickListener(this);


    }

    public void font() {

        TypefaceUtil.overrideFonts(getApplicationContext(), v);


    }

    public void getDate() {
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);

    }
    public void SpinnerDate(String[]array1, String arry2, Spinner s){
        String []arraySpinner;
        List<String> list = new ArrayList<String>(Arrays.asList(array1));
        list.addAll(Arrays.asList(arry2));
        Object[] c = list.toArray();
        arraySpinner = Arrays.copyOf(c, c.length, String[].class);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 0:
                return new DatePickerDialog(this, FetchDate, year, month, day);
        }
        return null;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.Birthemp:
                showDialog(ID_Dialog);
               Date= Birthemp;
                break;
            case R.id.Medto:
                showDialog(ID_Dialog);
                Date=Medto;
                break;
            case R.id.Medfrom:
                showDialog(ID_Dialog);
               Date= Medfrom;
                break;
            case R.id.to2:
                showDialog(ID_Dialog);
                Date=to2;
                break;
            case R.id.from2:
                showDialog(ID_Dialog);
                Date=from2;
                break;
            case R.id.to3:
                showDialog(ID_Dialog);
                Date=to3;
                break;
            case R.id.from3:
                showDialog(ID_Dialog);
               Date= from3;
                break;
            case R.id.to4:
                showDialog(ID_Dialog);
                Date=to4;
                break;
            case R.id.from4:
                showDialog(ID_Dialog);
               Date= from4;
                break;
            case R.id.input1:

                break;

        }
    }


}
