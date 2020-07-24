package Attracties;


public class Attractie{ 
	
	public String naam;
	public double prijs;
	public double omzet;
	public int oppervlakte;
	public int kaartje;
	public int draaiRondjes;
	public double belastingafdracht;
	public double totalebelastingafdrachtenPerAttractie;
	//double totaalKaartjesAlleAttracties;
	

	
	public Attractie(String deNaam, double prijs, int oppervlakte, int draaiRondjes){ 
		naam = deNaam; /// omdat hij niet weer dat je het argument ook echt wil gebruiken hier.
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
		this.draaiRondjes = draaiRondjes;
	}
	public void draaien() { 
		omzet += prijs;
		kaartje++;
		draaiRondjes++;
		System.out.println("De attractie: " + naam + " is aan het draaien");
		System.out.println(naam + " heeft al " + omzet + " euro omgezet ");
		System.out.println(naam + " heeft al " + kaartje + " kaartjes verkocht");
		System.out.println(naam + " heeft al " + draaiRondjes + " draairondjes gedaan");
		
	}

	
}