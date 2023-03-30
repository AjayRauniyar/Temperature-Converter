package com.example.tempertureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    /*by ajay kumar rauniyar */
    public void OnClickButton(View view){
        EditText temp=findViewById(R.id.editTextNumberDecimal);
        String temperature=temp.getText().toString();
        double cel=Double.parseDouble(temperature);
        double fah=cel*((double)9/5)+32;
        Snackbar.make(view,"Temperature is "+cel+" in celsius and "+fah+" in fahrenheit",Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}