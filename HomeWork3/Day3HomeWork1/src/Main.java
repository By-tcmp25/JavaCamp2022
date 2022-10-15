
public class Main {

	public static void main(String[] args) {
		
		
		
		CreditManager credimanager = new CreditManager();
		credimanager.Hesapla();
		credimanager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Ankara");
		
		Person person = new Person();
		person.setNationalIdentity("21212121");
		
		Company company = new Company();
		company.setTaxNumber("12345");
		company.setCompanyName("arçelik");
		company.setId(1002030);
		
		
		CustomerManager customermanager = new CustomerManager(new Person(),new TeacherCreditManager());
		customermanager.GiveCredit();
		
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
		
		
		
	}

}


