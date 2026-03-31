import java.util.Scanner;

public class DateValidationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: "); 
        int day = scanner.nextInt(); 
        System.out.print("Enter month: "); 
        int month = scanner.nextInt();
        System.out.print("Enter year: "); 
        int year = scanner.nextInt();

        boolean isValidDate = true;

        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println("Error: Day, month, or year cannot be zero or negative.");
            return; 
        }

        if (year < 1970 || year > 2025) {
            isValidDate = false; 
        }

        if (isValidDate && (month < 1 || month > 12)) {
            isValidDate = false;
        }

        boolean isLeap = (year % 4 == 0);

        if (isValidDate) {
            int maxDays;
            
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
                
            } else if (month == 2) { 
                if (isLeap) {
                    maxDays = 29; 
                } else {
                    maxDays = 28; 
                }
                
            } else {
                maxDays = 31;
            }

            if (day > maxDays) {
                isValidDate = false;
            }
        }

        
        System.out.print("The entered date " + day + "-" + month + "-" + year + " is ");
        
        if (isValidDate) {
            System.out.println("valid."); 
        } else {
            System.out.println("invalid."); 
        }
    }
}