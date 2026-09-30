package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c1 = new Console("ps4");
		Console c2 = new Console("ps5");
		Console c3 = new Console("Switch");
		Console c4 = new Console("Wii");
		Console c5 = new Console("DS");
		
		Client client1 = new Client("Corentin", "Brasseur");
		Client client2 = new Client("Felix", "Royer");
		
		Adresse adresse1 = new Adresse("13", "rue de la liberte", "Paris");
		Boutique boutique1 = new Boutique("Jeux Videos", adresse1);
		
	}

}
