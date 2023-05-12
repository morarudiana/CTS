package ro.ase.acs.composite.Models;

public class Loc implements IComponentaAbstracta {
	
	private int rand;
	private int numar;
	
	

	public Loc(int rand, int numar) {
		super();
		this.rand = rand;
		this.numar = numar;
	}

	@Override
	public void adaugaNod(IComponentaAbstracta nod) throws Exception {
		throw new Exception("Not yet implemented");
		
	}

	@Override
	public void stergeNod(IComponentaAbstracta nod) throws Exception {
		throw new Exception("Not yet implemented");
		
	}

	@Override
	public IComponentaAbstracta getNodCopil(int index) throws Exception {
		throw new Exception("Not yet implemented");

	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println(indentare + "Locul de pe randul " + this.rand+"numarul locului "+ this.rand);
		
		
		
	}

	

}
