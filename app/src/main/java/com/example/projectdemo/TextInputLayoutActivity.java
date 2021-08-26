package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        TextInputEditText edit = findViewById(R.id.et_email);
        TextInputLayout textInputLayout = findViewById(R.id.til);
        textInputLayout.setEndIconMode(TextInputLayout.END_ICON_CLEAR_TEXT);
        textInputLayout.setErrorIconDrawable(0);
        edit.setTransformationMethod(PasswordTransformationMethod.getInstance());

        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count < 6){
                    textInputLayout.setError("密码不能小于6位");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 20){
                    textInputLayout.setError("密码不能大于20位");
                }
                if (s.length() == 0){
                    textInputLayout.setError("");
                }
            }
        });
    }
}