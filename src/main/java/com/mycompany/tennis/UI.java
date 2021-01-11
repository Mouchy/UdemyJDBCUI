package com.mycompany.tennis;

import com.mycompany.tennis.controller.MatchController;

public class UI {
	public static void main(String... args) {
		
		
		/*TournoiController controller = new TournoiController();*/
	    /*controller.afficherDetailsTournoi();*/
		/*controller.creerTournoi();*/
		/*controller.supprimerTournoi();*/
		
		/*JoueurController controller=new JoueurController();*/
		/*controller.creerJoueur();*/
		/*controller.renommeJoueur();*/
		/*controller.supprimeJoueur();*/
		
		MatchController controller=new MatchController();
		controller.afficheDetailMatch();
	}
}
