package ro.ase.simplefactory;

public class Subway implements ITransportVehicle{

    private int noSeats;

    public Subway(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The subway has "+noSeats+" seats.");
    }

    @Override
    public void movingType() {
        System.out.println("The subway is moving underground");
    }
}
