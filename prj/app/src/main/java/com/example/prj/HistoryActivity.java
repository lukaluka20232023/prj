package com.example.prj;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistoryActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);  // hosts KeepReadingFragment, FavouritesFragment, RecommendedFragment

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.read);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.main) {
                startActivity(new Intent(this, MainActivity.class));
                finish();
            } else if (id == R.id.hot) {
                startActivity(new Intent(this, HotActivity.class));
                finish();
            } else if (id == R.id.search) {
                startActivity(new Intent(this, SearchActivity.class));
                finish();
            } else if (id == R.id.read) {
                startActivity(new Intent(this, HistoryActivity.class));
                finish();
            } else if (id == R.id.settings) {
                startActivity(new Intent(this, SettingsActivity.class));
                finish();
            }
            return true;
        });
    }
}
