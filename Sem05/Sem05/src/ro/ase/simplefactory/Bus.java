package ro.ase.simplefactory;

public class Bus implements ITransportVehicle{

    private int noSeats;

    protected Bus(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The bus has "+this.noSeats+" seats.");
    }
    public void movingType(){
        System.out.println("The bus is moving by");
    }
}
