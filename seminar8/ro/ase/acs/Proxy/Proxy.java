package ro.ase.acs.Proxy;

public class Proxy implements ITicketOffice{
	
	private ITicketOffice office;
	
	

	public Proxy(ITicketOffice office) {
		super();
		this.office = office;
	}



	@Override
	public void sellTicket(Client client) {
		if(client.getAge()>= 15) {
			office.sellTicket(client);
		}else {
			System.out.println("The client " +client.getName() + " can't buy a ticket. he/she not old enough");
		}
		
	}

}
