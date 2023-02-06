package com.example.duongchikhang_se161156_lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nhapSo1, nhapSo2;
    Button phepCong, phepTru, phepNhan, phepChia;
    TextView ketQua;
    private final String REQUIRE = "Require";
    float a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nhapSo1 = (EditText) findViewById(R.id.nhapSo1);
        nhapSo2 = (EditText) findViewById(R.id.nhapSo2);
        phepCong = (Button) findViewById(R.id.phepCong);
        phepTru = (Button) findViewById(R.id.phepTru);
        phepNhan = (Button) findViewById(R.id.phepNhan);
        phepChia = (Button) findViewById(R.id.phepChia);
        ketQua = (TextView) findViewById(R.id.ketQua);

        phepCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nhapSo1.getText().toString().isEmpty() || nhapSo2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT);
                else{
                    a = Float.parseFloat(nhapSo1.getText().toString());
                    b = Float.parseFloat(nhapSo2.getText().toString());
                    c = a + b;

                    ketQua.setText(String.valueOf(c));}

            }
        });

        phepTru.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(nhapSo1.getText().toString().isEmpty() || nhapSo2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT);
                else{
                a = Float.parseFloat(nhapSo1.getText().toString());
                b = Float.parseFloat(nhapSo2.getText().toString());
                c = a - b;

                ketQua.setText(String.valueOf(c));
            }}
        });

        phepNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nhapSo1.getText().toString().isEmpty() || nhapSo2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT);
                else{
                a = Float.parseFloat(nhapSo1.getText().toString());
                b = Float.parseFloat(nhapSo2.getText().toString());
                c = a * b;

                ketQua.setText(String.valueOf(c));}
            }
        });

        phepChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nhapSo1.getText().toString().isEmpty() || nhapSo2.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT);
                else{
                a = Float.parseFloat(nhapSo1.getText().toString());
                b = Float.parseFloat(nhapSo2.getText().toString());
                c = a / b;

                ketQua.setText(String.valueOf(c));}
            }
        });
    }

}