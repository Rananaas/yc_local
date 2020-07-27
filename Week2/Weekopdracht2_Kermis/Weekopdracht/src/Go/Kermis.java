package Go;

import Go.Kassa;


public class Kermis {

	public static void main(String[] args) {

		new Kermis().programmabedienen(); // om uit de static te komen	
		
	}

	void programmabedienen() { 
		Kassa kassa = new Kassa();
		kassa.starten();
		// hieronder zie je nadat kassa is gestopt! dus q is ingetoetst.
		System.out.println("////////////////// INKOMSTEN PER ATTRACTIE: ////////////////////");
		System.out.println(kassa.a1.kaartje + " kaartjes verkocht en hiermee " +  kassa.a1.omzet+ " omgezet door " + kassa.a1.naam);
		System.out.println(kassa.a2.kaartje + " kaartjes verkocht en hiermee " +  kassa.a2.omzet+ " omgezet door " + kassa.a2.naam);
		System.out.println(kassa.a3.kaartje + " kaartjes verkocht en hiermee " +  kassa.a3.omzet+ " omgezet door " + kassa.a3.naam);
		System.out.println(kassa.a4.kaartje + " kaartjes verkocht en hiermee " +  kassa.a4.omzet+ " omgezet door " + kassa.a4.naam);
		System.out.println(kassa.a5.kaartje + " kaartjes verkocht en hiermee " +  kassa.a5.omzet+ " omgezet door " + kassa.a5.naam);
		System.out.println(kassa.a6.kaartje + " kaartjes verkocht en hiermee " +  kassa.a6.omzet+ " omgezet door " + kassa.a6.naam);
		System.out.println(" -------------------------------------------- ");
		System.out.println("///////// TOTAALAFREKENING /////////");
		kassa.TotaleKaartjesBerekenaar();
		kassa.TotaleOmzetBerekenaar();
		//kassa.TotaleBelastingBerekenaar();
		
		}
	
}



