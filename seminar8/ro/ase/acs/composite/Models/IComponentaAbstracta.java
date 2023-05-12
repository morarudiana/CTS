package ro.ase.acs.composite.Models;

public interface IComponentaAbstracta {
	
	public void adaugaNod(IComponentaAbstracta nod) throws Exception;
	
	public void stergeNod(IComponentaAbstracta nod) throws Exception;
	
	public IComponentaAbstracta getNodCopil(int index) throws Exception;
	
	public void afiseazaComponenta(String indentare);


}
