import java.util.Scanner;

public class CovidReport {
	
	private int regionCode;
	private int requestCode;

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter request code: Retrieve - 1 | Modify - 2");		
		int requestCode = scan.nextInt();
		
		// If 1 => retrieve data
		
		System.out.println("Enter region code: World - 1 | USA - 2 | WSU - 3");
		int regionCode = scan.nextInt();
		
		USA usa = new USA();
	
		if (regionCode == 2) {
			
		
			int cases = usa.getnumcases();
			int dealth = usa.getnumdealth();
			
			
		
			System.out.println("");
			System.out.println("---------USA COVID REPORT---------");
			
			System.out.println("Total cases: " + cases);
			System.out.println("Total dealth: " + dealth);
			System.out.println("-----------------------------------");
		
		}
		
		

	}

}
