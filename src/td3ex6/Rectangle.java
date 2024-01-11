package td3ex6;

public class Rectangle extends Figure {
    private int longueur;
    private int largeur;
    public double getPeremeter() {

        return 2 * (largeur+ longueur);
    }

    @Override
    public double getAire() {
        return largeur*longueur;
    }
    public String toString(){
        return "largeur est"+largeur+"langueur"+longueur;
    }

    public Rectangle(){
        super("rectangle");
    }
    public Rectangle(int langueur, int largeur){
        super("disque");
        this.longueur=langueur;
        this.largeur=largeur;
    }
    public Rectangle(int langueur, int largeur,String nom){
        super("disque");
        this.longueur=langueur;
        this.largeur=largeur;
    }
    public int getLangueur(){
        return longueur;
    }
    public int getLargeur(){
        return largeur;
    }
    public void setLangueur(int langueur){
        this.longueur=langueur;
    }
    public void setLargeur(int largeur){
        this.largeur=largeur;
    }

}
