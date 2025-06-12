package com.example.prj;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // —— Bottom Navigation (no‐checks version) ——
        BottomNavigationView nav = findViewById(R.id.bottom_navigation);
        nav.setSelectedItemId(R.id.search);
        nav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.main)      startActivity(new Intent(this, MainActivity.class));
            else if (id == R.id.hot)  startActivity(new Intent(this, HotActivity.class));
            else if (id == R.id.search)  startActivity(new Intent(this, SearchActivity.class));
            else if (id == R.id.read) startActivity(new Intent(this, HistoryActivity.class));
            else if (id == R.id.settings) startActivity(new Intent(this, SettingsActivity.class));
            finish();
            return true;
        });

        // —— Dynamically insert your two fragments ——
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container_search, new SearchFragment())
                .replace(R.id.fragment_container_sorted, new SortedFragment())
                .commit();
    }
}
