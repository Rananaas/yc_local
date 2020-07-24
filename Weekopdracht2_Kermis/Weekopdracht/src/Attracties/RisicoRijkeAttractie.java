package Attracties;


abstract class RisicoRijkeAttractie extends Attractie{

	public RisicoRijkeAttractie(String deNaam, double prijs, int oppervlakte, int draaiRondjes) {
		super(deNaam, prijs, oppervlakte, draaiRondjes);

		naam = deNaam;
		
	}
	public void opstellingsKeuring() {
		
		System.out.println("-- OPSTELLINGSKEURING GEDAAN VOOR " + naam);
		}
	public void onderhoudsbeurt() { 
		System.out.println("-- ONDERHOUDSBEURT GEDAAN VOOR " + naam);
	}

	
}