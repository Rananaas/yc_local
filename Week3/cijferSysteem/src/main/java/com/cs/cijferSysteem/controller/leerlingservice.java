package com.cs.cijferSysteem.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.cijferSysteem.domein.Leerling;

@Service
@Transactional
public class leerlingservice {


	@Autowired
	leerlingRepository lr;
	
	public void toonAlleLeerlingen() { 
		System.out.println("Deze methode werkt in de service voor leerlingen");
		lr.findAll();
		lr.save(new Leerling());
		lr.findById(1L);
		for(Leerling l: lr.findAll()) { 
			System.out.println("een record uit de database " + l.getId() + "dit is een naam: " + l.getNaam());	
		}
	}

        public Iterable<Leerling> nunetjes() {
            return lr.findAll();
            
        }
}