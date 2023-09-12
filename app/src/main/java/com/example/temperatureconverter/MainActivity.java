package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText celsiusInput;
    TextView fahrenheitOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the EditText and TextView
        celsiusInput=findViewById(R.id.celsius_input);
        fahrenheitOutput=findViewById(R.id.fahrenheit_output);
    }
    public void convertTocelsius(View view)
    {
        String celsiusString = celsiusInput.getText().toString();
        double celsius=Double.parseDouble(celsiusString);
        double fahrenheit=(celsius * 9/5 + 32);
        fahrenheitOutput.setText(String.format("%2c",fahrenheit));
    }

}