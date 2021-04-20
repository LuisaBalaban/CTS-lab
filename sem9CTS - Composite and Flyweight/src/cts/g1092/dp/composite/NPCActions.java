package cts.g1092.dp.composite;
//all characters the game controls have this interface
public interface NPCActions {

	//these are the specific methods
	public void attack(String playerName);
	public void retreat();
	public void move();
	//they can also be used in Composite class
	
}
