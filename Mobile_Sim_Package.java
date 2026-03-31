import java.util.Scanner;

public class Mobile_Sim_Package {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.15;

        System.out.println("Welcome to SIM Selector");
        System.out.println("-------------------------");

        System.out.println("1. Jazz");
        System.out.println("2. Zong");
        System.out.println("3. Ufone");
        System.out.println("4. Telenor");
        System.out.print("Enter your SIM choice (1-4): ");
        int simChoice = scanner.nextInt();

        String simName = "";
        double packagePrice = 0.0;
        String packageDetails = "";
        
        if (simChoice == 1) { 
            simName = "Jazz";
            System.out.println("\nAvailable Packages:");
            System.out.println("1. 2GB Data + 100 Minutes \t$5");
            System.out.println("2. 5GB Data + 500 Minutes \t$10");
            System.out.print("Enter your package choice (1-2): ");
            int packageChoice = scanner.nextInt();

            if (packageChoice == 1) {
                packagePrice = 5.0;
                packageDetails = "2GB Data + 100 Minutes";
            } else if (packageChoice == 2) {
                packagePrice = 10.0;
                packageDetails = "5GB Data + 500 Minutes";
            } else {
                System.out.println("Invalid package selection. Terminating program.");
                return;
            }

        } else if (simChoice == 2) { 
            simName = "Zong";
            System.out.println("\nAvailable Packages:");
            System.out.println("1. 3GB data + 50 minutes for $6");
            System.out.println("2. 10GB data + 300 minutes for $12");
            System.out.print("Enter your package choice (1-2): ");
            int packageChoice = scanner.nextInt();

            if (packageChoice == 1) {
                packagePrice = 6.0;
                packageDetails = "3GB Data + 50 Minutes";
            } else if (packageChoice == 2) {
                packagePrice = 12.0;
                packageDetails = "10GB Data + 300 Minutes";
            } else {
                System.out.println("Invalid package selection. Terminating program.");
                return;
            }

        } else if (simChoice == 3) { 
            simName = "Ufone";
            System.out.println("\nAvailable Packages:");
            System.out.println("1. 1GB data + 200 minutes for $4");
            System.out.println("2. 4GB data + 400 minutes for $8");
            System.out.print("Enter your package choice (1-2): ");
            int packageChoice = scanner.nextInt();

            if (packageChoice == 1) {
                packagePrice = 4.0;
                packageDetails = "1GB Data + 200 Minutes";
            } else if (packageChoice == 2) {
                packagePrice = 8.0;
                packageDetails = "4GB Data + 400 Minutes";
            } else {
                System.out.println("Invalid package selection. Terminating program.");
                return;
            }

        } else if (simChoice == 4) { 
            simName = "Telenor";
            System.out.println("\nAvailable Packages:");
            System.out.println("1. 2GB data + 150 minutes for $5");
            System.out.println("2. 6GB data + 600 minutes for $11");
            System.out.print("Enter your package choice (1-2): ");
            int packageChoice = scanner.nextInt();

            if (packageChoice == 1) {
                packagePrice = 5.0;
                packageDetails = "2GB Data + 150 Minutes";
            } else if (packageChoice == 2) {
                packagePrice = 11.0;
                packageDetails = "6GB Data + 600 Minutes";
            } else {
                System.out.println("Invalid package selection. Terminating program.");
                return;
            }

        } else {
            System.out.println("Invalid SIM selection. Terminating program.");
            return;
        }
        System.out.print("Enter your current balance: $");
        double initialBalance = scanner.nextDouble();

        double taxAmount = packagePrice * TAX_RATE; 
        double totalCost = packagePrice + taxAmount; 
        double remainingBalance = initialBalance - totalCost;

        System.out.println("\nTransaction Details");
        System.out.println("-------------------");
        System.out.println("SIM Selected : " + simName);
        System.out.println("Package : " + packageDetails);
        
        System.out.printf("Package Price : ", packagePrice);
        System.out.printf("Tax : "+ taxAmount);
        System.out.printf("Total Cost : "+ totalCost);

        if (remainingBalance >= 0) {
            System.out.printf("Remaining Balance : "+ remainingBalance);
            System.out.println("Thank you for using our service!");
        } else {
            System.out.println("\nWarning: Insufficient balance!");
            double neededRecharge = totalCost - initialBalance;
            System.out.printf("Please recharge at least to activate this package"+ neededRecharge);
        }

        scanner.close();
    }
}