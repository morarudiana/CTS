package ro.ase.acs.Main;

import ro.ase.acs.Proxy.Client;
import ro.ase.acs.Proxy.ITicketOffice;
import ro.ase.acs.Proxy.Proxy;
import ro.ase.acs.Proxy.TicketOffice;

public class Main {
	public static void main(String[] args) {
		Client clientOne = new Client(15, "Mihai");
		Client client2 = new Client(10, "Ion");
		
		ITicketOffice office = new TicketOffice();
		
		office.sellTicket(clientOne);
		office.sellTicket(client2);
		
		ITicketOffice officeProxy = new Proxy(office);
		officeProxy.sellTicket(clientOne);
		officeProxy.sellTicket(client2);
	}

}
