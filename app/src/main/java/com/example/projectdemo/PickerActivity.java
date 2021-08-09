package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.projectdemo.view.DateTimeDialog;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = findViewById(R.id.data_picker);
        TextView date = findViewById(R.id.tv_date);
        TextView tv_text = findViewById(R.id.tv_text);
        TimePicker timePicker = findViewById(R.id.time_picker);
        TextView time = findViewById(R.id.tv_time);
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
        //是否显示24小时视图
        timePicker.setIs24HourView(false);
        //设置选中的时
        timePicker.setCurrentHour(2);
        //设置选中的分
        timePicker.setCurrentMinute(59);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Log.e("onTimeChanged",hourOfDay+" "+minute);
                Calendar timeCalendar = Calendar.getInstance();
                timeCalendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
                timeCalendar.set(Calendar.MINUTE,minute);
                time.setText(android.text.format.DateFormat.getTimeFormat(getBaseContext()).format(new Date(timeCalendar.getTimeInMillis())));
            }
        });
        tv_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DateTimeDialog(PickerActivity.this).show();
            }
        });
    }
}