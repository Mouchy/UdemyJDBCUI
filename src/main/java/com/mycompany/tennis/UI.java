package com.mycompany.tennis;

import com.mycompany.tennis.controller.JoueurController;
import com.mycompany.tennis.controller.TournoiController;

public class UI {
	public static void main(String... args) {
		JoueurController controller=new JoueurController();
		controller.afficherDetailsJoueur();
		
		TournoiController controller2 = new TournoiController();
	    controller2.afficherDetailsTournoi();
	    controller2.creationTournoi();
	}
}
