package ro.ase.acs.Facade;

public class Politie {
	
	public boolean areCazier(String cnp) {
			return cnp.charAt(12)%2 == 0;	
	}

}
