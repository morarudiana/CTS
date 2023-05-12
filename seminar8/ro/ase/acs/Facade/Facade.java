package ro.ase.acs.Facade;

public class Facade {
	
	public void permiteIntrare(Client client, Bilet bilet) {
		Politie politie = new Politie();
		if(client.getNume().equals(bilet.getNumeCumparator())){
			if(!politie.areCazier(client.getCnp())) {
				System.out.println("Suporterul "+ client.getNume() + "Intra pe stadion");
			}else {
				System.out.println("Are cazier");
			}
		}
	}

}
