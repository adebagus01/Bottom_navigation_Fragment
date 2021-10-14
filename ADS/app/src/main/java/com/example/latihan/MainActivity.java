package com.example.latihan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.firstFragment:
                        selectedFragment = new FirstFragment();
                        break;
                    case R.id.secondFragment:
                        selectedFragment = new SecondFragment();
                        break;
                    case R.id.thirdFragment:
                        selectedFragment = new ThirdFragment();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();

                return true;
            }
        });


    }
}