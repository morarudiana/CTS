package ro.ase.acs.Proxy;

public class TicketOffice implements ITicketOffice{

	@Override
	public void sellTicket(Client client) {
		System.out.println("Ticket was sold to : " + client.getName());
		
		
	}

}
