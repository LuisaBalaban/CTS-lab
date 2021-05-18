package observer;

public class UINotificationModule implements NetworkEventHandlerInterface{

	@Override
	public void notifyNetworkDown() {
		System.out.println("Notify player: Network lost");
		
	}

	@Override
	public void notifyNetworkUp() {
		System.out.println("Notify Player: Connection up");
		
	}

	
}
