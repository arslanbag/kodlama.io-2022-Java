package Entity;

public class Campaign 
{
	//field
	int id; 
	String campaignName;
	double campaignDiscount;
	
	//counstructorParameters
	public Campaign(int id, String campaignName, double campaignDiscount) 
	{
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
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
	
	//campaignName
	public String getCampaignName() 
	{
		return campaignName;
	}
	public void setCampaignName(String campaignName) 
	{
		this.campaignName = campaignName;
	}
	
	//capignDiscount
	public double getCampaignDiscount() 
	{
		return campaignDiscount;
	}
	public void setCampaignDiscount(double campaignDiscount) 
	{
		this.campaignDiscount = campaignDiscount;
	}

}
