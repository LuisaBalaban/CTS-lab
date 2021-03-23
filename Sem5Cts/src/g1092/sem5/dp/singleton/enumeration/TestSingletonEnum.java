package g1092.sem5.dp.singleton.enumeration;


public class TestSingletonEnum {

	
	static void useDBConnection() {
		DBConnection dbConnection=DBConnection.DBConnection;
		System.out.println("dbconnection.... "+ dbConnection);
	}
	public static void main(String[] args) {
		DBConnection con1=DBConnection.getDBConnection();
		DBConnection con2=DBConnection.getDBConnection();
		System.out.println("first connection "+con1.hashCode());
		System.out.println("second connection" +con2.hashCode());
		

	}

}
