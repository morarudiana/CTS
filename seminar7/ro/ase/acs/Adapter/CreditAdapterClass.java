package ro.ase.acs.Adapter;

import ro.ase.acs.Adapter.NewFramework.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit {

	@Override
	public void oferaCredit(int suma) {
		super.oferaLeasing(suma);
		
	}

}
