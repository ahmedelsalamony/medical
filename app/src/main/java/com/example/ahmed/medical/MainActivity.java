package com.example.ahmed.medical;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.ahmed.medical.BlurImage.BlurBuilder;
import com.example.ahmed.medical.systemManagment.ActivityUsersControl;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    Typeface typeface;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        typeface = Typeface.createFromAsset(getAssets(), "fonts/DroidKufi-Bold.ttf");
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

        TextView t1 = (TextView) findViewById(R.id.text1);
        TextView t2 = (TextView) findViewById(R.id.text2);
        TextView t3 = (TextView) findViewById(R.id.text3);
        TextView t4 = (TextView) findViewById(R.id.text4);
        TextView t5 = (TextView) findViewById(R.id.text5);
        t1.setTypeface(typeface);
        t2.setTypeface(typeface);
        t3.setTypeface(typeface);
        t4.setTypeface(typeface);
        t5.setTypeface(typeface);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       /* Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(min((int) Math.floor((width-40) / 2),(int) Math.floor((height-40) / 3)), min((int) Math.floor((width-40) / 2),(int) Math.floor((height-40) / 3)));

       *//* t1.setLayoutParams(layoutParams);
        t2.setLayoutParams(layoutParams);
        t3.setLayoutParams(layoutParams);
        t4.setLayoutParams(layoutParams);
        t5.setLayoutParams(layoutParams);*/
/////////////////////////////////////////////////////////////////////////////////////////////////
        //blur images
      /* View view=findViewById(R.id.activity_main);
        Bitmap bitmap = BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.back);


        Bitmap blurredBitmap = BlurBuilder.blur(getApplication(), bitmap );

        view.setBackgroundDrawable( new BitmapDrawable( getResources(), blurredBitmap ) );*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {

            case R.id.text1:
                i = new Intent(MainActivity.this, ActivityUsersControl.class);
                startActivity(i);
                break;
            case R.id.text2:
                i = new Intent(MainActivity.this, ActivityUsersControl.class);
                startActivity(i);
                break;

            case R.id.text3:
                i = new Intent(MainActivity.this, ActivityUsersControl.class);
                startActivity(i);
                break;
            case R.id.text4:
                i = new Intent(MainActivity.this, ActivityUsersControl.class);
                startActivity(i);
                break;
            case R.id.text5:
                i = new Intent(MainActivity.this, ActivityUsersControl.class);
                startActivity(i);
                break;
        }
    }
}
