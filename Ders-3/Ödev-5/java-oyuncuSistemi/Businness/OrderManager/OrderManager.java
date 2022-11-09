package Businness.OrderManager;
import Businness.Services.OrderServices;
import Entity.Campaign;
import Entity.Order;

public class OrderManager implements OrderServices 
{
	//field
	Campaign campaign;
	
	//constructorParameters
	public OrderManager( Campaign campaign) 
	{
		this.campaign = campaign;
	}

	@Override
	public void add(Order order) 
	{
		System.out.println
		(
			"#"+
			order.getId()+
			"Numaralı Sipariş oluşturuldu , '"+
			campaign.getCampaignName()+ 
			"' : adlı kampanya ile "+
			campaign.getCampaignDiscount()+
			"% indirim uygulandı"
		);
	}

	@Override
	public void update(Order order)
	{
		System.out.println("Sipariş güncellendi");	
	}

	@Override
	public void delete(Order order) 
	{
		System.out.println("Sipariş silindi");
	}


}
