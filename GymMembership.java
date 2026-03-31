import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("BMI: ");
        double bmi = sc.nextDouble();
        System.out.print("Goal:");
        String goal = sc.nextLine();

         if (bmi > 30) {
            if (age < 40) {
                System.out.println("High-Intensity Weight Loss Program");
            } else {
                System.out.println("Low-Impact Weight Loss Program");
            }
        }
        else if (goal.equalsIgnoreCase("Strength")) {
            if (age >= 40) {
                System.out.println("Lean Bulk Muscle Program");
            } else {
                System.out.println("Strength Training Program");
            }
        }
        else if (goal.equalsIgnoreCase("Weight Loss")) {
            System.out.println("Cardio Fitness Program");
        }
        else {
            System.out.println("Balanced Workout Program");
        }
    }
}

        