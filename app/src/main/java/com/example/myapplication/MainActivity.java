package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.numberInput3);
        input2 = findViewById(R.id.numberInput2);
        output = findViewById(R.id.answerOutput);

    }

    public void add(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int answer = number1 + number2;

        output.setText(String.valueOf(answer));
    }

    public void reduce(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int answer = number1 - number2;

        output.setText(String.valueOf(answer));
    }

    public void divide(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int answer = number1 / number2;

        output.setText(String.valueOf(answer));
    }

    public void multiply(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int answer = number1 * number2;

        output.setText(String.valueOf(answer));
    }

}
