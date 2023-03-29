package factory_method;

public abstract class TransportVehicle {
    protected int noSeats;

    public TransportVehicle(int noSeats) {
        this.noSeats = noSeats;
    }
    public abstract void showInfo();

    public abstract void movingType();

    public String toString(){
        return "has " +this.noSeats + " seats";
    }
}
