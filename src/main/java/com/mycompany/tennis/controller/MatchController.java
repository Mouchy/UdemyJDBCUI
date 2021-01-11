package com.mycompany.tennis.controller;

import java.util.Scanner;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.EpreuveLightDto;
import com.mycompany.tennis.core.dto.MatchDto;
import com.mycompany.tennis.core.service.EpreuveService;
import com.mycompany.tennis.core.service.MatchService;

public class MatchController {
	
	private MatchService matchService;
	
	public MatchController() {
		this.matchService=new MatchService();
	}
	
	public void afficheDetailMatch() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Quel est l'identifiant du match dont vous voulez afficher les informations");
		long identifiant = scanner.nextLong();
		MatchDto matchDto = matchService.getMatch(identifiant);
		System.out.println("Il s'agit d'un match de "+matchDto.getEpreuve().getAnnee()+" qui s'est deroule à "+matchDto.getEpreuve().getTournoi().getNom());
		System.out.println("Le nom  et le prenom du vainqueur sont "+matchDto.getVainqueur().getNom()+" "+matchDto.getVainqueur().getPrenom());
		System.out.println("Le nom  et le prenom du finaliste sont "+matchDto.getFinaliste().getNom()+" "+matchDto.getFinaliste().getPrenom());
		
	}
}
