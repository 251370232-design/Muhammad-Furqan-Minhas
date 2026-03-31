import java.util.Scanner;

public class  SmartParkingSystem{
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Vehicle Type (Car/Bike/Truck):");
		String type = input.next();

		System.out.print ("Hours:");
		int hours= input.nextInt();
		System.out.print("Membership Status (Yes / No):");
		String membership  = input.next();
		System.out.print("Time of Entry(0-23):");
		int time = input.nextInt();

		double rate = 0;
		double total;

		if(type.equalsIgnoreCase("car")){
			rate = 50;
			}else if (type.equalsIgnoreCase("Bike")){
				rate = 20;
				}else if (type.equalsIgnoreCase("Truck")){
					rate = 80;
				}else{
					System.out.println("Invalid vehicle type!");
					return;
				}


		 total = rate*hours;

		if(time>=18 && time<=23){
			total += total*0.30;
		}if(hours>5){
		 total -= total*0.10;
		}if(membership.equalsIgnoreCase("Yes")){
			total -= total*0.20;
		}

		System.out.println("Total Farking Fee: Rs."+ total);

	}
}
 