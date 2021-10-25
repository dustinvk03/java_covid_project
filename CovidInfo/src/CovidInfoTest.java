import java.util.Scanner;

public class CovidInfoTest {
	
	private int regionCode;
	int dealthNum;
	int caseNum;
	

	int[][] dataArray = { {100000000,1000000},{3000000,300000},{10,0} };
	
	
	public int RetrieveCase(int regionCode) {
		return dataArray[regionCode-1][0];

		}
	
	
	public int RetrieveDealth(int regionCode) {
		return dataArray[regionCode-1][1];

		}
	

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int requestCode = 0;
		
		System.out.println("Enter your request code: Retrieve - 1 | Modify - 2");
		
		while (true) {
			
			requestCode = scan.nextInt();
			if ((requestCode == 1) || (requestCode == 2) || (requestCode == 0))
				
				break;
			else 
				System.out.println("request code is wrong, please type again");

		
		}
		
		if (requestCode == 1) {

			
		
			System.out.println("Enter your region code: World - 1 | USA - 2 | WSU - 3");
			
			int code = scan.nextInt();
			
			CovidInfo app = new CovidInfo();
			
			
				
			if (code == 1) { 
				System.out.println("World has " + app.RetrieveCase(code) + " cases and " + app.RetrieveDealth(code) + " dealths");
			}
			else if (code == 2) { 
				System.out.println("USA has " + app.RetrieveCase(code) + " cases and " + app.RetrieveDealth(code) + " dealths");
			}
			else if (code == 3) {
				System.out.println("WSU has " + app.RetrieveCase(code) + " cases and " + app.RetrieveDealth(code) + " dealths");
	
			}
		
		
		}
		
		
		if (requestCode == 2) {
			
			
		}
	
	}
}
