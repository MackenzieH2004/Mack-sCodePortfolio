
public class CargoShip extends Ship{

	private int tonnage;
	private int maxSpeed;
	
	//default constructor
	public CargoShip()
	{
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;
	}
	
	//parameterized constructor
	public CargoShip(String xShipName,int xTonnage, int xMaxSpeed)
	{
		super(xShipName);
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xMaxSpeed);
		
	}
	//setters and getters
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String toString()
	{
		return "Ship name: " + getShipName() + "\nTonnage: " + tonnage + "\nmaxSpeed: " + maxSpeed;
	}
}
