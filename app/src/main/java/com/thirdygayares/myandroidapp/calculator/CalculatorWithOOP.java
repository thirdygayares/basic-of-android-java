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
import com.thirdygayares.myandroidapp.model.CalculatorModel;

public class CalculatorWithOOP extends AppCompatActivity {



    int getResult;

    EditText number1, number2, operator;

    Button submit;

    TextView result;

    CalculatorModel calculatorModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator_with_oop);

        number1 = findViewById(R.id.edit_text_first_num);
        number2 = findViewById(R.id.edit_text_second_num);
        operator = findViewById(R.id.edit_text_operation);
        result = findViewById(R.id.text_view_answer);
        submit = findViewById(R.id.button_submit);

        calculatorModel = new CalculatorModel();

        submit.setOnClickListener(view -> {
            calculatorModel.setFirstNumber(number1.getText().toString());
            calculatorModel.setSecondNumber(number2.getText().toString());
            calculatorModel.setOperator(operator.getText().toString());
            result.setText(calculatorModel.result());
        });
    }
}