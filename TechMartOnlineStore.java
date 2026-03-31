public class TechMartOnlineStore{
	public static void main(String [] args ) {
		String storename = "PTechMart.com";
		String costumername = "Muhammad Furqan Minhas";
		String orderDateTime = "11-24-2025    10:40";


		String item01 = "Apple 12.9 iPad Pro M2 Chip,MNXY3 (Late 2022, 2TB)";
		int qty01 = 2;
		double price01 = 575000;


		String item02 = "Apple MacBook Air M1 Chip 13.3  (Late 2020, GOLD)";
		int qty02 = 1;
		double price02 = 340000;


		String item03 = "Sony Alpha a7R V  Digital Camera (Body Only)";
		int qty03 = 2;
		double price03 = 1075000;


		String item04 = "Apple Airpods Max SPACE GREY with Black Headband";
		int qty04 = 1;
		double price04 = 164000;


		double total01 = qty01*price01;
		double total02 = qty02*price02;
		double total03 = qty03*price03;
		double total04 = qty04*price04;



		double nettotal = total01 + total02 + total03 + total04;



		double deliverycharges = 1000;

		double servicecharges = nettotal*0.05;
		
		double finalammount =  nettotal + deliverycharges + servicecharges;

		System.out.println("________________________________________________");
		System.out.println("_______________________________________________");
		System.out.println("\t\t\tTechMart Online Store        ");
		System.out.println("_______________________________________________");
		System.out.println("Costumer Name: " +costumername);
		System.out.println("Order Date & Time: " +orderDateTime);
		System.out.println("_________________________________________________");
		System.out.println("Product \t\t\t\t\t\t Qty \t\tUnit Price \t Total");
		System.out.println("_________________________________________________");
		System.out.println(item01+" \t "+qty01+"\t \t"+price01+"\t "+total01);
		System.out.println(item02+" \t "+qty02+"\t \t"+price02+"\t "+total02);
		System.out.println(item03+" \t\t "+qty03+"\t \t"+price03+"\t "+total03);
		System.out.println(item04+" \t "+qty04+"\t \t"+price04+"\t "+total04);
		System.out.println("________________________________________________");
		System.out.println("Net Total:\t\t " +nettotal);
		System.out.println("Delivery Charges:\t " +deliverycharges);
		System.out.println("Service Charges (5%):\t " +servicecharges);
		System.out.println("_________________________________________________");
		System.out.println("Final Ammount: " +finalammount);
		System.out.println("__________________________________________________");
		System.out.println("__________________________________________________");
		System.out.println("       Thank You for Shopping!       ");
		System.out.println("__________________________________________________");
		System.out.println("__________________________________________________");
		System.out.println("Developed by Muhammad Furqan Minhas");
 

		

			
	}
} 