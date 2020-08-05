package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtFName;
    private EditText edtLName;
    private EditText edtDay;
    private EditText edtMonth;
    private EditText edtYear;
    private EditText edtEmail;
    private EditText edtPhone;
    private Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Find();
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fname = edtFName.getText().toString();
                String Lname = edtLName.getText().toString();

                Toast.makeText(MainActivity.this,"This is your information "+ Fname + Lname ,Toast.LENGTH_LONG).show();


            }
        });

    }






    private void Find() {
        edtFName = findViewById(R.id.edtFName);
        edtLName = findViewById(R.id.edtLName);
        edtDay = findViewById(R.id.edtDay);
        edtMonth = findViewById(R.id.edtMonth);
        edtYear = findViewById(R.id.edtYear);
        edtEmail = findViewById(R.id.edtEmail);
        edtPhone = findViewById(R.id.edtPhone);
        btnSub = findViewById(R.id.btnSub);
    }
}