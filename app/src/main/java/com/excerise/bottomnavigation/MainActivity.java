package com.excerise.bottomnavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.excerise.bottomnavigation.adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;

    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        bottomNavigationView = findViewById(R.id.navigation);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),4);
        viewPager.setAdapter(viewPagerAdapter);
        floatingActionButton = findViewById(R.id.floating);

        floatingActionButton.setOnClickListener(v ->{

            Toast.makeText(this,"Bạn chọn tôi à",Toast.LENGTH_SHORT).show();
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0: bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                    break;
                    case 1: bottomNavigationView.getMenu().findItem(R.id.noti).setChecked(true);
                        break;
                    case 2: bottomNavigationView.getMenu().findItem(R.id.search).setChecked(true);
                        break;
                    case 3: bottomNavigationView.getMenu().findItem(R.id.cafe).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    viewPager.setCurrentItem(0);
                }
                else if (item.getItemId() == R.id.noti) {
                    viewPager.setCurrentItem(1);
                }
                else if (item.getItemId() == R.id.search) {
                    viewPager.setCurrentItem(2);
                }
                else if (item.getItemId() == R.id.cafe) {
                    viewPager.setCurrentItem(3);
                }
                return true;
            }
        });

    }
}