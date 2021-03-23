package g1092.sem5.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		DBConnection dbConn1=DBConnection.getConnection("127.0.0.1", "localDB");

		DBConnection dbConn2=DBConnection.getConnection("127.0.0.1", "localDB");

		DBConnection dbConn3=DBConnection.getConnection("10.0.0.1", "prodDB");

		
		System.out.println(dbConn1.hashCode());
		System.out.println(dbConn2.hashCode());
		System.out.println(dbConn3.hashCode());

	}

}
