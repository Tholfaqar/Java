package com.codewithDolf;

import javax.management.StandardMBean;

public class TaxCalculator2019 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double CalculateTax(){
        return taxableIncome * 0.25;
    }
}
