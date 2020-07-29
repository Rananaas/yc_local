import java.util.Arrays;
import java.util.Scanner;

public class playing {

	public static void letsgo(char[] codeToGuessArray) { 
		System.out.println("PLAYING GAME!, code to guess will be" + Arrays.toString(codeToGuessArray)); 

		//int blackPins = 0;
		//int whitePins = 0;
		int guessesLeft = 10;
		
		boolean guessing = true;
		player2turn(codeToGuessArray, guessing, guessesLeft);
		
		
		
	}

	private static void player2turn(char[] codeToGuessArray, boolean guessing, int guessesLeft) {
		while(guessing) {

		
		System.out.println("PLAYER 2's turn, take a guess! ...  GuessesLeft = " + guessesLeft);
		int whitePins = 0;
		int blackPins = 0;
		Scanner guessScanner = new Scanner(System.in);
		String guess = guessScanner.nextLine();
		char[] currentGuessArray = guess.toCharArray();
		char[] guessResultArray = { 0,0,0,0};
		

		if(guess.length() != 4) { 
			System.out.println("guess must be 4 numbers!");
			player2turn(codeToGuessArray, guessing, guessesLeft);
			
		}
		
		if(guess.length() == 4) { 
		System.out.println("player 2 has guessed: " + Arrays.toString(currentGuessArray));
		} 

		System.out.println("currentGuessArray = "+ Arrays.toString(currentGuessArray) + 
				"   ////   codeToGuessArray = " + Arrays.toString(codeToGuessArray));
		
		if(Arrays.equals(currentGuessArray, codeToGuessArray)){ 
			System.out.println("ALLES GOED HOERA");
			guessing = false;
			////GAME IS WON !!!
			}
		
		for(int i = 0; i < currentGuessArray.length; i++) { 
			
			//CHECKING FOR BLACKPINS 
			if(currentGuessArray[i] == codeToGuessArray[i]) { 
				//System.out.println("black match found at place:  "+ i + " it is colorNumber: " + codeToGuessArray[i]);
				if(guessResultArray[i] != 'B') {
				blackPins ++;
				guessResultArray[i] = 'B';
				} 
//				else if(guessResultArray[i] == 'W') { 
//					whitePins--;
//					blackPins++;
//					guessResultArray[i] = 'B';
//					}
//				else if(guessResultArray[i] == 'B') { 
//					blackPins --;
//					
//				}
				//System.out.println(Arrays.toString(guessResultArray));
			}
			//CHEKCING FOR WHITEPINS
			if (currentGuessArray[i] != codeToGuessArray[i]) {
				//System.out.println("NO PERFECT MATCHES, checking for whites now");
				
				for(int h = 0; h < codeToGuessArray.length;h++) {
					if (Arrays.asList(codeToGuessArray[i]).contains(guessResultArray[h])) { 
			//	if (Arrays.asList(currentGuessArray[i]).contains(codeToGuessArray[h])) { // BOVEN IS NIEUWE

					//System.out.println("WHITE PIN FOUND AT PLACE " + h +  " it is colorNumber: " + codeToGuessArray[h]);
					
					
					if(guessResultArray[h] != 'W' && guessResultArray[h] != 'B') { 
						guessResultArray[h] = 'W';
						whitePins++;
					}
//					if(guessResultArray[h] == 'B' ) { 
//						whitePins--;
//					}

				}

				}

				}

			}
	
		
		System.out.println("Amount of whitePins: " + whitePins);
		System.out.println("Amount of blackPins: " + blackPins);
		System.out.println(Arrays.toString(guessResultArray));
		// guessAttempts eraf, no left? No more guessing! 
		guessesLeft --;
		if(guessesLeft == 0) { 
			guessing = false;
			System.out.println("PLAYER 2 LOST THE GAME! ");
		}
		}
		
	}
	
		
		
		


}
