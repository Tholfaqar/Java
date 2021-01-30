package com.codewithDolf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TaxCalculator2019 taxCalc19 = new TaxCalculator2019(100_000);
        TaxReport report = new TaxReport(taxCalc19);
        report.ShowTax();
    }
}
