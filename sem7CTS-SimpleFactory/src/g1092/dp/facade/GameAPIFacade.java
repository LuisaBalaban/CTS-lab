package g1092.dp.facade;

public class GameAPIFacade {
	
	public static void createProfileAnConnect() {
	PlayerProfile profile=new PlayerProfile();
	profile.login();
	profile.getUserSettings();
	
	Subscription subscription=new Subscription();
	subscription.checkSubscription();
	}

}
