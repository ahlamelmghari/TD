package td3ex3;

public class Cercle extends Centre{
    private int rayon;

    public Cercle(int x, int y, char nom, int rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Rayon : " + rayon);
    }
}
