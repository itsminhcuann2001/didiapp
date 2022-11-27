package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4_diadiemin extends AppCompatActivity {

    Button button;
    ImageView ig;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_diadiemin);

        ig = (ImageView) findViewById(R.id.btnClick_Home);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_hagiang);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity5_in_hagiang.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_halong);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity5_in_halong.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_dalat);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity5_in_dalat.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_danang);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemin.this, MainActivity5_in_danang.class);
                startActivity(i);
            }
        });
    }
}