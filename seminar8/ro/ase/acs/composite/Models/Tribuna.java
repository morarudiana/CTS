package ro.ase.acs.composite.Models;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements IComponentaAbstracta{
	
	private String name;
	
	private List<IComponentaAbstracta> listaComponente;
	
	

	protected Tribuna(String name, List<IComponentaAbstracta> listaComponente) {
		super();
		this.name = name;
		this.listaComponente = new ArrayList<>();
	}

	public Tribuna(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adaugaNod(IComponentaAbstracta nod) throws Exception {
		listaComponente.add(nod);
		
	}

	@Override
	public void stergeNod(IComponentaAbstracta nod) throws Exception {
		listaComponente.remove(nod);
		
	}

	@Override
	public IComponentaAbstracta getNodCopil(int index) throws Exception {
		// TODO Auto-generated method stub
		return listaComponente.get(index);
	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println("Tribuna"+  this.name+" contine: ");
		for(IComponentaAbstracta componentaAbstracta : listaComponente) {
				componentaAbstracta.afiseazaComponenta(indentare+"   ");
			
		}
		
	}

}
