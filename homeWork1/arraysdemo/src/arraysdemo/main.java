package arraysdemo;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		String öğreci1 = "Mehmet";
		String öğrenci2 = "Zahid";
		String öğrenci3 = "Pekince";
		
		
		System.out.println(öğreci1);
		System.out.println(öğrenci2);
		System.out.println(öğrenci3);
		System.out.println("-----------------");
		
		String[] öğreciler = new String[3];
		öğreciler[0] = "jony";
		öğreciler[1] = "deep";
		öğreciler[2] = "bravo";
		
		for(int i = 0; i < öğreciler.length; i++) {
			System.out.println(öğreciler[i]);
		}
			
		}

}
