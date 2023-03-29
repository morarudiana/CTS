package ro.ase.simplefactory;

public class Tram implements ITransportVehicle{

    private int noSeats;

    protected Tram(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The tram has "+this.noSeats+" seats.");
    }

    public void movingType(){
        System.out.println("The tram is moving by");
    }
}
