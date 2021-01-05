package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.service.JoueurService;

public class JoueurController {
	
	private JoueurService joueurService;
	
	public JoueurController() {
		this.joueurService=new JoueurService();
	}
	
	public void afficherDetailsJoueur() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est l'identifiant du joueur dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		Joueur joueur = joueurService.getJoueur(identifiant);
		System.out.println("Le joueur selectionné s'appelle "+joueur.getPrenom()+" "+joueur.getNom());
		
	}
}
