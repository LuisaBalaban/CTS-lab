package observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {

	//list of observers
	List<NetworkEventHandlerInterface> modules=new ArrayList<>();
	public void registerModule(NetworkEventHandlerInterface module)
	{
		modules.add(module);
	}
	//we need to allow osbervers to decide when they want to unregister
	//for events
	public void unregisterModule(NetworkEventHandlerInterface module) {
		modules.remove(module);
	}
	public void netwrokStatusChanged(NetworkStatus status) {
		if(status==NetworkStatus.UP)
		{
			for(NetworkEventHandlerInterface module: modules)
			{
				module.notifyNetworkUp();
			}
		}
		if(status==NetworkStatus.DOWN)
		{
			for(NetworkEventHandlerInterface module: modules)
			{
				module.notifyNetworkDown();
			}
		}
	}
}
