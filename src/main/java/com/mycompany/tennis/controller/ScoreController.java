package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.dto.ScoreFullDto;
import com.mycompany.tennis.core.service.ScoreService;

public class ScoreController {
	private ScoreService scoreService;
	
	public ScoreController() {this.scoreService= new ScoreService();}
	
	public void afficheDetailsScore() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est l'identifiant du score dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		ScoreFullDto scoreFullDto = scoreService.getScore(identifiant);
		System.out.println("Les set du score sont");
		System.out.println(scoreFullDto.getSet1());
		System.out.println(scoreFullDto.getSet2());
		
		if (scoreFullDto.getSet3()!=null){
			System.out.println(scoreFullDto.getSet3());
		}
		
		if (scoreFullDto.getSet4()!=null){
			System.out.println(scoreFullDto.getSet4());
		}
		
		if (scoreFullDto.getSet5()!=null){
			System.out.println(scoreFullDto.getSet5());
		}
		
		System.out.println("Il s'agit du tournoi "+scoreFullDto.getMatch().getEpreuve().getTournoi().getNom());
		System.out.println("L'epreuve s'est déroulé en "+scoreFullDto.getMatch().getEpreuve().getAnnee());
	}
}
