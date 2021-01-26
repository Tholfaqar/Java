package MortgageCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int P = scanner.nextInt();
        System.out.println("Interest Rate: ");
        float interest_rate = scanner.nextFloat();
        System.out.println("Period (Years): ");
        int period = scanner.nextInt();
        float i = interest_rate / 100 / 12;
        int n = period * 12;
        NumberFormat mortgage = NumberFormat.getCurrencyInstance();

        // mortgage = P*i/(1-(1+i)^-n)
        String mortgate_str = mortgage.format(P * i / (1 - Math.pow((1 + i), -n)));
        System.out.println("Monthly Mortgage Payment: " + mortgate_str);
        scanner.close();

    }
}
