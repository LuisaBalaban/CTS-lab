package observer;

public class TestObserver {

	public static void main(String[] args) {
		//define th 2 observers
		NetworkModule networkModule=new NetworkModule();
		NetworkEventHandlerInterface notifications=new UINotificationModule();
		NetworkEventHandlerInterface autosave=new AutoSaveModule();
		
		
		//no bservers registered, nothing happens when calling
		networkModule.netwrokStatusChanged(NetworkStatus.UP);
		
		//linking objs that need to react when something haappens
		//we find common contract, afterrhat the observers will be registered to that collection
		//the observer notifies them when somethin happens
		networkModule.registerModule(autosave);
		networkModule.registerModule(notifications);
		networkModule.netwrokStatusChanged(NetworkStatus.UP);

		networkModule.unregisterModule(autosave);
		networkModule.netwrokStatusChanged(NetworkStatus.DOWN);
		

	}

}
