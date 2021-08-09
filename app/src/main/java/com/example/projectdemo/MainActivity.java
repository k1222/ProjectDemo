package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_picker).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PickerActivity.class)));
        findViewById(R.id.btn_recycler_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class)));
    }
}