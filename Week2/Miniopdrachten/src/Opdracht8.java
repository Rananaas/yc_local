import java.util.Arrays;

public class Opdracht8 {

	public static void main(String[] args) {
		 
			String org = "Bruine bloemen!";
			char[] stringToArray = org.toCharArray();
			//System.out.println(stringToArray);
			// klinkeropties
			char[] klinkers = { 'a','e','i','o','u'} ;
			char klinkerPrint;
			
			for(int i = 0; i < stringToArray.length; i++) { 
				//System.out.println(stringToArray[i]);
				char currentChar = stringToArray[i];
				//System.out.println(currentChar);
			
					for(int j=0; j<klinkers.length; j++) { 
						if(klinkers[j] == currentChar) { 
							
							System.out.println(currentChar + "*");
							// deze nodig, zodat niet dubbel nog eens in printArray
							i++;
						}
						
					} 

						System.out.println(stringToArray[i]);

				
				}
			}


	

}
