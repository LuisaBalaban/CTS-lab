package observer;

public interface NetworkEventHandlerInterface {

	//method that observable calls on observers
	public void notifyNetworkDown();
	public void notifyNetworkUp();
	
}
