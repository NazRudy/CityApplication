package com.naz.citiesapplication;

import static com.naz.citiesapplication.CoatOfArmsFragment.ARG_INDEX;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CoatOfArmsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coat_of_arms_fragment_container);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
        // Если устройство перевернули в альбомную ориентацию, то надо эту activity закрыть
            finish();
            return;
        }

        // Если эта activity запускается первый раз (с каждым новым гербом первый раз),
        // то перенаправим параметр фрагменту и запустим фрагмент
        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.coat_of_arms_fragment_container,
                            CoatOfArmsFragment.newInstance(getIntent().getExtras().getInt(ARG_INDEX))).commit();
    }
}