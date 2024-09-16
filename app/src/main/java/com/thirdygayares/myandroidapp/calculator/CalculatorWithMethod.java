package com.thirdygayares.myandroidapp.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.thirdygayares.myandroidapp.R;

public class CalculatorWithMethod extends AppCompatActivity {

    int getnumber2, getNumber1, getOperator;

    int getResult;

    EditText number1, number2, operator;

    Button submit;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_with_method);

        number1 = findViewById(R.id.edit_text_first_num);
        number2 = findViewById(R.id.edit_text_second_num);
        operator = findViewById(R.id.edit_text_operation);
        result = findViewById(R.id.text_view_answer);
        submit = findViewById(R.id.button_submit);

        submit.setOnClickListener(view -> {
            getNumber1 = Integer.parseInt(number1.getText().toString());
            getnumber2 = Integer.parseInt(number2.getText().toString());
            getOperator = Integer.parseInt(operator.getText().toString());

            result.setText(String.valueOf(calculate(getOperator, getNumber1, getnumber2)));
        });

    }

    private int calculate(int operator, int number1, int number2){
        switch (getOperator) {
            case 1:
                getResult = getNumber1 + getnumber2;
                break;
            case 2:
                getResult = getNumber1 - getnumber2;
                break;
            case 3:
                getResult = getNumber1 * getnumber2;
                break;
            case 4:
                getResult = getNumber1 / getnumber2;
                break;
            default:
                getResult = 0;
        }

        return getResult;

    }

}