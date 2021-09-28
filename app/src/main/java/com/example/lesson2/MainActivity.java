package com.example.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView inputTextView = findViewById(R.id.info_textview);


        if (savedInstanceState != null && savedInstanceState.containsKey("stringInputTextView_key")
                && savedInstanceState.containsKey("symbolOperation_key") && savedInstanceState.containsKey("valueFirst_key")
                && savedInstanceState.containsKey("valueSecond_key") && savedInstanceState.containsKey("temp_key")) {
            buttons.stringInputTextView = savedInstanceState.getString("stringInputTextView_key");
            buttons.symbolOperation = savedInstanceState.getString("symbolOperation_key");
            buttons.valueFirst = savedInstanceState.getDouble("valueFirst_key");
            buttons.valueSecond = savedInstanceState.getDouble("valueSecond_key");
            buttons.temp = savedInstanceState.getDouble("temp_key");
        }

        Button deleteAllValue = findViewById(R.id.clear_button);
        deleteAllValue.setOnClickListener(view -> {
            buttons.clearAllCount();
            inputTextView.setText("");
        });



        Button divide = findViewById(R.id.div_button);
        divide.setOnClickListener(view -> {
            if (buttons.divButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button seven = findViewById(R.id.seven_button);
        seven.setOnClickListener(view -> {
            if (buttons.buttonSeven())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button eight = findViewById(R.id.eight_button);
        eight.setOnClickListener(view -> {
            if (buttons.buttonEight())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button nine = findViewById(R.id.nine_button);
        nine.setOnClickListener(view -> {
            if (buttons.buttonNine())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button multiply = findViewById(R.id.mul_button);
        multiply.setOnClickListener(view -> {
            if (buttons.multiplyButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button four = findViewById(R.id.four_button);
        four.setOnClickListener(view -> {
            if (buttons.buttonFour())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button five = findViewById(R.id.five_button);
        five.setOnClickListener(view -> {
            if (buttons.buttonFive())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button six = findViewById(R.id.six_button);
        six.setOnClickListener(view -> {
            if (buttons.buttonSix())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button subtract = findViewById(R.id.minus_button);
        subtract.setOnClickListener(view -> {
            if (buttons.minusButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button three = findViewById(R.id.trio_button);
        three.setOnClickListener(view -> {
            if (buttons.buttonThree())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button two = findViewById(R.id.two_button);
        two.setOnClickListener(view -> {
            if (buttons.buttonTwo())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button one = findViewById(R.id.one_button);
        one.setOnClickListener(view -> {
            if (buttons.buttonOne())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button fold = findViewById(R.id.add_button);
        fold.setOnClickListener(view -> {
            if (buttons.addButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button nullB = findViewById(R.id.nulla_button);
        nullB.setOnClickListener(view -> {
            if (buttons.nullaButton())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button comma = findViewById(R.id.dot_button);
        comma.setOnClickListener(view -> {
            if (buttons.dotButton())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button equals = findViewById(R.id.equal_button);
        equals.setOnClickListener(view -> {
            buttons.equalsCount();
            inputTextView.setText(Double.toString(buttons.temp));
            buttons.clearAllCount();
        });

        Button choiceTheme = findViewById(R.id.choice_theme);
        choiceTheme.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ChoiceTheme.class);
            startActivity(intent);
        });



    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("stringInputTextView_key", buttons.stringInputTextView);
        outState.putString("symbolOperation_key", buttons.symbolOperation);
        outState.putDouble("valueFirst_key", buttons.valueFirst);
        outState.putDouble("valueSecond_key", buttons.valueSecond);
        outState.putDouble("temp_key", buttons.temp);
    }








}