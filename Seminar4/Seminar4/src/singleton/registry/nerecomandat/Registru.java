package singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private static Map<String,Firma> firme = new HashMap<>();
    public static Firma getFirma(String nume){
        if(!firme.containsKey(nume)){
            firme.put(nume, new Firma(nume,0));
        }
        return firme.get(nume);
    }
}
