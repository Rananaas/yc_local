package Attracties;


public class Spin extends RisicoRijkeAttractie implements GokAttracties{ 

	public Spin(String deNaam, double prijs, int oppervlakte, int draaiRondjes, boolean opstellingsKeuringVoltooid) {
		super(deNaam, prijs, oppervlakte, draaiRondjes);

	}

	@Override
	public double kansSpelBelastingBetalen() {

		belastingafdracht = ((prijs/100)*30);

		
		totalebelastingafdrachtenPerAttractie = totalebelastingafdrachtenPerAttractie + belastingafdracht; // alle belasting voor gokattracties
	
		System.out.println("kansspelomzet is momenteel " + omzet);
		System.out.println("waarvan nu " + belastingafdracht + " euro wordt toegevoegd aan de belastingsreserves");
		System.out.println("In totaal nu  " + totalebelastingafdrachtenPerAttractie + " euro gereserveerd voor de belastingdienst");
		omzet = omzet-belastingafdracht;
		System.out.println("omzet gokattractie SPIN na afdracht is " + omzet);
		return totalebelastingafdrachtenPerAttractie;
	}


}