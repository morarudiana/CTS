package factory_method;

public class Tramvai extends TransportVehicle {

    public Tramvai(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The tram has " + super.toString());
    }

    @Override
    public void movingType() {
        System.out.println("The tram is moving on rails");
    }

}
