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
	
	public void creerJoueur() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est le nom du joueur ?");
		String nom=scanner.nextLine();
		System.out.println("Quel est le prenom du joueur ?");
		String prenom=scanner.nextLine();
		System.out.println("Quel est le sexe du joueur ?");
		char sexe=scanner.nextLine().charAt(0);;
		Joueur joueur=new Joueur();
		joueur.setNom(nom);
		joueur.setPrenom(prenom);
		joueur.setSexe(sexe);
		joueurService.createJoueur(joueur);
	}
}
