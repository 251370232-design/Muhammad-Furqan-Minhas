import java.util.Scanner;

public class NumberTypeLab5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = read.nextDouble();

        int intPart = (int) num;

        if (num - intPart == 0)
            System.out.println("The number " + intPart + " is an integer.");
        else
            System.out.println("The number " + num + " is a real number.");
    }
}
