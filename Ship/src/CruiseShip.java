
public class CruiseShip extends Ship{
	//Instance variables get capacity of both crew members and passengers
	private int passengerCapacity;
	private int numCrew;
	
	//Default Constructor
	public CruiseShip()
	{
		super();
		this.passengerCapacity = 0;
		this.numCrew = 0;
	}
	
	//Parameterized Constructor
	public CruiseShip(String xShipName, int xPassengerCapacity, int xNumCrew)
	{
		super(xShipName);
		this.setPassengerCapacity(xPassengerCapacity);
		this.setNumCrew(xNumCrew);
		
	}
	
	//Setters and getters
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public int getNumCrew() {
		return numCrew;
	}
	public void setNumCrew(int numCrew) {
		this.numCrew = numCrew;
	}
	
	public String toString()
	{
		return "Ship name: " + getShipName() + "Crew Capacity: " + numCrew + "Passenger Capacity: " + passengerCapacity;
	}
	
}
