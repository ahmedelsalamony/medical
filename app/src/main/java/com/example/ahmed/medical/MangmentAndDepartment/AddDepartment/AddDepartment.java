package com.example.ahmed.medical.MangmentAndDepartment.AddDepartment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmed.medical.R;
import com.example.ahmed.medical.systemManagment.ActivityUsersControl;
import com.example.ahmed.medical.systemManagment.Display_UserControl;
import com.example.ahmed.medical.systemManagment.Insert_UsersControl;

import java.util.ArrayList;
import java.util.List;

public class AddDepartment extends AppCompatActivity {

    public int[] tabIcons = {
            R.drawable.db, R.drawable.enteringdata
    };
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_department);
    /////////////////////////////////////////////////////////////////



        viewPager = (ViewPager) findViewById(R.id.viewpagerAddDepartment);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabsAddDepartment);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    private void setupViewPager(ViewPager viewPager) {
        AddDepartment.ViewPagerAdapter adapter = new AddDepartment.ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new Display_AddDepartment(), "قائمة البيانات");
        adapter.addFrag(new Insert_AddDepart(), "اضافة جديد");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
