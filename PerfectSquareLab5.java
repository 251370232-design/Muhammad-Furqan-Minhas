import java.util.Scanner;

public class PerfectSquareLab5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = read.nextInt();

        double sqrt = Math.sqrt(num);

        if (sqrt == (int)sqrt)
            System.out.println(num + " is a perfect square.");
        else
            System.out.println(num + " is NOT a perfect square.");
    }
}
