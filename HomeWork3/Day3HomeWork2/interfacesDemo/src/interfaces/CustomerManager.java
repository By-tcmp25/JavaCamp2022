package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerdal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerdal = customerDal;
	}

	public void add() {
		
		customerdal.add();
	}
}
