import java.util.Scanner;
public class MathClassLab4 {
    public static void main(String[]args){

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        a = input.nextInt();

        int b = a % 10;
        double power = (int)Math.log10(a);
        int divide = (int)Math.pow(10,power);
        int firstNum = a/divide;

        System.out.println("The first digit is: "+firstNum);
        System.out.println("The last number is: "+b);

    }
}
