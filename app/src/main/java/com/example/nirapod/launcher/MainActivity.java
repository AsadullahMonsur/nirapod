package com.example.nirapod.launcher;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.nirapod.R;
import com.example.nirapod.other.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer_layout;
    private ActionBarDrawerToggle dtog;

    TabLayout tab_layout;
    ViewPager2 viewer_pager2;
    ViewPagerAdapter view_pager_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        tab_layout = findViewById(R.id.tab_layout_id);
        viewer_pager2 = findViewById(R.id.viewerpager_id);
        view_pager_adapter = new ViewPagerAdapter(this);
        viewer_pager2.setAdapter(view_pager_adapter);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewer_pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewer_pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tab_layout.getTabAt(position).select();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        drawer_layout= findViewById(R.id.drawer_id);
        dtog = new ActionBarDrawerToggle(this,
                drawer_layout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close);

        drawer_layout.addDrawerListener(dtog);
        dtog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.correct), PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.notification_id){

        }

        return true;
    }
}
