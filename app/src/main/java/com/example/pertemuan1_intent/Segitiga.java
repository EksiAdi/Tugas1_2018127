package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_a);
        final EditText tinggi = (EditText)findViewById(R.id.input_t);
        final EditText luas = (EditText)findViewById(R.id.hasil);
        final Button tampil = (Button)findViewById(R.id.hitung);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double alas1 = Double.valueOf(alas.getText().toString().trim());
                double tinggi1 = Double.valueOf(tinggi.getText().toString().trim());
                double hasil = alas1*tinggi1/2;
                String hasil1 = String.valueOf(hasil);
                luas.setText(hasil1);
            }
        });
    }
}