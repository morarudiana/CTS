package ro.ase.acs.flyweight.classes;

public class Client implements IClient {
	
	private String nume;
	private String numarTelefon;
	private String email;
	
	
	
	
	public Client(String nume, String numarTelefon, String email) {
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.email = email;
	}




	@Override
	public void afiseazaDetaliiRezervare(Rezervare rezervare) {
		System.out.println("Clientul : " + this.nume + " are nr tel " + this.numarTelefon + 
				" cu email "+ this.email +" si a rezervat masa" + rezervare.getNrMasa()+ " pentru "
				+ rezervare.getNrPersoane() + " la ora " + rezervare.getOra());
		
	}

}
