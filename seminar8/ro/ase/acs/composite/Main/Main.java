package ro.ase.acs.composite.Main;

import ro.ase.acs.composite.Models.IComponentaAbstracta;
import ro.ase.acs.composite.Models.Loc;
import ro.ase.acs.composite.Models.Tribuna;

public class Main {

	public static void main(String[] args) throws Exception {
		IComponentaAbstracta tribunaPrincipala = new Tribuna("Tribuna Principala");
		IComponentaAbstracta tribunaCopii = new Tribuna("Tribuna copii");
		IComponentaAbstracta tribunaAdulti=new Tribuna("Tribuna adulti");
		
		IComponentaAbstracta loc1= new Loc(2,1);
		IComponentaAbstracta loc2 = new Loc(2, 2);
		IComponentaAbstracta loc3=new Loc(2,3);
		
		
		tribunaPrincipala.adaugaNod(tribunaAdulti);
		tribunaCopii.adaugaNod(loc1);
		tribunaAdulti.adaugaNod(loc2);
		tribunaPrincipala.adaugaNod(loc3);
		
		tribunaPrincipala.afiseazaComponenta("");
		
	}

}
