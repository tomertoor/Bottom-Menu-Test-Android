package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    exampleFragment homeFragement = new exampleFragment();
    fragmentmap mapFragement = new fragmentmap();
    notificationFragment notificationFragment = new notificationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragement).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    //case R.id.home:
                      //  getSupportFragmentManager().beginTransaction().replace(R.id.container, exampleFragment).commit();
                        //break;
                    case R.id.map:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mapFragement).commit();
                        break;
                    case R.id.notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notificationFragment).commit();                     
                        break;
                }
                return false;
            }
        });
    }
}