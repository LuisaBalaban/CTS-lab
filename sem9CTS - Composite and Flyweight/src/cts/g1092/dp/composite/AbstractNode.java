package cts.g1092.dp.composite;

public abstract class AbstractNode implements NPCActions {
//we take the interface others are giving us, and from the
	//composite perspective we also need a way to handle abstract nodes
	//so we define this
	public abstract void addNode(AbstractNode node);
	public abstract void removeNode(AbstractNode node);
	public abstract AbstractNode getNode(int index);
	//now we have an abstract class for our AsbtractComponent
}
