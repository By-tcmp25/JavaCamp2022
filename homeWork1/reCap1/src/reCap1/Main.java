package reCap1;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 17;
		int num2 = 15;
		int num3 = 14;
		
		int bigAll = num1;
		
		if (bigAll < num2) {
			bigAll = num2;
		}
		else if(bigAll < num3) {
			bigAll = num3;
			

		}
		
		System.out.println(bigAll);

	}

}
