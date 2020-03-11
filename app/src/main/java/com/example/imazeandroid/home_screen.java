package com.example.imazeandroid;

import android.content.Intent;
import android.os.Bundle;

import com.example.imazeandroid.Fragments.nontech_fragment;
import com.example.imazeandroid.Fragments.other_fragment;
import com.example.imazeandroid.Fragments.tech_fragment;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class home_screen extends AppCompatActivity {


    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Tech Events");
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation2);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout2, new tech_fragment()).commit();
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
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    //Organise Fragment while selecting
                    Fragment selectedFragment = null;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
                    switch (item.getItemId()) {
                        case R.id.nav_tech:
                            selectedFragment = new tech_fragment();
                            collapsingToolbarLayout.setTitle("Tech Events");
                            break;
                        case R.id.nav_nontech:
                            selectedFragment = new nontech_fragment();
                            collapsingToolbarLayout.setTitle("Non-Tech Events");
                            break;
                        case R.id.nav_other:
                            collapsingToolbarLayout.setTitle("Other Events");
                            selectedFragment = new other_fragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout2,
                            selectedFragment).commit();

                    return true;
                }

            };
}
