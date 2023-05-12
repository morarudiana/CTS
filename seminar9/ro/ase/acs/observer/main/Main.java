package ro.ase.acs.observer.main;

import ro.ase.acs.observer.classes.Client;
import ro.ase.acs.observer.classes.IClient;
import ro.ase.acs.observer.classes.IRestaurant;
import ro.ase.acs.observer.classes.Restaurant;

public class Main {

	public static void main(String[] args) {
		IClient client1 = new Client("Mariu");
		IClient client2 = new Client("Mariana");
		IClient client3 = new Client("Ovidiu");
		
		Restaurant restaurant = new Restaurant("Casa Buna");
		
		restaurant.adaugareDiscount(10);
		restaurant.abonareClient(client1);
		restaurant.adaugaMeniuNou();
		
		restaurant.abonareClient(client2);
		restaurant.abonareClient(client3);
		restaurant.dezabonareClient(client1);
		restaurant.adaugareDiscount(20);
	}

}
