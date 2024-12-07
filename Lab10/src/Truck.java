
public class Truck extends Vehicle{
	//instance variables
	private double loadCap;
	private double towCap;
	
	//default constructor
	public Truck()
	{
		super();
		this.setLoadCap(0);
		this.setTowCap(0);
	}
	
	//parameterized constructor
	public Truck(String xManuName, int xCylinders, String xOwnersName, double xLoadCap, double xTowCap)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setLoadCap(xLoadCap);
		this.setTowCap(xTowCap);
	}

	//setters and getters
	public double getLoadCap() 
	{
		return loadCap;
	}

	public void setLoadCap(double loadCap) 
	{
		if(loadCap > 0)
		{
			this.loadCap = loadCap;
		}
		else
		{
			System.out.println("Invalid value for load cap!");
		}
	}

	public double getTowCap() 
	{
		return towCap;
	}

	public void setTowCap(double towCap) 
	{
		if(towCap > 0)
		{
			this.towCap = towCap;
		}
		else
		{
			System.out.println("Invalid value for tow cap!");
		}
		
	}
	
	//Equals statement checks if all statements are true
	public boolean equals(Truck t)
	{
		if(loadCap == t.loadCap && towCap == t.towCap && getManuName().equalsIgnoreCase(t.getManuName()) && getCylinders() == t.getCylinders() && getOwnersName().equals(t.getOwnersName()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//To string
	public String toString()
	{
		return "Manufacturer's name: " + getManuName() + "Number of cylinders: " + getCylinders() + "Owner's Name: " + getOwnersName() + "Load Capacity: " + this.loadCap + "Tow Capacity: " + this.towCap;
	}
}
