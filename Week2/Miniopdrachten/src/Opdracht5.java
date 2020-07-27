import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		
		String wachtwoord = "java";
		boolean radenMagNog = true;
		int raadPogingen = 0;

		
		while (radenMagNog) { 

			Scanner sc = new Scanner(System.in);

			String input;

			input = sc.nextLine();
	    
			//input vergelijken, bij fout poging eraf.
			if(input.contentEquals(wachtwoord)) { 
	    	System.out.println("CORRECT geraden!");
			}
			else { 
				System.out.println("fout geraden, probeer het nog eens");
				raadPogingen++;
				
				if (raadPogingen > 2) { 
					radenMagNog = false;
				}
			}
			
		} 
		if (!radenMagNog) { 
			System.out.println("HELAAS, teveel (3) foute pogingen.");
		}
		

	}

}
