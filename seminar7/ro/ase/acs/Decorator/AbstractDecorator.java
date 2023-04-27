package ro.ase.acs.Decorator;

public abstract class AbstractDecorator implements ICard {

	public abstract void payContactless(double sum);
	
	ICard card;
	
	public AbstractDecorator(ICard newCard)	{
		this.card = newCard;
	}

	@Override
	public void payOnline(double suma) {
		card.payOnline(suma);
		
	}

	@Override
	public void payPOS(double suma) {
		card.payPOS(suma);
		
	}
}
