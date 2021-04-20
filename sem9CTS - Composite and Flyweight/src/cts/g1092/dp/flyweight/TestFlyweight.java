package cts.g1092.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {
		//create array list of npc coord for the soldiers
		List<NPCCoordinates> soldiers=new ArrayList<>();
		soldiers.add(new NPCCoordinates(10,10,10,"Red"));
		soldiers.add(new NPCCoordinates(50,10,10,"Green"));
		soldiers.add(new NPCCoordinates(40,10,10,"Yellow"));
		soldiers.add(new NPCCoordinates(100,100,10,"Pink"));
		
		Model3DFlyweightInterface soldierModel=Model3DFactory.getModel(ModelType.SOLDIER);
		for(NPCCoordinates soldierCoord : soldiers)
		{
			soldierModel.display(soldierCoord);
		}

	}

}
