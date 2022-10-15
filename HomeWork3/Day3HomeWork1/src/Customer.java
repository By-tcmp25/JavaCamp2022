
public class Customer {

	
	
	public Customer() {
		
		System.out.println("Müşteri Nesnesi başlatıldı"); 
		
	}
	private int id;
	private String City;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	

}
