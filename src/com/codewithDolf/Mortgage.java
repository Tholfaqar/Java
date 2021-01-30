package com.codewithDolf;

import java.text.NumberFormat;
import java.lang.Math;

public class Mortgage {
    final int MONTHS_IN_YEAR = 12;
    final int PERCENT = 100;

    private double P; // Principal
    private float APR; // APR
    private float monthlyRate; // APR / 12
    private int years; // loan term in years
    private int months;  // loan tern in months
    private NumberFormat formatted = NumberFormat.getCurrencyInstance();

    Mortgage(double P, float APR, int years){
        this.setP(P);
        this.setAPR(APR);
        this.setYears(years);
        this.monthlyRate = getMonthlyRate();
        this.months = getMonths();
    }

    public double[] PrincipalPayments(){
        double[] balance = new double[getMonths()+1];

        for (int i = 1; i <= getMonths(); i++) {
            balance[i] = P * (Math.pow((1 + monthlyRate), months)
                    - Math.pow((1 + monthlyRate), i))
                    / (Math.pow((1 + monthlyRate), months) - 1);
        }
        return balance;
    }

    public void MortgagePayment() {
        // P*monthlyRate/(1-(1+monthlyRate)^-total#payments(months))
        String mortgageFT_str = formatted.format(P * getMonthlyRate() / (1 - Math.pow((1 + getMonthlyRate()), -months)));
        System.out.println("Monthly Mortgage Payment: " + mortgageFT_str);
    }

    public void setP(double p) {
        P = p;
    }

    public void setAPR(float APR) {
        this.APR = APR;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonths(int months) {
        this.months = months;
    }
    public NumberFormat getFormatted() {
        return formatted;
    }

    public float getMonthlyRate() {
        return (APR / PERCENT / MONTHS_IN_YEAR);
    }

    public int getMonths() {
        return (years * MONTHS_IN_YEAR);
    }
}

