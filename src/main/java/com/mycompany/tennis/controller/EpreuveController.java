package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.entity.Epreuve;
import com.mycompany.tennis.core.service.EpreuveService;

public class EpreuveController {
	
	private EpreuveService epreuveService;
	
	public EpreuveController() {
		this.epreuveService=new EpreuveService();
	}
	
	public void afficheDerniereEpreuve() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est le nom de l'epreuve dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		Epreuve epreuve = epreuveService.getEpreuveAvecTournoi(identifiant);
		System.out.println("Le nom  du tournoi est "+epreuve.getTournoi().getNom());
		
	}
	
	public void afficherRolandGarros() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est le nom de l'epreuve dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		Epreuve epreuve = epreuveService.getEpreuveSansTournoi(identifiant);
		
	}
}
