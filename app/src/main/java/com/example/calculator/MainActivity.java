package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView resultDisplay, equationDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultDisplay = findViewById(R.id.tvResult);
        equationDisplay = findViewById(R.id.tvEquation);
    }

public Boolean noDoubleSymbols(String equation){
        boolean result;
    if(equation.length()==0){
        result = true;
    }
    else {
        String lastInput = (Character.toString(equation.charAt(equation.length() - 1)));
        System.out.println(lastInput);
        if (lastInput.matches("[+-/*.(]")) {
            result = false;
        } else {
            result = true;
        }
    }
        return result;
}
    //Methods of the buttons
    public void pushOne(View view)
    {
        equationDisplay.append("1");
    }

    public void pushTwo(View view)
    {
        equationDisplay.append("2");
    }

    public void pushThree(View view)
    {
        equationDisplay.append("3");
    }

    public void pushFour(View view)
    {
        equationDisplay.append("4");
    }

    public void pushFive(View view)
    {
        equationDisplay.append("5");
    }

    public void pushSix(View view)
    {
        equationDisplay.append("6");
    }

    public void pushSeven(View view)
    {
        equationDisplay.append("7");
    }

    public void pushEight(View view)
    {
        equationDisplay.append("8");
    }

    public void pushNine(View view)
    {
        equationDisplay.append("9");
    }

    public void pushZero(View view)
    {
        equationDisplay.append("0");
    }

    public void pushAdd(View view)
    {
        String equation = equationDisplay.getText().toString();
        if(noDoubleSymbols(equation)) {
        equationDisplay.append("+");
    }
        else
            equationDisplay.append("");
    }

    public void pushSubtract(View view) {
        {
            String equation = equationDisplay.getText().toString();
            if (noDoubleSymbols(equation)) {
                equationDisplay.append("-");
            } else
                equationDisplay.append("");
        }
    }

    public void pushDivde(View view) {
        {
            String equation = equationDisplay.getText().toString();
            if (noDoubleSymbols(equation)) {
                equationDisplay.append("/");
            } else
                equationDisplay.append("");
        }
    }

    public void pushMultiply(View view){
        {
            String equation = equationDisplay.getText().toString();
            if (noDoubleSymbols(equation)) {
                equationDisplay.append("*");
            } else
                equationDisplay.append("");
        }
    }

    public void pushAllClear(View view){
        equationDisplay.setText("");
        resultDisplay.setText("");
    }

    public void pushEquals(View view){
        String equation;
        double result;
        String resultString;
        equation = equationDisplay.getText().toString();
        Expression e1 = new Expression(equation);
        result = e1.calculate();

        resultString = Double.toString(result);

        resultDisplay.setText(resultString);

    }

    public void pushPercent(View view){
        String equation;
        String brokenEquation;
        double result;
        String resultString;

        equation = equationDisplay.getText().toString();
        Expression e1 = new Expression(equation);
        result = e1.calculate();

        resultString = Double.toString(result);
        resultDisplay.setText(resultString);
        equationDisplay.setText("");
    }

    public void pushPlusMinus(View view){
    }

    public void pushDecimal(View view){
        equationDisplay.append(".");
    }
    
    public void pushTangent(View view){
        String equation = equationDisplay.getText().toString();
        if(noDoubleSymbols(equation)) {
            equationDisplay.append("tan(");
        }
        else
            equationDisplay.append("");
    }

    public void pushSine(View view){
        String equation = equationDisplay.getText().toString();
        if(noDoubleSymbols(equation)) {
            equationDisplay.append("sin(");
        }
        else
            equationDisplay.append("");
    }
    
    public void pushCos(View view){
        String equation = equationDisplay.getText().toString();
        if(noDoubleSymbols(equation)) {
            equationDisplay.append("cos(");
        }
        else
            equationDisplay.append("");
    }
    
    public void pushOpenParenthesis(View view){
        {
            String equation = equationDisplay.getText().toString();
            if (noDoubleSymbols(equation)) {
                equationDisplay.append("(");
            } else
                equationDisplay.append("");
        }
    }
    
    public void pushCloseParenthesis(View view){
        {
            String equation = equationDisplay.getText().toString();
            if (noDoubleSymbols(equation)) {
                equationDisplay.append(")");
            } else
                equationDisplay.append("");
        }
    }
    
    public void pushRandom(View view){
        double random = Math.random();

        String result;
        result = Double.toString(random);

        resultDisplay.setText(result);
        equationDisplay.setText("");
    }
    
    public void pushLogn(View view){
        equationDisplay.append("ln(");
    }
    
    public void pushSqRt(View view){
        equationDisplay.append("sqrt(");
    }
    
    public void pushPI(View view){
        equationDisplay.append("*pi");
        
    }

    public void pushClear(View view){
        String temp = equationDisplay.getText().toString();
        if(temp.length()==0){
            equationDisplay.setText("");
        }
        else
        {
           temp = temp.substring(0,temp.length()-1);
           equationDisplay.setText(temp);
        }
    }
}
