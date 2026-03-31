import java.util.Scanner;
public class CarpetCalculator {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Number of rooms carpeted already: ");
        int roomsHavingCarpets = input.nextInt();

        System.out.print("Enter quantity of of carpet used: ");
        double carpetUsed = input.nextDouble();

        System.out.print("Enter the number pf rooms you want to get carpeted: ");
        int roomsForCarpeted = input.nextInt();


        double carpetHavingPerRoom = carpetUsed/roomsHavingCarpets;

        double totalCarpetUsed = carpetHavingPerRoom*roomsForCarpeted;

        System.out.println("Total carpet used:"+totalCarpetUsed+" Square feet");

    }
}
