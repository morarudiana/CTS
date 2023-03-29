package factory_method.main;

import factory_method.Factory;
import factory_method.FactoryAutobuz;
import factory_method.FactoryTrolebuz;
import factory_method.TransportVehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fAutobuze=new FactoryAutobuz();
        Factory fTrolebuze=new FactoryTrolebuz();

        List<TransportVehicle> mijloaceTransport=new ArrayList<>();
        //mijloaceTransport.add(fAutobuze.createObject(10));
    }
}
