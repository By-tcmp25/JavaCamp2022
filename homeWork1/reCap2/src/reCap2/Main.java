package reCap2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = { 1.2 , 1.5 , 1.9 , 1.4};
		double max = myList[0];
		double total=0;
	
		for (double number:myList) {
			if(max<number) {
				
				max = number;
			}
			
			
			total = total + number;
			System.out.println(number);
			
		}
		
		
		System.out.println("toplam = " + total );
		System.out.println("en büyük = " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
