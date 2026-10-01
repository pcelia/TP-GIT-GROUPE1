package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
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
		
		Client client1 = new Client("Corentin", "Brasseur");
		Client client2 = new Client("Felix", "Royer");
		
		Adresse adresse1 = new Adresse("13", "rue de la liberte", "Paris");
		Boutique boutique1 = new Boutique("Jeux Videos", adresse1);
		
	}

}
