import java.util.Scanner;

public class AlphabetLetterCheckerLab5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = read.nextLine().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println(ch + " is an alphabet letter.");
        else
            System.out.println(ch + " is NOT an alphabet letter.");
    }
}
