package sem11CTS.chain;

public class ChatMessage {

	public ChatMessage(String destination, String text, int priority) {
		this.destination=destination;
		this.text=text;
		this.priority=priority;
	}
	String destination;
	String text;
	int priority;
	
	
}
