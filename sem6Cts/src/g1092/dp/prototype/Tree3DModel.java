package g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable{
	
	String color;
	int height;
	ArrayList<Integer> points;
	public Tree3DModel(String color, int height) {

		System.out.println("Loading the 3d model..");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.points=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<20;i++)
		{
			this.points.add(random.nextInt(1000));
		}
		System.out.println("Applying color..");
		this.color = color;
		this.height = height;
		System.out.println("Rendering final 3d model");
	}
	private Tree3DModel() {
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//it s a mistake, we still pay the price of regoing through the constructor
//		Tree3DModel copy=new Tree3DModel(this.color, this.height);
		
		Tree3DModel copy=new Tree3DModel();
		copy.color=this.color;//copying is faster than regenerating
		copy.height=this.height;
		copy.points=(ArrayList<Integer>)this.points.clone();
		
		
//		if(copy.points==this.points)//if the 2 array refs are the same->shallow copy
//			System.out.println("They are the same");
//		else
//			System.out.println("They are diff");
//		System.out.println("Frst array");
//		for(int i=0;i<this.points.size();i++)
//		{
//			System.out.println(this.points.get(i)+" ");
//		}
//		System.out.println("Second array");
//		this.points.set(0, 9999);
//		for(int i=0;i<copy.points.size();i++)
//		{
//			System.out.println(copy.points.get(i)+" ");
//		}
//		//copy.points=this.points;
		return copy;
	}
	
	

}
