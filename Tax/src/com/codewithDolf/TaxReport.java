package com.codewithDolf;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }
    public void ShowTax(){
        System.out.println(calculator.CalculateTax());
    }
}
