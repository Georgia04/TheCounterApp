package com.georgia.gk.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button button;
   int counter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcome_text);
        counter_text = findViewById(R.id.counter_text);
        button = findViewById(R.id.button);


        //Adding functionalities
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText(" " + increaseCounter());

            }
        });
    }

    public int increaseCounter(){
        return counter++;

    }
}