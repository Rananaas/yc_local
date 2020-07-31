package com.cs.cijferSysteem.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leerling {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	long id;
	int leerlingnummer;
	String naam;
	String geboortemaand;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLeerlingnummer() {
		return leerlingnummer;
	}
	public void setLeerlingnummer(int leerlingnummer) {
		this.leerlingnummer = leerlingnummer;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getGeboortemaand() {
		return geboortemaand;
	}
	public void setGeboortemaand(String geboortemaand) {
		this.geboortemaand = geboortemaand;
	}
	
	
	
	
}

