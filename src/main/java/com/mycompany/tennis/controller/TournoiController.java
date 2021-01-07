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
		System.out.println("Le tournoi selectionné s'appelle "+tournoi.getNom());
		
	}
	
	public void creerTournoi() {
	    Scanner scanner = new Scanner(System.in);
	    
	      System.out.println("Quel est le nom du tournoi ?");
	      String nom=scanner.nextLine();
	      System.out.println("Quel est le Code du tournoi");
	      String code=scanner.nextLine();
	      
	      Tournoi tournoi = new Tournoi();
	      
	      tournoi.setNom(nom);
	      tournoi.setCode(code);
	      tournoiService.createTournoi(tournoi);
	}
	
	public void supprimerTournoi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est l'identifiant de tournoi à supprimer ?");
		long identifiant=scanner.nextLong();
		
		tournoiService.deleteTournoi(identifiant);
	}
}
