import java.util.Scanner;

public class EvenOddLab5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = read.nextInt();

        if (num % 2 == 0)
            System.out.println("The number " + num + " is an even number.");
        else
            System.out.println("The number " + num + " is an odd number.");
    }
}
