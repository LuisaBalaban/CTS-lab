package memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {
//to store multiple mementos
	List<HeroRestorePoints> restorePoints=new ArrayList<>();
	public void addRestorePoint(HeroRestorePoints point)
	{
		this.restorePoints.add(point);
	}
	public HeroRestorePoints getrestorePoints(int index)
	{
		if(index<0||index>=restorePoints.size())
			{
			throw new UnsupportedOperationException();
			}
		else
		{
			HeroRestorePoints point=restorePoints.get(index);
			restorePoints.remove(index);
			return point;
		}
	}
}
