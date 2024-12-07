//Mackenzie Jean Helms
public class Concert {
	private String name;
	private int capacity;
	private double priceByPhone;
	private double priceAtVenue;
	private int ticketsAtVenue;
	private int ticketsByPhone;
	
	//Default parameters
	public Concert()
	{
		this.name = "";
		this.capacity = 0;
		this.priceByPhone = 0;
		this.priceAtVenue = 0;
		this.ticketsAtVenue = 0;
		this.ticketsByPhone = 0;
	}
	
	//Parameters constructor
	public Concert(String xName, int xCapacity, double xPriceByPhone, double xPriceAtVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	
	//Second parameters constructor
	public Concert(String xName, int xCapacity, int xTicketsByPhone, int xTicketsAtVenue, double xPriceByPhone, double xPriceAtVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setTicketsByPhone(xTicketsByPhone);
		this.setTicketsAtVenue(xTicketsAtVenue);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	//The getters and setters for each variable
	public String getBandName() {
		return name;
	}
	
	public void setBandName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPriceByPhone() {
		return priceByPhone;
	}

	public void setPriceByPhone(double xPriceByPhone) {
		this.priceByPhone = xPriceByPhone;
	}

	public double getPriceAtVenue() {
		return priceAtVenue;
	}

	public void setPriceAtVenue(double xPriceAtVenue) {
		this.priceAtVenue = xPriceAtVenue;
	}
	
	public int getTicketsByPhone()
	{
		return ticketsByPhone;
	}
	
	public void setTicketsByPhone(int xTicketsByPhone)
	{
		this.ticketsByPhone = xTicketsByPhone;
	}
	
	public int getTicketsAtVenue()
	{
		return ticketsAtVenue;
	}
	
	public void setTicketsAtVenue(int xTicketsAtVenue)
	{
		this.ticketsAtVenue = xTicketsAtVenue;
	}
	
	//Other methods
	public int totalNumberOfTicketsSold()
	{
		return ticketsAtVenue + ticketsByPhone;
	}
	
	public int ticketsRemaining()
	{
		return capacity - this.totalNumberOfTicketsSold();
	}
	public void buyTicketsAtVenue(int bV)
	{
		if((this.ticketsRemaining() - bV) >= 0)
		{
			ticketsAtVenue += bV;
		}
		else
		{
			System.out.println("Concert tickets are sold out!");
		}
	}
	public void buyTicketsByPhone(int bP)
	{
		if((this.ticketsRemaining() - bP) >= 0)
		{
			 ticketsByPhone += bP;
		}
		else
		{
			System.out.println("Concert tickets are sold out!");
		}
	}
	public double totalSales()
	{
		//Why is my math wrong here?
		return (ticketsAtVenue * priceAtVenue) + (ticketsByPhone * priceByPhone);
	}

	public int getNumTicketsSoldByPhone() {
	
		return ticketsByPhone;
	}

	public int getNumTicketsSoldAtVenue() {
		
		return ticketsAtVenue;
	}
	
}
