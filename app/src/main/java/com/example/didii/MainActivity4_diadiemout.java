package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4_diadiemout extends AppCompatActivity {

    Button button;
    ImageView ig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_diadiemout);

        ig = (ImageView) findViewById(R.id.btnClick_Home);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemout.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_newyork);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemout.this, MainActivity5_out_newyork.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_rio);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemout.this, MainActivity5_out_rio.class);
                startActivity(i);
            }
        });

        ig = (ImageView) findViewById(R.id.btnClick_paris);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_diadiemout.this, MainActivity5_out_paris.class);
                startActivity(i);
            }
        });

    }
}