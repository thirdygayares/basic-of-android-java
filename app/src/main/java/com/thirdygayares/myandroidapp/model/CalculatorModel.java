package com.thirdygayares.myandroidapp.model;

public class CalculatorModel {

    private int firstNumber;
    private int SecondNumber;
    private int Operator;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = Integer.parseInt(firstNumber);
    }

    public int getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        SecondNumber = Integer.parseInt(secondNumber);
    }

    public int getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = Integer.parseInt(operator);
    }

    public int sum(){
        return getFirstNumber() + getSecondNumber();
    }

    public int substration(){
        return getFirstNumber() - getSecondNumber();
    }

    public int product(){
        return getFirstNumber() * getSecondNumber();
    }

    public int quotient(){
        return getFirstNumber() / getSecondNumber();
    }

    public String result(){
        int result;
        switch (getOperator()){
            case 1:
                result  = sum();
                break;
            case 2:
                result = substration();
                break;
            case 3:
                result  = product();
                break;
            case 4:
                result  = quotient();
                break;
            default:
                result = 0;
        }

        return String.valueOf(result);
    }





}
