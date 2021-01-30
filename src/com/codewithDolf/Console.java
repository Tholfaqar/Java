package com.codewithDolf;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
