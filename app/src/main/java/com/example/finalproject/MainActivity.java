package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton userbth = findViewById(R.id.userbth);
        userbth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mainActivity2.class);
                startActivity(intent);
            }
        });

        ImageButton addbth = findViewById(R.id.addbtn);
        addbth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddmealActivity.class);
                startActivity(intent);
            }
        });

        ImageButton infobtn = findViewById(R.id.info);
        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              CreateAlertDialog();
            }

            private void CreateAlertDialog() {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Member");
                builder.setMessage("Pimpika Dejprapatsorn"+"\n"+"6309681218"+"\n"+"Natchaya Pawapongsupat"+"\n"+"6309681457"+"\n"+"Fahsai Pethsai"+"\n"+"6309681580");
                builder.setPositiveButton("OK",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}