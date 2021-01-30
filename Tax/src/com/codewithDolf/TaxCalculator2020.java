package com.codewithDolf;

public class TaxCalculator2020 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double CalculateTax(){
        return taxableIncome * 0.3;
    }
}
