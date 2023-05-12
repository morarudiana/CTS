package ro.ase.acs.flyweight.main;

import ro.ase.acs.flyweight.classes.BazaDeDateClienti;
import ro.ase.acs.flyweight.classes.IClient;
import ro.ase.acs.flyweight.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		BazaDeDateClienti bazaDeDateClienti = new BazaDeDateClienti();
		Rezervare rezervare = new Rezervare(1, 2, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 3, "12:00");
		Rezervare rezervare3 = new Rezervare(3, 5, "17:00");
		IClient iclient = bazaDeDateClienti.getClient("Ana" , "0724843465", "ana1@gmail.conm");
		iclient.afiseazaDetaliiRezervare(rezervare);
		bazaDeDateClienti.getClient("Maria", "074t5284" , "maria@mail.ru").afiseazaDetaliiRezervare(rezervare2);
		bazaDeDateClienti.getClient("", "0724843465" , "").afiseazaDetaliiRezervare(rezervare3);
		
		Rezervare rezervare4 = new Rezervare(4, 3, "20:00");
		bazaDeDateClienti.getClient("", "0724843465", "").afiseazaDetaliiRezervare(rezervare4);


	}

}
