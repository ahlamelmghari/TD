package td3ex4;

public class Maison extends Batiment {
    private int nbch;

    public Maison(String adress, int nbch) {
        super(adress);
        this.nbch=nbch;
    }
    public Maison (){
        super();
        this.nbch=0;

    }
    public int getNbChambres() {
        return nbch;
    }

    public void setNbChambres(int nbChambres) {
        this.nbch = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "adresse='" + getAdress() + '\'' +
                ", nbChambres=" + nbch +
                '}';
    }
}
