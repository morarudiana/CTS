package factory_method;

public class FactoryAutobuz implements Factory{
    public TransportVehicle createObject(int noSeats){
        return new Autobuz(noSeats);
    }
}
