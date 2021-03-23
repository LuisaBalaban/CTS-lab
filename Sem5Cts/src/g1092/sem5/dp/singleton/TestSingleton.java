package g1092.sem5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("The app started");
//		DBConnection con1=new DBConnection();
//		DBConnection con2=new DBConnection();
//		
		
		DBConnection con1=DBConnection.getDbConnection();

		DBConnection con2=DBConnection.getDbConnection();

		DBConnection con3=DBConnection.getDbConnection();

		if(con1==con2)
		{
			System.out.println("They are referincing the same obj");
		}
	}

}
