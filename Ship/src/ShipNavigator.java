//Mackenzie Jean Helms
import java.util.Scanner;
public class ShipNavigator extends Ship{

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		CruiseShip c = new CruiseShip();
		CargoShip c1 = new CargoShip();
		String response = "";
		
		do 
		{
		System.out.println("Enter the name of the ship");
		c.setShipName(key.next());
		
		System.out.println("Enter its launch date (mm/dd/yyyy)");
		c.setLaunchDate(key.next());
		
		System.out.println("Is it a cruiseship or cargo ship?");
		String shipChoice = key.next();
		
		
		if(shipChoice.equalsIgnoreCase("cruise"))
		{
			System.out.println("Enter the ship's passenger capacity");
			c.setPassengerCapacity(key.nextInt());
			
			System.out.println("How many crew members are on this ship?");
			c.setNumCrew(key.nextInt());
			
			System.out.println(c.toString());
		}
		else if(shipChoice.equalsIgnoreCase("cargo"))
		{
			System.out.println("Enter the ship's tonage(DWT)");
			c1.setTonnage(key.nextInt());

			
			System.out.println("Enter the maximum speed of the ship (in MPH)");
			c1.setMaxSpeed(key.nextInt());
			System.out.println(c1.toString());
		}
		else
		{
			System.out.println("Invalid ship type");
		}
		
		System.out.println("Do you want to create another ship object? Type 'yes' or 'no'. ");
		response = key.next();
		
		} while (response.equalsIgnoreCase("yes"));
			System.out.println("Exiting the program!");
			System.exit(0);
	
	}

}
