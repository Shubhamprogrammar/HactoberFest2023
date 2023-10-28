package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                if (s.equals("")) {
                    Toast.makeText(MainActivity.this, "Please, Enter Some Input!!!", Toast.LENGTH_SHORT).show();
                } else {
                    BigInteger num = new BigInteger(s);
                    BigInteger sq = num.multiply(num);
                    textView.setText("The Square is: " + sq);
                    Toast.makeText(MainActivity.this, "Thanks, For using this App!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        public void calculate(View view) {
            String s = editText.getText().toString();
            if (s.equals("")) {
                Toast.makeText(MainActivity.this, "Please, Enter Some Input!!!", Toast.LENGTH_SHORT).show();
            } else {
                BigInteger num = new BigInteger(s);
                BigInteger cu = num.pow(3);
                textView.setText("The Cube is: " + cu);
                Toast.makeText(this, "Thank You!!!", Toast.LENGTH_SHORT).show();
        }
    }
}