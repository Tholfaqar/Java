package MortgageCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int P = scanner.nextInt();
        System.out.println("Interest Rate: ");
        float yearlyInterest = scanner.nextFloat();
        System.out.println("Period (Years): ");
        int period = scanner.nextInt();
        float i = yearlyInterest / PERCENT / MONTHS_IN_YEAR; //monthly interest
        int n = period * MONTHS_IN_YEAR; //loan term in months
        NumberFormat mortgage = NumberFormat.getCurrencyInstance();

        // P*i/(1-(1+i)^-n)
        String mortgate_str = mortgage.format(P * i / (1 - Math.pow((1 + i), -n)));
        System.out.println("Monthly Mortgage Payment: " + mortgate_str);
        scanner.close();

    }
}
