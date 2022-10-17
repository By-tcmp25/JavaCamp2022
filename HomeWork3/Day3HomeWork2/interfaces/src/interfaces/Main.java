package interfaces;

public class Main {

	
	public static void main(String[] args) {
		
		ICustomerDal ıcustomerDal = new MySqlCustomerDal();
		ıcustomerDal.add();
		

	}

}
