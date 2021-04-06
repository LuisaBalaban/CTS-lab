package g1092.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		//in order to connect to the game from an external app you need to 
		//1. create player profile and login
		PlayerProfile profile=new PlayerProfile();
		profile.login();
		profile.getUserSettings();
		
		//2.check subscription
		Subscription subscription=new Subscription();
		subscription.checkSubscription();
		
		
		//using the simplified way - FACADE
		GameAPIFacade.createProfileAnConnect();//we do it for our clients/other devs
		
		//3. get mai character
		SuperHero superHero=new SuperHero("Superman", new Helmet(), new SuperPower());
		

	}

}
