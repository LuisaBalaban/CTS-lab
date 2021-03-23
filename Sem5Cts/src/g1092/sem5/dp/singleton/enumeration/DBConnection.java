package g1092.sem5.dp.singleton.enumeration;


//implementing the singleton as an enum
enum DBConnection {
	DBConnection;
	public static DBConnection getDBConnection() {
		return DBConnection;
	}

}
