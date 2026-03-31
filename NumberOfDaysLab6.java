import java.util.Scanner;

public class NumberOfDaysLab6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = read.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid input!");
            return;
        }

        if (month == 2) {
            System.out.println("28 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("31 days");
        }
    }
}
