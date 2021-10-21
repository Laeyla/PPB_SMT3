package com.example.latihan_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void lanjut(View view) {
        Intent intent = new Intent( MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }


    public void lingkaran(View view) {
        Intent intent = new Intent( MainActivity2.this,MainActivitylingkaran4.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent( MainActivity2.this,MainActivitysegitiga5.class);
        startActivity(intent);
    }

    public void persegip(View view) {
        Intent intent = new Intent( MainActivity2.this,MainActivitypersegip6.class);
        startActivity(intent);
    }
}