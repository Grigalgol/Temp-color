package com.example.colordescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors; //ссылка на спиннер
    private TextView textViewDescription; //ссылка на текст

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textViewDescription = findViewById(R.id.textViewDescriptionTemp);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition(); //определение выбора из спиннера
        String description = getDescriptionByPosition(position);
        textViewDescription.setText(description); //устанавливаем текст выбранного цвета
    }
    private String getDescriptionByPosition(int position) {  //возвращает нужную строку
        String[] description = getResources().getStringArray(R.array.Discription_of_temp);
        return description[position];
    }
}