package staticDemo;

public class ProductManager {

	public void add(Product product) {
		ProductValidator productvalidator = new ProductValidator();
		if(productvalidator.isValid(product)) {
		System.out.println("eklendi");
		}
		else {
			System.out.println("ürün bilgileri");
		}
	}
}
