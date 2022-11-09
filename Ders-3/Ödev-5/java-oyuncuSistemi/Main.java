import Businness.CampaignManager.CampaignManager;
import Businness.OrderManager.OrderManager;
import Businness.PersonManager.GamerManager;
import Businness.ValidateManager.NewEStateUserValidationManager;
import Businness.ValidateManager.UserValidationManager;
import Entity.Campaign;
import Entity.Gamer;
import Entity.Order;

public class Main {

	public static void main(String[] args) 
	{
		//gamer + validate system
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.add(new Gamer(1, "Aykut", "Arslanbağ", 1995,0));
		
		//new gamer + validate system
		gamerManager = new GamerManager(new NewEStateUserValidationManager());
		gamerManager.add(new Gamer(1, "Aykut", "Arslanbağ", 1995,0));
		
		//campaign 
		Campaign campaign = new Campaign(1, "Yılbaşı kampanyası", 5);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		//order
		Order order = new Order(1,1,1500,true);
		OrderManager orderManager = new OrderManager(campaign);
		orderManager.add(order);
		orderManager.update(order);
		orderManager.delete(order);
	}

}
