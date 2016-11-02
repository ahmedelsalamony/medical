package com.example.ahmed.medical.MangmentAndDepartment;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahmed.medical.MainActivity;
import com.example.ahmed.medical.MangmentAndDepartment.AddDepartment.AddDepartment;
import com.example.ahmed.medical.MangmentAndDepartment.AddMangment.AddMangment;
import com.example.ahmed.medical.MangmentAndDepartment.JobsName.JobsName;
import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.ActivityUsersControl;


public class MangmentAndDepartment extends AppCompatActivity implements View.OnClickListener{
    TextView Department,Mangment,job;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangment_and_department);
     typeface=   Typeface.createFromAsset(getAssets(), "fonts/DroidKufi-Bold.ttf");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView t = (TextView) toolbar.findViewById(R.id.toolbar_title);
        // t.setTypeface(button);
        t.setText(Html.fromHtml("<strong>عقـــــاري </strong>"));
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        TextView main = (TextView) navigationView.findViewById(R.id.main);
        TextView main1 = (TextView) navigationView.findViewById(R.id.main1);
        TextView main2 = (TextView) navigationView.findViewById(R.id.main2);
        TextView main3 = (TextView) navigationView.findViewById(R.id.main3);
        TextView main4 = (TextView) navigationView.findViewById(R.id.main4);

        main.setTypeface(typeface);
        main1.setTypeface(typeface);
        main2.setTypeface(typeface);
        main3.setTypeface(typeface);
        main4.setTypeface(typeface);



        Department=(TextView)findViewById(R.id.Department);
        Mangment=(TextView)findViewById(R.id.Mangment);
        job=(TextView)findViewById(R.id.Job);
        Department.setTypeface(typeface);
        job.setTypeface(typeface);
        Mangment.setTypeface(typeface);
        Department.setOnClickListener(this);
        Mangment.setOnClickListener(this);
        job.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.Department:
                i = new Intent(MangmentAndDepartment.this, AddDepartment.class);
                startActivity(i);
                break;
            case R.id.Mangment:
                i = new Intent(MangmentAndDepartment.this, AddMangment.class);
                startActivity(i);
                break;

            case R.id.Job:
                i = new Intent(MangmentAndDepartment.this, JobsName.class);
                startActivity(i);
                break;
        }


        }
}
