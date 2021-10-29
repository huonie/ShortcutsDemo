package com.example.shortcutstest;

import android.os.Bundle;
import android.widget.Button;


import com.example.shortcutstest.myLinsteners.RegisterLinstener;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btn_register = (Button) findViewById(R.id.registerBtn);
        btn_register.setOnClickListener(new RegisterLinstener(RegisterActivity.this));
    }
}