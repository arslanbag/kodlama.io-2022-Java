package Entity;

public class Order 
{
	//field
	int id; 
	int customerId;
	double totalCost; 
	boolean shipmentStatus;
	
	//constructorParameters
	public Order(int id, int customerId, double totalCost, boolean shipmentStatus) 
	{
		super();
		this.id = id;
		this.customerId = customerId;
		this.totalCost = totalCost;
		this.shipmentStatus = shipmentStatus;
	}

	//id
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	//customerId
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	
	//totalCost
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) 
	{
		this.totalCost = totalCost;
	}
	
	//shipmentStatus
	public boolean isShipmentStatus() 
	{
		return shipmentStatus;
	}
	public void setShipmentStatus(boolean shipmentStatus) 
	{
		this.shipmentStatus = shipmentStatus;
	}

	
}
