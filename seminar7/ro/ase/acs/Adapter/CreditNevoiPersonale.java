package ro.ase.acs.Adapter;

public class CreditNevoiPersonale implements Credit{

	@Override
	public void oferaCredit(int suma) {
		System.out.println("A fost oferit creditul de nevoi personale in valoare de: "+suma);
		
	}

}
