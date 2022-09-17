package multiDimrnsionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] city= new String[3][3];
		
		city[0][0] = "New york";
		city[0][1] = "Florida";
		city[0][2] = "Texas";
		city[1][0] = "California";
		city[1][1] = "Ohio";
		city[1][2] = "Utah";
		city[2][0] = "New jersey";
		city[2][1] = "Colorado";
		city[2][2] = "Oregon";

		for(int i = 0; i<=2 ; i++) {
			System.out.println("................................");
			for(int j =0; j<=2; j++) {
				System.out.println(city[i][j]);
			}
			
		}
		
	}

}
