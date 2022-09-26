package variableArguments;

public class Main {

	public static void main(String[] args) {
		
		String message = "weather very good today";
		String newMessage = şehirVer();
		System.out.println(newMessage);
		int num = topla(5,7);
		int toplam = topla2(2,3,5,6,7,8); 
		System.out.println(num);
		System.out.println(toplam);
		
		
	}
	
	public static void add() {
		System.out.println("added");
		
	}
	
	public static void delete() {
		System.out.println("deleted");
		
	}
	
	public static void update() {
		System.out.println("updated");
		
	}
	
	public static int topla(int num1,int num2) {
		int toplam = num1 + num2;
		return toplam ;
		
	}
	
	public static int topla2(int... numbers) {
		
		int toplam = 0;
		for (int num : numbers) {
			toplam += num;
			
		}
		return toplam;
		
	}
	
	public static String şehirVer() {
		
		return "Ankara";
		
	}
	
	
	
	
	

}
