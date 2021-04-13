package sem.g1092.dp.adapter.Disney;

public interface DisneyActions {
	
	public abstract void chnageLocation(int x, int y);
	public abstract void isWounded(int lostLifePoints);
	public abstract void isHealing(int recoveredPoints);
	

	public abstract String getName();
	public abstract int getPower();
}
