
import java.util.Scanner;

public class Game{

	public static void main(String[] args) {
		startUp();
	}
	
	public static void startUp() { 
	
		System.out.println("WELKOM BIJ MASTERMIND");
		System.out.println("Speler 1 mag een code invoeren:");
		Scanner codeToGuessScanner = new Scanner(System.in);
		String codeToGuess = codeToGuessScanner.nextLine();
		
		if(codeToGuess.length() != 4) { 
			System.out.println("CODE MUST BE 4 NUMBERS");
			startUp();
		}
		else {
		System.out.println("code to guess is:  "+ codeToGuess);
		System.out.println("Hit S to start game with this code");
		System.out.println("Hit q to enter other code");
		} 
		Scanner confirmCodeScanner = new Scanner(System.in);
		String confirmCode = confirmCodeScanner.nextLine();
		
		if(confirmCode.equals("s")) { 
			char[] codeToGuessArray = codeToGuess.toCharArray();
			
			playing.letsgo(codeToGuessArray);
		}
		if(confirmCode.equals("q")) { 
			startUp();
		}
		
	}


}
