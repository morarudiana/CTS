package ro.ase.acs.Adapter;

public class CreditIpotecar implements Credit {

	@Override
	public void oferaCredit(int suma) {
		System.out.println("A fost oferit creditul ipotecar in valoare de: "+suma);
		
	}

}
