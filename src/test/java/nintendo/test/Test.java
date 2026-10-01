package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1 = new Console("ps4", 15.0, LocalDate.of(2020, 11, 19));
		Console c2 = new Console("ps5", 30.0, LocalDate.of(2024, 12, 27));
		Console c3 = new Console("Switch", 20.0, LocalDate.of(2022, 01, 18));
		Console c4 = new Console("Wii", 18.0, LocalDate.of(2006, 07, 12));
		Console c5 = new Console("DS", 10.0, LocalDate.of(2007, 06, 25));
		
		Client client1 = new Client("Corentin", "Brasseur");
		Client client2 = new Client("Felix", "Royer");
		
		Adresse adresse1 = new Adresse("13", "rue de la liberte", "Paris");
		Boutique boutique1 = new Boutique("Jeux Videos", adresse1);
		
	}

}
