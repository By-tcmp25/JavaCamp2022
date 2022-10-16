package overriding;

public class Main {

	public static void main(String[] args) {
		
//		OgretmenKrediKManager ogretmenkredimanager = new OgretmenKrediKManager();
//		double output = ogretmenkredimanager.calculate(14725);
//		System.out.println(output);
		
		BaseKrediManager[] kredimanagers = new BaseKrediManager[] 
				{new OgretmenKrediKManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		for (BaseKrediManager kredimanager : kredimanagers) {
			System.out.println(kredimanager.calculate(10000));
			
		}
		
		
		
		
		

	}

}
