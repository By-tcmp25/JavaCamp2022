package abstrackDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customermanager = new CustomerManager();
		customermanager.databaseManager = new MySqlDatabaseManager();
		customermanager.GetCustomers();
		
		
	}

}
