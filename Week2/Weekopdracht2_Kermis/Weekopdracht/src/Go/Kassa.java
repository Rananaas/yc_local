package Go;

import java.util.Random;
import java.util.Scanner;

import Attracties.Botsautos;
import Attracties.Hawaii;
import Attracties.Ladderklimmen;
import Attracties.Spiegelpaleis;
import Attracties.Spin;
import Attracties.Spookhuis;
import Attracties.Attractie;


public class Kassa{ 
	public int totaalKaartjes;
	public double totaalOmzet;
	public double totaleBelastingAfdrachten;
	
	Scanner scanner = new Scanner(System.in);
	Botsautos a1 = new Botsautos("Botsautos", 2.50, 20, 0, true); // argument string botsautos (hoeveelheid parameters is signature)
	Spin a2 = new Spin("Spin", 2.25, 30, 0, false);
	Spiegelpaleis a3 = new Spiegelpaleis("Spiegelpaleis",2.75, 40, 0, true);
	Spookhuis a4 = new Spookhuis("Spookhuis",3.20, 40, 0, true);
	Hawaii a5 = new Hawaii("Hawaii",2.90, 20, 0, false);
	Ladderklimmen a6 = new Ladderklimmen("Ladderklimmen",5, 6, 0, true);
	
	// dus deze moet ladder klimmen = new ladderklimmen 

	public double TotaleOmzetBerekenaar() { 
		totaalOmzet = a1.omzet + a2.omzet + a3.omzet + a4.omzet + a5.omzet + a6.omzet;
		System.out.println("Totale omzet: " + totaalOmzet + " euro");
		return totaalOmzet;
	}
	public void TotaleBelastingBerekenaar() {
		System.out.println(" /////////////////////////////////////////");
		System.out.println("voor SPIN " + a2.totalebelastingafdrachtenPerAttractie +"  VOOR LADDDER   "+ a6.totalebelastingafdrachtenPerAttractie);
		totaleBelastingAfdrachten = a2.totalebelastingafdrachtenPerAttractie+ a6.totalebelastingafdrachtenPerAttractie;
	
			System.out.println("PAYDAY; DAT WORDT DAN " + totaleBelastingAfdrachten);
			//totaleBelastingAfdrachten = 0; /// reset belasting
			System.out.println(" BELASTING SCHULD SCHOON< NAMELIJK   " + totaleBelastingAfdrachten);
	
		
	}
	public int TotaleKaartjesBerekenaar() { 
		 totaalKaartjes =  a1.kaartje + a2.kaartje + a3.kaartje + a4.kaartje + a5.kaartje + a6.kaartje;
		System.out.println("Totaal verkochte aantaal kaartjes: " + totaalKaartjes);
		return totaalKaartjes;
		
		

	}
	
		public void starten() { 
		
		int randomControle = 0;
		int tijdTotNieuweInning = 0;
		boolean doorgaan = true;
		while(doorgaan) { 
			String deKeuze = vraagOmAttractieKeuze();
			if(deKeuze.equals("q")) { 
				doorgaan = false;
			} else { 
					if(deKeuze.equals("1")) { 
						a1.draaien();

					}
					if(deKeuze.equals("2")) { 
						if (a2.draaiRondjes < 1) { /// dus als het rondje 1 is!
							a2.opstellingsKeuring();
						} 
						else if(a2.draaiRondjes % 5 ==0) { 
							a2.onderhoudsbeurt();
						}
						a2.draaien();
						a2.kansSpelBelastingBetalen();
					}
					if(deKeuze.equals("3")) { 
						a3.draaien();

					}
					if(deKeuze.equals("4")) { 
						a4.draaien();

					}
					if(deKeuze.equals("5")) { 
						if (a5.draaiRondjes < 1) { /// dus als het rondje 1 is!
							a5.opstellingsKeuring();
						} 
						else if(a5.draaiRondjes %10 ==0) { 
							a5.onderhoudsbeurt();
						}
						a5.draaien();

					}
					if(deKeuze.equals("6")) { 
						a6.draaien();
						a6.kansSpelBelastingBetalen();

					}
					if(deKeuze.equals("o")) { 
						TotaleOmzetBerekenaar();

					}
					if(deKeuze.equals("k")) { 
						TotaleKaartjesBerekenaar();

					}
					
					 totaalKaartjes =  a1.kaartje + a2.kaartje + a3.kaartje + a4.kaartje + a5.kaartje + a6.kaartje;
						System.out.println("Totaal verkochte aantaal kaartjes HIER: " + totaalKaartjes);
						
						
						if(totaalKaartjes == 1) { 
							Random rand = new Random();
							randomControle = rand.nextInt(14-0)+1;
							tijdTotNieuweInning = totaalKaartjes + randomControle;
							System.out.println(" random getal is nu " + randomControle);	
						}else if(totaalKaartjes %15==0) { 
							Random rand2 = new Random();
							randomControle = rand2.nextInt(14-0)+1;
							tijdTotNieuweInning = totaalKaartjes + randomControle;
							System.out.println(" random getal is nu " + randomControle + " draairondjes is " + totaalKaartjes);
						} 
						
						//randomControle--;
						System.out.println(" DE RANDOM CONTROLS IS NU......." + randomControle);
						
						if(totaalKaartjes == tijdTotNieuweInning) { 
						
							System.out.println("---------------------------BELASTINGTIME---" + totaalKaartjes + tijdTotNieuweInning);
						BelastingInspecteur bi = new BelastingInspecteur();

						bi.belastingInnen((Ladderklimmen)a6);	
						
				}} 

			}
	

		}
	

	
	
	String vraagOmAttractieKeuze() { 
		
		System.out.println("Welkom op de kermis, wat wenst u te doen? ");
		System.out.println("botsautos = 1 // Spin = 2 // Spiegelpaleis = 3");
		System.out.println("Spookhuis = 4 // Hawaii = 5 // Ladderklimmen = 6");
		System.out.println("Totale omzet = 'o' // Totaal aantal kaartjes = 'k' ");
		String invoer = scanner.nextLine();
		System.out.println("u heeft gekozen voor " + invoer);
		return invoer;

			
		
	}
	
}
