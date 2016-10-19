package com.example.ahmed.medical;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.ahmed.medical.R.attr.height;
import static com.example.ahmed.medical.R.id.top;
import static java.lang.Math.min;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        TextView t1=(TextView)findViewById(R.id.text1);
        TextView t2=(TextView)findViewById(R.id.text2);
        TextView t3=(TextView)findViewById(R.id.text3);
        TextView t4=(TextView)findViewById(R.id.text4);
        TextView t5=(TextView)findViewById(R.id.text5);


        Display display =((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        int height=display.getHeight();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(min((width-50)/2,(height-50)/3) , min((width-50)/2,(height-50)/3));

        t1.setLayoutParams(layoutParams);
        t2.setLayoutParams(layoutParams);
        t3.setLayoutParams(layoutParams);
        t4.setLayoutParams(layoutParams);
        t5.setLayoutParams(layoutParams);


    }
}
