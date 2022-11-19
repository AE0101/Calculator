package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Num1 = findViewById(R.id.Num1);
        EditText Num2 = findViewById(R.id.Num2);


        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button divide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);


        TextView result = findViewById(R.id.result);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            try {
                int N1 = Integer.parseInt(Num1.getText().toString().trim());
                int N2 = Integer.parseInt(Num2.getText().toString().trim());

                int res = N1 + N2;

                result.setText(" " + res);

            } catch (Exception ex) {
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }


            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            try {

                int N1 = Integer.parseInt(Num1.getText().toString().trim());
                int N2 = Integer.parseInt(Num2.getText().toString().trim());

                int res = N1 - N2;

                result.setText(" " + res);

            } catch (Exception ex) {
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();

            }


            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try {

                int N1 = Integer.parseInt(Num1.getText().toString().trim());
                int N2 = Integer.parseInt(Num2.getText().toString().trim());

                int res = N1 / N2;

                result.setText(" " + res);

            } catch (Exception ex) {
                Toast.makeText(MainActivity.this, "You can't divide by zero", Toast.LENGTH_SHORT).show();

            }


            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            try {

                int N1 = Integer.parseInt(Num1.getText().toString().trim());
                int N2 = Integer.parseInt(Num2.getText().toString().trim());

                int res = N1 * N2;

                result.setText(" " + res);
            } catch (Exception ex) {
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }


            }
        });



    }
}