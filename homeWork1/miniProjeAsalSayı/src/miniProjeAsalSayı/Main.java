package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		 int  number = 25;
		 int remainder = number % 2;
		 System.out.println(remainder);
		 boolean primeNum = true;
		 
		 for (int i = 2; i< number; i++) {
			 if(number % i == 0) {
				 primeNum = false;
			 }
		 if(primeNum) {
				 System.out.println(number + " this number isn't prime");
				 
			 }
		 else {
				 System.out.println(number + " this number is prime");
			 }
			 
			 // bir şeyi yanlış yaptım ama ney yanlış bulmadım 
			
		}
	}

}
