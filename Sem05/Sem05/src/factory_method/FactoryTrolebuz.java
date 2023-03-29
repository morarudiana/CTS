package factory_method;

public class FactoryTrolebuz implements Factory{
    public TransportVehicle createObject(int noSeats){
        return new Tramvai(noSeats);
    }
}
