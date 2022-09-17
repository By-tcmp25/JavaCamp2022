package sesliHarfler;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		
		switch (harf) {
		case 'A':  // char ve case leri tek tırnakla yazmak gerekiyormuş yoksa hata veriyo nedenini bilmiyorum (") değil 
		case 'I':  // bununla yazılması gerekiyor (')
		case 'O':
		case 'U':
			System.out.println("kalın sesli harf..");
			break;
		default:
			System.out.println("ince sesli harf...");
		
			
		
		}
		

	}

}
