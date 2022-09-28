package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	
		Product pro = new Product();
		pro.id = 115;
		pro.name="laptop";
		pro.price= 13450;
		pro.description = "Asus laptop";
		pro.stock = 8;
		
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
