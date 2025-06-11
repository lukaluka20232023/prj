package com.example.prj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.search);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.main) {
                startActivity(new Intent(this, MainActivity.class));
            } else if (itemId == R.id.playlist) {
                startActivity(new Intent(this, PlaylistActivity.class));
            } else if (itemId == R.id.player) {
                startActivity(new Intent(this, PlayerActivity.class));
            } else if (itemId == R.id.settings) {
                startActivity(new Intent(this, SettingsActivity.class));
            }
            return true;
        });



        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment())
                .commit();



    }
}

