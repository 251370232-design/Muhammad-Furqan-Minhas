import java.util.Scanner;

public class LetterGradeLab6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String input = read.nextLine();

        char letter = input.charAt(0);

        double value = 0;

        if (letter == 'A')
            value = 4;
        else if (letter == 'B')
            value = 3;
        else if (letter == 'C')
            value = 2;
        else if (letter == 'D')
            value = 1;
        else if (letter == 'F')
            value = 0;
        else {
            System.out.println("Invalid grade!");
            return;
        }

        if (input.length() == 2) {
            char sign = input.charAt(1);

            if (letter == 'F') {
                System.out.println("F cannot have + or -");
                return;
            }

            if (letter == 'A' && sign == '+') {
                value = 4.0; 
            } else if (sign == '+') {
                value += 0.3;
            } else if (sign == '-') {
                value -= 0.3;
            } else {
                System.out.println("Invalid grade sign!");
                return;
            }
        }

        System.out.println("The numeric value is " + value);
    }
}
