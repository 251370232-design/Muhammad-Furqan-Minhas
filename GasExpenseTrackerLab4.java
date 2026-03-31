import java.util.Scanner;
public class GasExpenseTrackerLab4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance travelled: ");
        double distanceTravelled = input.nextDouble();


        System.out.print("Enter the fuel efficiency: ");
        double fuelEfficiency = input.nextDouble();


        System.out.print("Enter the price per Gallon: ");
        double pricePerGallon = input.nextDouble();


        double gallonsOfGasUsed = distanceTravelled/fuelEfficiency;
        System.out.println("No of gallons used during the journey: "+gallonsOfGasUsed);

        double totalPriceOfFuel = gallonsOfGasUsed*pricePerGallon;
        System.out.println("Price of gas during whole journey: "+totalPriceOfFuel);

        double per100Miles = (100.0/fuelEfficiency)*pricePerGallon;
        System.out.println("Fuel used for 100 Miles: "+per100Miles);












    }
}
