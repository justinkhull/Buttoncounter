package com.example.justinkhull.button_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counterValue;
    //int counter = 0;
    int counter;
    Button incrementButton;
    Button decrementButton;
    Button resetButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //screen rotations
        //savedInstanceState.putString("counterValue", counterValue.getText().toString());
        /*if (savedInstanceState != null) {
            //savedInstanceState.putInt("counter", counterValue.getText().toString());
            counter = savedInstanceState.getInt("counter");
        }
        else {
            counter = 0;
        }*/

        counterValue = (TextView) findViewById(R.id.counter);
        incrementButton = (Button) findViewById(R.id.increment_button);
        decrementButton = (Button) findViewById(R.id.decrement_button);
        resetButton = (Button) findViewById(R.id.reset_button);

        //
        //counter = savedInstanceState.getInt("counterValue");

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                counterValue.setText(Integer.toString(counter));
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                counterValue.setText(Integer.toString(counter));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                counterValue.setText(Integer.toString(counter));
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("savedCounter", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("savedCounter");
        counterValue.setText(Integer.toString(counter));
    }
}
