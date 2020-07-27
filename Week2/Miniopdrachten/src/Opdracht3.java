import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		
		boolean doorcijferen = true;
		
		while(doorcijferen) { 
			
			//vraagOmCijfer();	
			int cijfer = vraagOmCijfer();

		      	if (cijfer == 0) { 
		      		doorcijferen = false;
		      	}

		      	else if(cijfer > 6) {
		      		System.out.println("Dit cijfer is " + (cijfer-6) + " cijfers hoger");
		      	} 
		      	else if(cijfer == 6) { 
		    	   	System.out.println("Dit cijfer is gelijk aan 6");
		      	}
		      	else if(cijfer < 6 ) { 
		 	    	System.out.println("Dit cijer is " + (6-cijfer) + " cijfers lager");
		      	}
		
		}
		
		if(!doorcijferen) { 
			stopit();
		} 
		

		
	}
	
	 static void stopit(){ 
		 System.out.println("BYEBYE");
	 }
		static int vraagOmCijfer(){	
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("voer een cijfer in om te vergelijken met 6 ....");
			System.out.println("om af te sluiten typ '0' ....");
			int invoer = scanner.nextInt();
			System.out.println("u heeft gekozen voor " + invoer);
		
			
			return invoer;

		}


}
