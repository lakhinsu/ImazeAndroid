package com.example.imazeandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new tech_fragment()).commit();
    }
    // Buttom Navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    //Organise Fragment while selecting
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.nav_tech:
                            selectedFragment = new tech_fragment();
                            break;
                        case R.id.nav_nontech:
                            selectedFragment = new nontech_fragment();
                            break;
                        case R.id.nav_user:
                            selectedFragment = new acc_fragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,
                            selectedFragment).commit();

                    return true;
                }

            };
    public void onBackPressed(){
        finish();
    }
    }

