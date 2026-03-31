import java.util.Scanner;

public class OrderingLab6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three integers: ");
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        if ((a <= b && b <= c) || (a >= b && b >= c)) {
            System.out.println("Integers are in order.");
        } else {
            System.out.println("Integers are not in order.");
        }
    }
}
