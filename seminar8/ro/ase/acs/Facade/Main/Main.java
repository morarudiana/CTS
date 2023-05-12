package ro.ase.acs.Facade.Main;

import ro.ase.acs.Facade.Bilet;
import ro.ase.acs.Facade.Client;
import ro.ase.acs.Facade.Facade;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("2123615263721", "Rares");
		Client client2 = new Client("2123615263722", "razvan");
		Bilet bilet = new Bilet("Razvan");
		Bilet bilet1 = new Bilet("Vica");
		
		Facade facade = new Facade();
		facade.permiteIntrare(client1, bilet);
		facade.permiteIntrare(client2, bilet1);
		


	}

}
