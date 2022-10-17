package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "fare";
		product.price = 100;
		product.İd= 12015;
		
		manager.add(product);

	}

}
