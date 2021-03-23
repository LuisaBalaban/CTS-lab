package g1092.sem5.dp.singleton;

public class DBConnection {
	String socket;
	String schema;
	//version 1 - eager approach (create singleton when the clas is loaded
//	private static DBConnection dbConnection=new DBConnection();
	//version 2 - lazy approach
	private static DBConnection dbConnection=null;
	//class static initializier
	//uses the class lazy-loading approach
	static {
		//OR HERE
		//called/exec only once when the class is loaded by java virtual machine.
		System.out.println("Loading database connection string");
	}
	//constructor initializer
	{
		
		//executed before each constructor call
		System.out.println("Init connection string");
		
	}
	
	private DBConnection() {
		System.out.println("Creating a DB conenction");
		
	}

	private DBConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}

	//the method used to return the reference to the unique object
	public static DBConnection getDbConnection() {
		//access a local settings file to get credentials and connection string here OR 
		
		if(DBConnection.dbConnection==null)
		{
			dbConnection=new DBConnection();
		}
		return DBConnection.dbConnection;
	}
}
