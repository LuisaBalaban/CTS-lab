package sem11CTS.chain;

public class TestChain {

	public static void main(String[] args)
	{
		ChatHandler broadcastNode=new BroadcastMessageHandler();
		ChatHandler privateNode=new PrivateMessageHandler();
		ChatHandler filterNode=new EnglishFilter(7);
		
		//follow rule from narrow to generic - private is more narrow, 
		//just for a specific player
		filterNode.setNext(privateNode);
		privateNode.setNext(broadcastNode);
		//broadcast node has no following node, but if we add new bullets
		//changing our solution - we dont need to change exitsing classes
		//we just add a new subclass of ChatHandler and link that node somewhere in the chain
		 
		filterNode.setNext(null);
		ChatHandler chatServer=filterNode;
		chatServer.processMessage(new ChatMessage("@everyone", "Hello", 0));
		chatServer.processMessage(new ChatMessage("@everyone", "hit superman", 0));
		chatServer.processMessage(new ChatMessage("@john", "Hello! Lets join the party", 0));
		chatServer.processMessage(new ChatMessage("@everyone", "Where is the one", 0));


	}
}
