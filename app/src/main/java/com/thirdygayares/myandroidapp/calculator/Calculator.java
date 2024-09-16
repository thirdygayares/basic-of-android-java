package com.thirdygayares.myandroidapp.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.thirdygayares.myandroidapp.R;

public class Calculator extends AppCompatActivity {

    int getnumber2, getNumber1, getOperator;

    int getResult;

    EditText number1, number2, operator;

    Button submit;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        number1 = findViewById(R.id.edit_text_first_num);
        number2 = findViewById(R.id.edit_text_second_num);
        operator = findViewById(R.id.edit_text_operation);
        result = findViewById(R.id.text_view_answer);
        submit = findViewById(R.id.button_submit);

        submit.setOnClickListener(view -> {

            getNumber1 = Integer.parseInt(number1.getText().toString());
            getnumber2 = Integer.parseInt(number2.getText().toString());
            getOperator = Integer.parseInt(operator.getText().toString());


            switch (getOperator){
                case 1:
                    getResult  = getNumber1 + getnumber2;
                    break;
                case 2:
                    getResult  = getNumber1 - getnumber2;
                    break;
                case 3:
                    getResult  = getNumber1 * getnumber2;
                    break;
                case 4:
                    getResult  = getNumber1 / getnumber2;
                    break;
                default:
                    getResult = 0;
            }

            result.setText(String.valueOf(getResult));

        });
    }
}