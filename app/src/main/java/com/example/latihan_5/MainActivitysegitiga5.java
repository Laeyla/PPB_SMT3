package com.example.latihan_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitysegitiga5 extends AppCompatActivity {
    EditText et1, et2;
    Button btluas, btkeliling; TextView tvkeliling, tvluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysegitiga5);
        et1 = (EditText) findViewById(R.id.edt1);
        et2 = (EditText) findViewById(R.id.edt2);
        btkeliling = (Button) findViewById(R.id.button3);
        btluas = (Button) findViewById(R.id.button);
        tvkeliling = (TextView) findViewById(R.id.hasil);
        tvluas = (TextView) findViewById(R.id.hasilluas);

        btluas.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil1,bil2, hasil;
            bil1 = Double.valueOf(et1.getText().toString().trim());
            bil2 = Double.valueOf(et2.getText().toString().trim());
            hasil = (bil1 * bil2)/2;
            String hasil1 = String.valueOf(hasil); tvluas.setText(hasil1);
        }
        });

        btkeliling.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil2, hasil;
            bil2 = Double.valueOf(et2.getText().toString().trim());
            hasil = 3*bil2;
            String hasil1 = String.valueOf(hasil); tvkeliling.setText(hasil1);
        }
        });
    }
}