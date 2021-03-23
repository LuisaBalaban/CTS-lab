package g1092.sem5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("The app started");
//		DBConnection con1=new DBConnection();
//		DBConnection con2=new DBConnection();
//		
		
		DBConnection con1=DBConnection.getDBConnection();

		DBConnection con2=DBConnection.getDBConnection();

		DBConnection con3=DBConnection.getDBConnection();

		if(con1==con2)
		{
			System.out.println("They are referincing the same obj");
		}//havin both versions of getDBConnection is not ok
		//
		DBConnection con4=DBConnection.getDBConnection("10.0.0.1:3306", "ctsDB");
	
	if(con4==con1)
	{
		System.out.println("They do be referincing the same obj");

	}
	System.out.println(con4.hashCode());
	System.out.println(con1.hashCode());

	}

}
