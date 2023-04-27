package ro.ase.acs.Decorator;

public class CardContactlessVirtual extends AbstractDecorator {

	public CardContactlessVirtual(ICard newCard) {
		super(newCard);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payContactless(double sum) {
       System.out.println("S-a facut plata contactless cu caardul virtual"+sum);		
	}
	
	

}
