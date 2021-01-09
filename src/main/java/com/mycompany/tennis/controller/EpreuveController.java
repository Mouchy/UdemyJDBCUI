package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.entity.Epreuve;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.EpreuveService;
import com.mycompany.tennis.core.service.TournoiService;

public class EpreuveController {
	
	private EpreuveService epreuveService;
	
	public EpreuveController() {
		this.epreuveService=new EpreuveService();
	}
	
	public void afficherDetailsEpreuve() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est le nom de l'epreuve dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		Epreuve epreuve = epreuveService.getEpreuve(identifiant);
		System.out.println("L'epreuve selectionné se deroule en "+epreuve.getAnnee());
		
	}
}
