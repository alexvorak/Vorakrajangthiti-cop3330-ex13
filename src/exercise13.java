/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        System.out.printf("What is the principal amount? ");
        Scanner scanner = new Scanner(System.in);
        String principal = scanner.nextLine();
        int newPrin = Integer.parseInt(principal);

        System.out.printf("What is the rate? (Please enter percentages as whole numbers) ");
        Scanner scanner1 = new Scanner(System.in);
        String interestinput = scanner1.nextLine();
        float rateInterest = Float.parseFloat(interestinput);

        System.out.printf("What is the number of years? ");
        Scanner scanner2 = new Scanner(System.in);
        String years = scanner2.nextLine();
        int newYears = Integer.parseInt(years);

        System.out.printf("What is the number of times the interest is compounded per year? ");
        Scanner scanner3 = new Scanner(System.in);
        String compoundperyear = scanner3.nextLine();
        int newCompound = Integer.parseInt(compoundperyear);

    double newTotal;
    double interestrate = 0;
    interestrate = rateInterest/100;
    double newRate;
    double leftside = (1+(interestrate/newCompound)), rightside = newCompound*newYears;
    newRate = (Math.pow((leftside),(rightside)));
    newTotal = (float)((newPrin)+ newRate);

        System.out.printf("$" + newPrin + " invested at " + interestinput + "%% for 6 years compounded "+ newCompound);
        System.out.printf(" times per year is " +  "$%.2f.",newTotal);
}
}
