package com.example.pproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pproject.R;

public class NoticeActivity extends AppCompatActivity {
    private Button back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);

        init();
        listener();
        object();
    }

    private void object() {
        Intent intent = getIntent();
    }

    private void listener() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void init() {
        back = findViewById(R.id.back);
    }
}
