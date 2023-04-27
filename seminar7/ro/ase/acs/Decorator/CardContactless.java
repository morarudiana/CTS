package ro.ase.acs.Decorator;

public class CardContactless extends AbstractDecorator{

	public CardContactless(ICard newCard) {
		super(newCard);
	}

	@Override
	public void payContactless(double sum) {
		System.out.println("S-a platit contactless cu suma de: "+sum);
		
	}

}
