package cts.g1092.dp.composite;

import java.util.ArrayList;

//composite class
public class Group extends AbstractNode {

	String groupName;
	ArrayList<AbstractNode> nodes=new ArrayList<>();
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;

	}

	@Override
	public void attack(String playerName) {
		for(AbstractNode node : nodes)
		{
			node.attack(playerName);
		}
		
	}

	@Override
	public void retreat() {
		for(AbstractNode node: nodes)
		{
			node.retreat();
		}
		
	}

	@Override
	public void move() {
		throw new UnsupportedOperationException();//if we cant move the group as a whole-> you need to go move each elem inidivudally
		
	}

	@Override
	public void addNode(AbstractNode node) {
		this.nodes.add(node);
		
	}

	@Override
	public void removeNode(AbstractNode node) {
		this.nodes.remove(node);
		
	}

	@Override
	public AbstractNode getNode(int index) {
		return this.nodes.get(index);
	}
	

}
