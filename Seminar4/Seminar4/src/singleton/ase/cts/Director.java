package singleton.ase.cts;

public class Director {
    private String nume;
    private int varsta;

    private static Director instanta=null;
    private Director(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    //lzazy initialisation
    public synchronized static Director getInstance(String nume){
        if(instanta==null){
            instanta=new Director(nume,30);
        }
        return instanta;
    }
}
