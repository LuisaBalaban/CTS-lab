package cts.g1092.dp.composite;

public class TestComposite {

	public static void main (String[] args)
	{
		Group gr1=new Group("red team");
		gr1.addNode(new NPCCharacter("Soldier 1", 100));
		gr1.addNode(new NPCCharacter("Soldier 2", 100));
		
		AbstractNode gr2=new Group("Blue team");
		gr2.addNode(new NPCCharacter("Soldier 3",100));
		gr2.addNode(new NPCCharacter("Demolition team",300));
		
		AbstractNode levelGroup=new Group("Level 2");
		levelGroup.addNode(new NPCCharacter("Level Boss", 500));
		levelGroup.addNode(gr1);
		levelGroup.addNode(gr2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();//moves level boss

}
}
