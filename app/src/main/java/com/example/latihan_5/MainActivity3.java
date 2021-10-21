package com.example.latihan_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    EditText et1;
    Button btluas, btkeliling; TextView tvkeliling, tvluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et1 = (EditText) findViewById(R.id.etd);
        btkeliling = (Button) findViewById(R.id.button2);
        btluas = (Button) findViewById(R.id.button5);
        tvkeliling = (TextView) findViewById(R.id.hasil);
        tvluas = (TextView) findViewById(R.id.hasilluas);

        btluas.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil1, hasil;
            bil1 = Double.valueOf(et1.getText().toString().trim());
            hasil = bil1 * bil1;
            String hasil1 = String.valueOf(hasil); tvluas.setText(hasil1);
        }
        });

        btkeliling.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil1, hasil;
            bil1 = Double.valueOf(et1.getText().toString().trim());
            hasil = bil1 * 4;
            String hasil1 = String.valueOf(hasil); tvkeliling.setText(hasil1);
        }
        });
    }
}