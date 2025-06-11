package com.example.prj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.SharedPreferences;

import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.intellij.lang.annotations.Language;

public class SettingsActivity extends AppCompatActivity {

    LinearLayout layout;
    TextView profileText, changeName, changebio, changephoto, delete;
    Switch themeSwitch, languageSwitch;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings); // Use correct layout file

        layout = findViewById(R.id.main);
        profileText = findViewById(R.id.lyrics_title);
        changeName = findViewById(R.id.change_name);
        changebio = findViewById(R.id.change_bio);
        changephoto = findViewById(R.id.change_photo);
        delete = findViewById(R.id.delete);

        themeSwitch = findViewById(R.id.themeSwitch);
        languageSwitch = findViewById(R.id.LanguageSwitch);

        themeSwitch.setOnCheckedChangeListener(((buttonView, isCheck) -> {
            if(isCheck){
                layout.setBackgroundColor(Color.parseColor("#313131"));
                themeSwitch.setText(Color.WHITE);
                themeSwitch.setText("Light Mode");
            }else {
                layout.setBackgroundColor(Color.parseColor("#ffffff"));
                themeSwitch.setText(Color.BLACK);
                themeSwitch.setText("Dark Mode");
            }
        }));


        languageSwitch.setOnCheckedChangeListener(((buttonView, isCheck) -> {
            if(isCheck){
                profileText.setText("პროფილი");
                changephoto.setText("ფოტოს შეცვლა");
                changebio.setText("ბიოს შეცვლა");
                changeName.setText("სახელის შეცვლა");
                delete.setText("ანგარიშის წაშლა");

            }else {
                layout.setBackgroundColor(Color.parseColor("#ffffff"));
                themeSwitch.setText(Color.BLACK);
                themeSwitch.setText("Dark Mode");
            }
        }));
    }


}
