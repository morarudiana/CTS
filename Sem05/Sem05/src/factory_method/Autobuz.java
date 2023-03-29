package factory_method;

public class Autobuz extends TransportVehicle{

    public Autobuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The bus has " + super.toString());
    }

    @Override
    public void movingType() {
        System.out.println("The bus is moving on wheels");
    }
}
