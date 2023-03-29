package singleton.ase.cts;

public class Papa {
    private String nume;
    private int nrAniFunctie;
    private int alCatelea;
    private static Papa papa=new Papa("Benedict",2, 276);

    //facem constr private sa fie accesat doar din interiorul  clasei
    //vrem sa putem crea un sg obiect
    private Papa(String nume, int nrAniFunctie, int alCatelea) {
        this.nume = nume;
        this.nrAniFunctie = nrAniFunctie;
        this.alCatelea = alCatelea;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAniFunctie() {
        return nrAniFunctie;
    }

    public void setNrAniFunctie(int nrAniFunctie) {
        this.nrAniFunctie = nrAniFunctie;
    }

    public int getAlCatelea() {
        return alCatelea;
    }

    public void setAlCatelea(int alCatelea) {
        this.alCatelea = alCatelea;
    }

    public static Papa getInstance(){
//        Papa instanta=new Papa("Benedict",2, 276);
//        return instanta;
        return papa;
    }
}
