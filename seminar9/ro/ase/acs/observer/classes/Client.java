package ro.ase.acs.observer.classes;

public class Client implements IClient  {
	
	private String nume;
	
	



	public Client(String nume) {
		super();
		this.nume = nume;
	}





	@Override
	public void primesteNotificare(String mesaj) {
		System.out.println("Hey " + this.nume + " ati primit urmatoarea notificare : "+ mesaj);
		
	}}
