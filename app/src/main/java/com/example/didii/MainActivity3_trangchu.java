package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3_trangchu extends AppCompatActivity {
    Button button;
    TextView tv1, tv2;
    ImageView ig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_trangchu);

        ig = (ImageView) findViewById(R.id.btnClick_Home);
//        ig.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity3_trangchu.this,
//                        "Bạn đang ở mục 'Trang Chủ'",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        ig.setOnClickListener(v -> {
            Toast.makeText(this, "Bạn đang ở mục 'Trang Chủ'", Toast.LENGTH_SHORT).show();
        });

        ig = (ImageView) findViewById(R.id.btnClick_diadiemin);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity4_diadiemin.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_diadiemout);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity4_diadiemout.class);
                startActivity(i);
            }
        });


        button = (Button) findViewById(R.id.btnClickHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3_trangchu.this,
                        "Bạn đang ở mục 'Trang Chủ'",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.btnClick_Mytour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_mytour.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_News);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_news.class);
                startActivity(i);
            }
        });

        button = (Button) findViewById(R.id.btnClick_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3_trangchu.this, MainActivity_me.class);
                startActivity(i);
            }
        });
    }
}