package Attracties;


public class Ladderklimmen extends Attractie implements GokAttracties{ // NOG EXTENDS ATTRACTIE

	
	
	public Ladderklimmen(String deNaam, double prijs, int oppervlakte, int draaiRondjes, boolean opstellingsKeuringVoltooid) {
		super(deNaam, prijs, oppervlakte, draaiRondjes);	
	}

	@Override
	public double kansSpelBelastingBetalen() {
	
			belastingafdracht = ((prijs/100)*30);
			
			totalebelastingafdrachtenPerAttractie = totalebelastingafdrachtenPerAttractie + belastingafdracht; // alle kaartje voor deze attractie
		
			System.out.println("kansspelomzet =  " + omzet);
			System.out.println("waarvan nu " + belastingafdracht + " apart gehouden ");
			System.out.println("In totaal nu  " + totalebelastingafdrachtenPerAttractie + " euro gereserveerd voor de belastingdienst");
			omzet = omzet-belastingafdracht;
			System.out.println("omzet gokattractie LADDERKLIMMEN na afdracht is " + omzet);
			return totalebelastingafdrachtenPerAttractie;


	} 
	
}