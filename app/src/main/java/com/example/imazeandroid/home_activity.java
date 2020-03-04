package com.example.imazeandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.imazeandroid.Fragments.nontech_fragment;
import com.example.imazeandroid.Fragments.other_fragment;
import com.example.imazeandroid.Fragments.tech_fragment;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.acc_activity:
                Intent i =new Intent(this,account.class);
                startActivity(i);
                break;
            case R.id.exit_app:
                finish();
                break;
        }
       return super.onOptionsItemSelected(item);
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
                        case R.id.nav_other:
                            selectedFragment = new other_fragment();
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

