package ro.ase.acs.observer.classes;

public interface IRestaurant {

	void abonareClient(IClient client);
	void dezabonareClient(IClient client);
	void trimiteNotificare(String mesaj);
}
