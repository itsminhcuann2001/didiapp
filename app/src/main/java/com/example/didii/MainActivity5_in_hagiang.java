package com.example.didii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5_in_hagiang extends AppCompatActivity {

    ImageView ig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_in_hagiang);

        ig = (ImageView) findViewById(R.id.btnClick_Home);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5_in_hagiang.this, MainActivity3_trangchu.class);
                startActivity(i);
            }
        });
    }
}