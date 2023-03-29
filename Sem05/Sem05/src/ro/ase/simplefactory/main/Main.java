package ro.ase.simplefactory.main;

import ro.ase.simplefactory.Bus;
import ro.ase.simplefactory.ITransportVehicle;
import ro.ase.simplefactory.VehicleFactory;
import ro.ase.simplefactory.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])
    {
        VehicleFactory factory=new VehicleFactory();
        try {
            ITransportVehicle bus= factory.createObject(VehicleType.BUS,20);
            ITransportVehicle tram= factory.createObject(VehicleType.TRAM,25);
            ITransportVehicle trolley= factory.createObject(VehicleType.TROLLEY,25);
            List<ITransportVehicle> vehicles=new ArrayList<>();
            vehicles.add(bus);
            vehicles.add(tram);
            vehicles.add(trolley);

            vehicles.add(factory.createObject(VehicleType.BUS,10));
            vehicles.add(factory.createObject(VehicleType.TRAM,5));
            vehicles.add(factory.createObject(VehicleType.SUBWAY,300));

            for(ITransportVehicle vehicle:vehicles){
                vehicle.showInfo();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
