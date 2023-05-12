package ro.ase.acs.flyweight.classes;

public class Rezervare {

	private int nrMasa;
	private int nrPersoane;
	private String ora;
	
	public Rezervare(int nrMasa, int nrPersoane, String ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public int getNrPersoane() {
		return nrPersoane;
	}

	public String getOra() {
		return ora;
	}
	
	
	
}
