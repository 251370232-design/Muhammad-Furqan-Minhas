import java.util.Scanner;
public class  WarehousePackingSummary{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
			System.out.print("total no of items to pack :");
			final int totalItems = input.nextInt();

			final int Box_60 = 60;
			final int Box_25 = 25;
			final int Box_10 = 10;
			final int Box_5  = 5;

			int remaining = totalItems;
			int Box60 = remaining / Box_60;
			remaining   = remaining % Box_60;
			int Box25 = remaining / Box_25;
			remaining   = remaining % Box_25;
			int Box10 = remaining / Box_10;
			remaining   = remaining % Box_10;
			int Box5  = remaining /  Box_5;
			remaining   = remaining %  Box_5;


			System.out.println("\n___________________Warehouse Box Packing Result_______________");
			System.out.println("Total items: + totalItems ");
			System.out.println("60-item boxes used: + box60");
			System.out.println("25-item boxes used: + box25");
			System.out.println("10-item boxes used: + box10");
			System.out.println("5-item boxes used:  + box5");
			System.out.println("Items left unpacked: + remaining");
	}
}