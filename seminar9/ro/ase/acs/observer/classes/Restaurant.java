package ro.ase.acs.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
	
	private List<IClient> clienti;
	private String numeRestaurant;
	
	public  Restaurant(String numeRestaurant) {
		this.numeRestaurant = numeRestaurant;
		clienti = new ArrayList<>();
	}

	@Override
	public void abonareClient(IClient client) {
		clienti.add(client);
		
	}

	@Override
	public void dezabonareClient(IClient client) {
		clienti.remove(client);
		
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for( IClient i : clienti) {
			i.primesteNotificare("Restaurantul " +this.numeRestaurant + " iti trimite notificarea: " + mesaj);
		}
		
	}
	
	public void adaugaMeniuNou() {
		trimiteNotificare("Am adaugat un nou meniu!");
	}
	
	public void adaugareDiscount(float discount) {
		trimiteNotificare("Hei! Avem un discount pentru toate produsele de: " + discount);
	}

}
