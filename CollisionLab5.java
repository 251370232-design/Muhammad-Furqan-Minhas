import java.util.Scanner;

public class CollisionLab5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int entry1, exit1, entry2, exit2;

        System.out.print("Enter entry time of car 1: ");
        entry1 = read.nextInt();

        System.out.print("Enter exit time of car 1: ");
        exit1 = read.nextInt();

        System.out.print("Enter entry time of car 2: ");
        entry2 = read.nextInt();

        System.out.print("Enter exit time of car 2: ");
        exit2 = read.nextInt();

        int e, x;

        if (entry1 > entry2)
            e = entry1;
        else
            e = entry2;

        if (exit1 < exit2)
            x = exit1;
        else
            x = exit2;

        if (e < x)
            System.out.println("The cars will collide.");
        else
            System.out.println("The cars won’t collide.");
    }
}
