package sem11CTS.chain;

public class BroadcastMessageHandler extends ChatHandler {
	
	public void processMessage(ChatMessage msg)
	{
		if(msg.destination.toLowerCase().contentEquals("@everyone"))
		{
			System.out.println("@everyone: "+msg.text);
		}
		if(this.next!=null)
		{
			this.next.processMessage(msg);
		}
	}

}
