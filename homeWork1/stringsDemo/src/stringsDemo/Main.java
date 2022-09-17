package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesage = "The weather is very nice today";
		//-------------------------------------------------------------
		System.out.println(mesage);
		//-------------------------------------------------------------
		System.out.println("number of characters: " +mesage.length()); // metin uzunluğunu yazar
		//-------------------------------------------------------------
		System.out.println("7th character: " +mesage.charAt(7)); // istenen harfi yazar
		//------------------------------------------------------------- 
		System.out.println(mesage.concat(" Awesome!! ")); // sonuna ekleme yapar
		//-------------------------------------------------------------
		System.out.println(mesage.startsWith("T"));// true flase arar baştaki harf yazılan mı 
		//-------------------------------------------------------------
		System.out.println(mesage.endsWith("r"));// true flase arar sondaki harf yazılan mı 
		//-------------------------------------------------------------
		char[] characters = new char[9];
		mesage.getChars(0, 9,characters, 0);
		System.out.println(characters);
		//-------------------------------------------------------------
		System.out.println(mesage.indexOf("a")); //metinde baştan arama yapar kaçıncı olduğunu yazar
		//-------------------------------------------------------------
		System.out.println(mesage.lastIndexOf("c"));  /*metinde kaçıncı olduğunu sonran arar*/
		//-------------------------------------------------------------
		System.out.println(mesage.replace(" ", "-"));
		//-------------------------------------------------------------
		System.out.println(mesage.substring(8,15));
		//-------------------------------------------------------------
		for(String word : mesage.split(" ")) {
			System.out.println(word);
			
		}
		//-------------------------------------------------------------
		System.out.println(mesage.toLowerCase());
		//-------------------------------------------------------------
		System.out.println(mesage.toUpperCase());
		//-------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
