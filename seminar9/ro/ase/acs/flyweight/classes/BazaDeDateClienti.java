package ro.ase.acs.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDateClienti {
	private Map<String, IClient> clienti;
	
	public BazaDeDateClienti() {
		clienti = new HashMap<>();
	}
	
	public IClient getClient(String nume, String numarTelefon, String email) {
		if(clienti.containsKey(numarTelefon))
		{
			return clienti.get(numarTelefon);
		}
		else {
			IClient client = new Client(nume, numarTelefon, email);
			clienti.put(numarTelefon, client);
			return client;
		}
	}

}
