package com.example.latihan_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitylingkaran4 extends AppCompatActivity {
    EditText et1;
    Button btluas, btkeliling; TextView tvkeliling, tvluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylingkaran4);
        et1 = (EditText) findViewById(R.id.edt1);
        btkeliling = (Button) findViewById(R.id.button3);
        btluas = (Button) findViewById(R.id.button);
        tvkeliling = (TextView) findViewById(R.id.hasil);
        tvluas = (TextView) findViewById(R.id.hasilluas);

        btluas.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil1, hasil;
            bil1 = Double.valueOf(et1.getText().toString().trim());
            hasil = Math.PI*Math.pow(bil1, 2);;
            String hasil1 = String.valueOf(hasil); tvluas.setText(hasil1);
        }
        });

        btkeliling.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bil1, hasil;
            bil1 = Double.parseDouble(et1.getText().toString().trim());
            hasil = Math.PI*(bil1*2);
            String hasil1 = String.valueOf(hasil); tvkeliling.setText(hasil1);
        }
        });
    }
}

