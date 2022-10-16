package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	
public double calculate(double amount) {
		
		double result = amount * 1.09;
		
		return result;
	}

}
