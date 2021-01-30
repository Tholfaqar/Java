package com.codewithDolf;

public class Main {

    public static void main(String[] args) {
        double P = Console.readNumber("Input Principal: ");
        float yearlyRate = (float)Console.readNumber("input interest rate: ");
        int years = (int)Console.readNumber("input period in years: ");

        var mortgage = new Mortgage(P, yearlyRate, years);
        mortgage.MortgagePayment();
        double[] balance = new double[mortgage.getMonths()];
        balance = mortgage.PrincipalPayments();
        var report = new Report();
        report.PrintReport(balance, mortgage);
    }


}
