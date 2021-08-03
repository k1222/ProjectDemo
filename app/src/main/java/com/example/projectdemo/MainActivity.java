package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = findViewById(R.id.data_picker);
        TextView date = findViewById(R.id.tv_date);
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_YEAR), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar instance = Calendar.getInstance();
                instance.set(Calendar.YEAR,year);
                instance.set(Calendar.MONTH,monthOfYear);
                instance.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                String format = DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date(instance.getTimeInMillis()));
                date.setText(format);
            }
        });
    }
}