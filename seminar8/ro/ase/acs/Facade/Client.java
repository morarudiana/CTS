package ro.ase.acs.Facade;

public class Client {
	private String cnp;
	private String nume;
	public Client(String cnp, String nume) {
		super();
		this.cnp = cnp;
		this.nume = nume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	

}
