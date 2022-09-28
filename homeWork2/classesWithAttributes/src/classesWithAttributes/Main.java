package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	
		Product pro = new Product();
		pro.setId(1);
		pro.setName("aaaa");
		pro.setPrice(1000);
		pro.setDescription("Asus laptop");
		pro.setStock(8);
		
		System.out.println(pro.getId());
		
		/*
		System.out.println(pro.description);
		System.out.println(pro.id);
		System.out.println(pro.name);
		System.out.println(pro.price);
		System.out.println(pro.stock);
		*/
		
		ProductManager prom = new ProductManager();
		prom.Add(pro);
		
		
		
		
		
	}

}
