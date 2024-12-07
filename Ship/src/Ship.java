
public class Ship {
	//Instance Variables
	private String shipName;
	private String launchDate;
	
	//Default Constructor
	public Ship()
	{
		this.shipName = "";
		this.launchDate = "";
	}
	
	//Constructor
	public Ship(String xShipName)
	{
		this.setShipName(xShipName);
	}
	
	//Setters and getters
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	//If then statements for launch date
	public void setLaunchDate(String launchDate) {
		
		if(Character.isDigit(launchDate.charAt(0)) && Character.isDigit(launchDate.charAt(1)) && Character.isDigit(launchDate.charAt(3)) && Character.isDigit(launchDate.charAt(4)) && Character.isDigit(launchDate.charAt(6)) && Character.isDigit(launchDate.charAt(7)) && Character.isDigit(launchDate.charAt(8)) && Character.isDigit(launchDate.charAt(9)))
		{
			String strMonth = launchDate.substring(0, 2);
			String strDays = launchDate.substring(3, 5);
			String strYear = launchDate.substring(6, 10);
			
			//Changes string to integers
			int Month = Integer.parseInt(strMonth);
			int Days = Integer.parseInt(strDays);
			int Year = Integer.parseInt(strYear);
			
			//Setting default date to 01/01/1990
			if(Month < 1 || Month > 12)
			{
				System.out.println("Invalid values for month");
				launchDate = "01/01/1990";
			}
			
			if(Days < 1 || Days > 31)
			{
				System.out.println("Invalid values for day");
				launchDate = "01/01/1990";
			}
			if(Year < 1990 || Year > 2019)
			{
				System.out.println("Invalid values for year. Year must be between 1990 and 2019.");
				launchDate = "01/01/1990";
			}
		}
		else
		{
			launchDate = "01/01/1990";
		}
		
		this.launchDate = launchDate;
		
	}
	
	public String toString()
	{
		return "Ship name: " + shipName + "\nLaunch Date: " + launchDate;
	}
	
}
