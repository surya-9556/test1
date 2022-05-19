package com.softura.test1.question1;

import java.util.Scanner;

public class Premium {
    public void premiumAmountPaid(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of customers");
        int numberOfCustomers = scanner.nextInt();

        int[] premiumPaid = new int[numberOfCustomers];

        double finalAmount = 0;

        for (int i = 0; i < premiumPaid.length; i++){
            System.out.println("Please enter premium amount type: ");
            String premiumAccountType = scanner.next();
            System.out.println("Please enter premium amount of customer ");
            double premiumAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Final Amount"+finalAmount);

            switch (premiumAccountType) {
                case "Monthly" -> {
                    double monthlyFinalAmount = premiumAmount / 12;
                    finalAmount = monthlyFinalAmount+finalAmount;
                    System.out.println("Final Amount"+finalAmount);
                }
                case "Quaterly" -> {
                    double quaterlyFinalAmount = premiumAmount / 4;
                    finalAmount = quaterlyFinalAmount+finalAmount;
                    System.out.println("Final Amount"+finalAmount);
                }
                case "BiAnnual" -> {
                    double biAnnualFinalAmount = premiumAmount / 2;
                    finalAmount = biAnnualFinalAmount+finalAmount;
                    System.out.println("Final Amount"+finalAmount);
                }
                case "Annual" -> {
                    finalAmount = premiumAmount+finalAmount;
                    System.out.println("Final Amount"+finalAmount);
                }
                default -> System.out.println("Please enter correct data");
            }
        }

        System.out.println("Total premium paid by all customers was "+finalAmount);
    }

    public static void main(String[] args){
        Premium premium = new Premium();

        premium.premiumAmountPaid();
    }
}
