package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        TextView delete = findViewById(R.id.tv_delete);
        delete.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        TextView underLine = findViewById(R.id.tv_under_line);
        underLine.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}