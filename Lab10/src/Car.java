
public class Car extends Vehicle{
	private double mileage;
	private int passengers;
	
	//default constructors
	public Car()
	{
		super();
		this.setMileage(0);
		this.setPassengers(0);
	}
	
	//parameterized constructor
	public Car(String xManuName, int xCylinders, String xOwnersName, double xMileage, int xPassengers)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}
	
	//setters and getters
	public double getMileage() 
	{
		return mileage;
	}

	public void setMileage(double mileage) 
	{
		this.mileage = mileage;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) 
	{
		if(passengers > 0)
		{
			this.passengers = passengers;
		}
		else
		{
			System.out.println("Invalid value for passengers!");
		}
		
	}
	
	//Equals statement tests if everything is true
	public boolean equals(Car c)
	{
		if(getManuName() == c.getManuName() && getCylinders() == c.getCylinders() && getOwnersName() == c.getOwnersName() && mileage == c.mileage && passengers == c.passengers)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//to string statements
	public String toString()
	{
		return "Manufacturer's name: " + getManuName() + "Number of cylinders: " + getCylinders() + "Owner's Name: " + getOwnersName() + "Gas Mileage: " + this.mileage + "Number of Passengers: " + this.passengers;
	}
}
