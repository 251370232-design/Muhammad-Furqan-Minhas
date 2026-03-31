import java.util.Scanner;

public class TypicalActivityFinder {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int day, time;

        while (true) {
            System.out.print("Enter a day (1-7): ");
            day = read.nextInt();

            if (day >= 1 && day <= 7)
                break;

            System.out.println("Invalid day! Try again.");
        }

        while (true) {
            System.out.print("Enter time (1=Morning, 2=Afternoon, 3=Evening, 4=Night): ");
            time = read.nextInt();

            if (time >= 1 && time <= 4)
                break;

            System.out.println("Invalid time! Try again.");
        }

        String activity = "";

        if (time == 4) {
            activity = "Sleeping";
        }
        else if (day >= 1 && day <= 5) { 
            if (time == 1)
                activity = "Going to work or school";
            else if (time == 2)
                activity = "Lunch or study time";
            else if (time == 3)
                activity = "Doing homework";
        } 
        else {
            if (time == 1)
                activity = "Relaxing / Late breakfast";
            else if (time == 2)
                activity = "Family time";
            else if (time == 3)
                activity = "Going to a movie";
        }

        System.out.println("Typical activity: " + activity);
    }
}
