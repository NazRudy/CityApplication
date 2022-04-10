package com.naz.citiesapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class CitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
    // Создаем фрагмент
        CitiesFragment citiesFragment = new CitiesFragment();
    // Вызываем FragmentManager
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, citiesFragment).commit();
    }
}
