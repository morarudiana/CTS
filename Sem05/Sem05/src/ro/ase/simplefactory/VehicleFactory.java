package ro.ase.simplefactory;

public class VehicleFactory {
    public ITransportVehicle createObject(VehicleType type, int noSeats) throws Exception
    {
        switch (type)
        {
            case BUS:
                return new Bus(noSeats);
            case TRAM:
                return new Tram(noSeats);
            case TROLLEY:
                return new Trolley(noSeats);
            case SUBWAY:
                return new Subway(noSeats);
            default:
                throw new Exception("No such type found!");
        }
    }
}
