package memento;

import java.util.Date;

public class HeroRestorePoints {
//memento for sueprhero
	String name;
	int lifePoints;
	private String magic;
	
	private Date timeStamp;

	public HeroRestorePoints(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timeStamp=new Date();
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getMagic() {
		return magic;
	}
	
	
	
}
