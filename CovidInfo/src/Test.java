import java.util.Scanner;

public class Test {
	
	private int regionCode;
	private int requestCode;

	

public class US {
	

	private int numcases = 2222;
	private int numdealth = 22;		
		
	
	
	public int getnumcases() {
		return numcases;
		
	}
	
	public int getnumdealth() {
		return numdealth;
		
	}
	

	
}
	
	
	public static void main(String[] args) {
		
		int requestCode = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your request: Retrieve - 1 | Modify - 2 | Exit - 0");
		
	
		
		while (true) {
			
			requestCode = scan.nextInt();
			if ((requestCode == 1) || (requestCode == 2) || (requestCode == 0))
				
				break;
			else 
				System.out.println("request code is wrong, please type again");

		
		}
		
		
		// If 1 => retrieve data
		

		while ((requestCode == 1) || (requestCode == 2)) {
			
			if (requestCode == 1) {
			
			System.out.println("Enter region code: World - 1 | USA - 2 | WSU - 3");
			int regionCode = scan.nextInt();
			
			World world = new World();
			US us = new US();
			WSU wsu = new WSU();
			

			if (regionCode == 1) {
				
				
				int cases = world.getnumcases();
				int dealth = world.getnumdealth();
					
					
				
				System.out.println("");
				System.out.println("---------WORLD COVID REPORT---------");
					
				System.out.println("Total cases: " + cases);
				System.out.println("Total dealth: " + dealth);
				System.out.println("-----------------------------------");
			}
		
			else if (regionCode == 2) {
				
			
				int cases = us.getnumcases();
				int dealth = us.getnumdealth();
				
				
			
				System.out.println("");
				System.out.println("---------USA COVID REPORT---------");
				
				System.out.println("Total cases: " + cases);
				System.out.println("Total dealth: " + dealth);
				System.out.println("-----------------------------------");

			}
			
			else if (regionCode == 3) {
					
					
				int cases = wsu.getnumcases();
				int dealth = wsu.getnumdealth();

				
				System.out.println("");
				System.out.println("--------- WSU COVID REPORT---------");
					
				System.out.println("Total cases: " + cases);
				System.out.println("Total dealth: " + dealth);
				System.out.println("-----------------------------------");
			
			}
			}
			
			if (requestCode == 2) {
				System.out.println("Enter region code: World - 1 | USA - 2 | WSU - 3");
				int regionCode = scan.nextInt();
				
				World world = new World();
				USA usa = new USA();
				WSU wsu = new WSU();

			}
			
			else 
				System.out.println("Sorry, wrong code");
				
			System.out.println("New request code? ");
			requestCode = scan.nextInt();
			
			
				

		}
		


	}

}
