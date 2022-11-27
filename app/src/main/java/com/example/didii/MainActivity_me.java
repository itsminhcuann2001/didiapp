package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import data.DBManager;

public class MainActivity_me extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_me);
        DBManager dbManager = new DBManager(this);

        button = (Button) findViewById(R.id.btnClickHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_me.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_Mytour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_me.this, MainActivity_mytour.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_News);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_me.this, MainActivity_news.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_me.this,
                        "Bạn đang ở mục 'Trang Cá Nhân'",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}