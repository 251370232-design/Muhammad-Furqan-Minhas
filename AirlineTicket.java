import java.util.Scanner;

public class AirlineTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Class (Economy/Business): ");
        String cls = sc.next();
        System.out.print("Distance: ");
        int distance = sc.nextInt();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Time (Peak/Off): ");
        String time = sc.next();

        double fare = 0;

        if (cls.equalsIgnoreCase("Economy")) {
            fare = distance * 15;
        }else {
            fare = distance * 40;
        }if (time.equalsIgnoreCase("Peak")){
         fare += fare * 0.20;
        }if (age < 12){
        fare -= fare * 0.50;
        } else if (age > 60) {
            fare -= fare * 0.30;
        }if (distance > 3000) {
            fare -= fare * 0.10;
        }

        System.out.println("Final Ticket Price: Rs. " + fare);
    }
}
