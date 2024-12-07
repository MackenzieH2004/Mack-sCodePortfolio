//Mackenzie Jean Helms
public class Vehicle {
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//default constructor
	public Vehicle()
	{
		this.setManuName("");
		this.setCylinders(0);
		this.setOwnersName("");
	}
	
	//parameterized constructor
	public Vehicle(String xManuName,int xCylinders, String xOwnersName)
	{
		this.setManuName(xManuName);
		this.setCylinders(xCylinders);
		this.setOwnersName(xOwnersName);
	}

	//setters and getters
	public String getManuName() {
		return manuName;
	}

	public void setManuName(String xManuName) {
		if(xManuName != null && !xManuName.isEmpty())
		{
			this.manuName = xManuName;
		}
		else
		{
			System.out.println();
		}
		
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		if (cylinders > 0)
		{
			this.cylinders = cylinders;
		}
		else
		{
			
		}
	
	}

	public String getOwnersName() {
		
		return ownersName;
	}

	public void setOwnersName(String xOwnersName) {
		this.ownersName = xOwnersName;
	}
	
	
	//Equals statement checks if all statements are true
	public boolean equals(Vehicle v)
	{
			if(this.manuName.equalsIgnoreCase(manuName) && this.cylinders == v.cylinders && this.ownersName.equalsIgnoreCase(ownersName))
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	
	//To string statement
	public String toString()
	{
		return "Manufacturer's name: " + this.manuName + "Number of cylinders: " + this.cylinders + "Owner's Name: " + this.ownersName;
	}
}
