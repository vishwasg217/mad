package com.example.calc;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.one);//get id of button 1
        Button two = (Button) findViewById(R.id.two);//get id of button 2
        Button three = (Button) findViewById(R.id.three);//get id of button 2
        Button four = (Button) findViewById(R.id.four);//get id of button 2
        Button five = (Button) findViewById(R.id.five);//get id of button 2
        Button six = (Button) findViewById(R.id.six);//get id of button 2
        Button seven = (Button) findViewById(R.id.seven);//get id of button 2
        Button eight = (Button) findViewById(R.id.eight);//get id of button 2
        Button nine = (Button) findViewById(R.id.nine);//get id of button 2
        Button zero = (Button) findViewById(R.id.zero);//get id of button 2
        Button plus = (Button) findViewById(R.id.plus);//get id of button 2
        Button minus = (Button) findViewById(R.id.minus);//get id of button 2
        Button mul = (Button) findViewById(R.id.mul);//get id of button 2
        Button div = (Button) findViewById(R.id.div);//get id of button 2
        Button calc = (Button) findViewById(R.id.calc);//get id of button 2
        Button clear = (Button) findViewById(R.id.clear);//get id of button 2
        TextView res = (TextView) findViewById(R.id.res);
        TextView res2 = (TextView) findViewById(R.id.res2);


        one.setOnClickListener(view -> {
            String textToConcat = "1"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);//display the text of button1
        });

        two.setOnClickListener(view -> {
            String textToConcat = "2"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);
        });

        three.setOnClickListener(view -> {
            String textToConcat = "3"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);
        });

        four.setOnClickListener(view -> {
            String textToConcat = "4"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);
        });

        five.setOnClickListener(view -> {
            String textToConcat = "5"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });

        six.setOnClickListener(view -> {
            String textToConcat = "6"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });


        seven.setOnClickListener(view -> {
            String textToConcat = "7"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });


        eight.setOnClickListener(view -> {
            String textToConcat = "8"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });


        nine.setOnClickListener(view -> {
            String textToConcat = "9"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });


        zero.setOnClickListener(view -> {
            String textToConcat = "0"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });


        plus.setOnClickListener(view -> {
            String textToConcat = "+"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });
        minus.setOnClickListener(view -> {
            String textToConcat = "-"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });
        mul.setOnClickListener(view -> {
            String textToConcat = "*"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });
        div.setOnClickListener(view -> {
            String textToConcat = "/"; // Replace with your desired text
            String currentText = res.getText().toString();
            res.setText(currentText+textToConcat);        });
        calc.setOnClickListener(view -> {
            String expression = res.getText().toString();
            double result = evaluateExpression(expression);
            res2.setText(String.valueOf(result));  });

        clear.setOnClickListener(view -> {
            res.setText("");
            res2.setText("");});
    }



    private double evaluateExpression(String expression) {
        // Find the operator
        int operatorIndex = -1;
        if (expression.contains("+")) {
            operatorIndex = expression.indexOf("+");
        } else if (expression.contains("-")) {
            operatorIndex = expression.indexOf("-");
        } else if (expression.contains("*")) {
            operatorIndex = expression.indexOf("*");
        } else if (expression.contains("/")) {
            operatorIndex = expression.indexOf("/");
        }

        if (operatorIndex == -1) {
            return 0; // No operator found
        }

        // Parse the operands
        double operand1 = Double.parseDouble(expression.substring(0, operatorIndex));
        double operand2 = Double.parseDouble(expression.substring(operatorIndex + 1));

        // Perform the operation
        char operator = expression.charAt(operatorIndex);
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    return Double.NaN; // Division by zero
                }
                return operand1 / operand2;
            default:
                return 0; // Invalid operator
        }
    }

}