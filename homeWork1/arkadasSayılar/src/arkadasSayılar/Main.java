package arkadasSayılar;

public class Main {

	public static void main(String[] args) {
		
		int num = 162;
		int num1 = 60;
		int toplam = 0;
		int toplam1 = 0;
		
		for(int i=1; i<num1; i++) {
			if(num%i==0) {
				toplam = toplam +i;
			}
			
		}
		
		for(int i=1; i<num;i++) {
			if(num1 % i == 0) {
				toplam1 = toplam1 + i;
				
			}
		}
		
		if(num == toplam1 && num1 == toplam) {
			System.out.println("arkadaşlar...");
			
		}
		else {
			System.out.println("düşmanlar...");
		}
		
	}

}
