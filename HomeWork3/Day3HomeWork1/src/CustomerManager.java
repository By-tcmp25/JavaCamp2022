
public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) 
	{
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void save() 
	{ 
		System.out.println("Müşteri kaydedildi:" );
	}
	
	public void Delete()
	{
		System.out.println("Müþteri silindi:" );
	}
	
	public void GiveCredit()
	{
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
	
}
