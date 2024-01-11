package td3ex6;

public class Disque extends Figure {
    private double rayon;
    private char centre;
    public Disque(){
        super("disque");


    }
    public Disque (double rayon,char centre){
        super("disque");
        this.rayon=rayon;
        this.centre=centre;
    }
    public Disque(int rayon,char centre ,String nom){
        super(nom);
        this.rayon=rayon;
        this.centre=centre;
    }

    @Override
    public double getPeremeter() {

        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI*Math.pow(rayon,2);
    }
    public double getRayon(){
        return rayon;
    }
    public void setRayon(double rayon){
        this.rayon=rayon;
    }
    public char getCentre(){
        return centre;
    }
    public void setCenter(char centre){
        this.centre=centre;
    }


    @Override
    public String toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '\'' +
                '}';
    }
}
