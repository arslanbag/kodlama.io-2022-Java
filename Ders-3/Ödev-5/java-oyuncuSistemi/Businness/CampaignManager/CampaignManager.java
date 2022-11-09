package Businness.CampaignManager;
import Businness.Services.CampaignServices;
import Entity.Campaign;

public class CampaignManager implements CampaignServices
{
	

	@Override
	public void add(Campaign campaign) 
	{
		System.out.println("Kampanya sisteme eklendi");
	}

	@Override
	public void update(Campaign campaign) 
	{
		System.out.println("Kampanya güncellendi");
	}

	@Override
	public void delete(Campaign campaign) 
	{
		System.out.println("Kampanya silindi");
	}

}
