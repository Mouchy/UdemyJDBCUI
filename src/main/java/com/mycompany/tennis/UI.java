package com.mycompany.tennis;

import com.mycompany.tennis.controller.EpreuveController;
import com.mycompany.tennis.controller.JoueurController;

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
		
		EpreuveController controller=new EpreuveController();
		controller.afficherDetailsEpreuve();
		
	}
}
