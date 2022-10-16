
public class CustomerManager  {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
		
	}
	public void add() {
		System.out.println("customer Added");
		this.logger.log("log message");
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log("data base message");
		//bagımlı sıstem yapmamak için sureklı new yazmıycaz 
		
	}
}
