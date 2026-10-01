package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Portable c1 = new Portable ("ps4", 15.0, LocalDate.of(2020, 11, 19));
		Portable c2 = new Portable ("ps5", 30.0, LocalDate.of(2024, 12, 27));
		Salon c3 = new Salon ("Switch", 20.0, LocalDate.of(2022, 01, 18));
		Hybride c4 = new Hybride ("Wii", 18.0, LocalDate.of(2006, 07, 12));
		Hybride c5 = new Hybride ("DS", 10.0, LocalDate.of(2007, 06, 25));
		
		Client client1 = new Client("Corentin", "Brasseur", null);
		Client client2 = new Client("Felix", "Royer", null);
		
		
		Adresse adresse1 = new Adresse("13", "rue de la liberte", "Paris");
		Boutique boutique1 = new Boutique("Jeux Videos", adresse1);
		
		
		Jeu jeu1 = new Jeu("Mario", c1, boutique1);
		Jeu jeu2 = new Jeu("Zelda", c1, boutique1);
		Jeu jeu3 = new Jeu("Samus", c1, boutique1);
		
		Achat achat1 = new Achat(jeu1, LocalDate.now(), 19.99);
		Achat achat2 = new Achat(jeu2, LocalDate.now(), 5.99);
		
		client1.getListeAchat().add(achat1);
		client1.getListeAchat().add(achat2);
		

		//Je fais une ligne de commentaire pour simuler une progression dans le code

		Achat achat3 = new Achat(jeu3, LocalDate.now(), 9.99);

		
		client2.getListeAchat().add(achat3);
		
			
	}

}
