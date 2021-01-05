package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.JoueurService;
import com.mycompany.tennis.core.service.TournoiService;

public class TournoiController {
	
	private TournoiService tournoiService;
	
	public TournoiController() {
		this.tournoiService=new TournoiService();
	}
	
	public void afficherDetailsTournoi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est l'identifiant du tournoi dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		Tournoi tournoi = tournoiService.getTournoi(identifiant);
		System.out.println("Le tournoi selectionné s'appelle "+tournoi.getCode()+" "+tournoi.getNom());
		
	}
	
	public void creationTournoi() {
	    Scanner scanner = new Scanner(System.in);
	    // Création nouveau Tournoi.
	    while (true) {
	      Tournoi tournoi = new Tournoi();
	      System.out.println("Entrez le Nom : ");
	      tournoi.setNom(scanner.nextLine());
	      System.out.println("Entrez le Code : ");
	      tournoi.setCode(scanner.nextLine());
	      tournoiService.createTournoi(tournoi);

	      System.out.println("Continue [Yes/No] : ");
	      String option = scanner.next();
	      if (option.equalsIgnoreCase("No")) {
	        break;
	      }
	    }
	}
}
