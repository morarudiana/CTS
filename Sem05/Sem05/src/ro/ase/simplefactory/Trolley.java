package ro.ase.simplefactory;

public class Trolley implements ITransportVehicle{

    private int noSeats;

    protected Trolley(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The trolley has "+this.noSeats+" seats.");
    }
    public void movingType(){
        System.out.println("The trolley is moving by rails");
    }
}

