package MortgageCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int age = scanner.nextInt();

        // System.out.println("Your are is: " + age);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Interest Rate: ");
        float interest_rate = scanner.nextFloat();
        System.out.println("Period (Years): ");
        int period = scanner.nextInt();
        float i = interest_rate / 100 / 12;
        int n = period * 12;
        NumberFormat mortgage = NumberFormat.getCurrencyInstance();

        // P*i/(1-(1+i)^-n)
        String mortgate_str = mortgage.format(principal * i / (1 - Math.pow((1 + i), -n)));
        System.out.println("Monthly Mortgage Payment: " + mortgate_str);
        scanner.close();

    }
}
