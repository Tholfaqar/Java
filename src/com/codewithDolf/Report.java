package com.codewithDolf;

public class Report {

    public void PrintReport(double[] balance, Mortgage m){
        for (int i = 1; i < balance.length; i++) {
            System.out.println("Principal at month " + i + ": "
                    + m.getFormatted().format(balance[i]));
        }
    }
}
