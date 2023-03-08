package com.example.foodapp_gt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodapp_gt.R;

public class IntroActivity extends AppCompatActivity {
    TextView txtviewstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        txtviewstart = findViewById(R.id.btnstart);
        txtviewstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, HomeActivity.class));
            }
        });
    }
}