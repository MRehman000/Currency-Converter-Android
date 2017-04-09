package com.muhammad.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertClick(View view){

        EditText editText = (EditText) findViewById(R.id.numInput);
        double currAmount = Double.parseDouble( editText.getText().toString());
        Log.i("INFO",Double.toString(currAmount));
        double convertedAmount = currAmount * 0.94;

        Toast.makeText(MainActivity.this,"The amount in Euros is"+ String.format("%.2f",convertedAmount), Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
