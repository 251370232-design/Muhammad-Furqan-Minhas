import java.util.Scanner;

public class FreelancerInvoiceLab6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter freelancer name: ");
        String name = read.nextLine();

        System.out.print("Enter hourly wage: ");
        double wage = read.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = read.nextDouble();

        if (hours <= 0) {
            System.out.println("Invalid working hours!");
            return;
        }

        double pay;

        if (hours <= 160) {
            pay = hours * wage;
        } else {
            double extra = hours - 160;
            pay = (160 * wage) + (extra * (2 * wage));
        }

        System.out.println("\n----- Freelancer Invoice -----");
        System.out.println("Name: " + name);
        System.out.println("Total Pay: $" + pay);
    }
}
