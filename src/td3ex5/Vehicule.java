package td3ex5;

public class Vehicule {

    private int nbPassager;

    public Vehicule(int n) {
        this.nbPassager = n;
    }

    public String toString() {
        return "Nombre de passagers : " + this.nbPassager;
    }
}

