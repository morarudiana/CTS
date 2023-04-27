package ro.ase.acs.Decorator;

public class Card implements ICard {

	@Override
	public void payOnline(double suma) {
		System.out.println("S-a platit online suma de: " +suma);
		
	}

	@Override
	public void payPOS(double suma) {
		System.out.println("S-a platit prin POS suma de: "+suma);
		
	}

}
