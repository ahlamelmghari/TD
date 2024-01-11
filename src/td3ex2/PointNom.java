package td3ex2;

public class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y,char nom) {
        super(x, y);
        this.nom=nom;
    }



    public void setNom(char nom){
        this.nom=nom;
    }
    public void setNomPoint(int x, int y, char nom){
        super.Point(x,y);
        this.nom=nom;

    }
    public void affcor(){
        super.affCoord();
        System.out.println("le nom du point est:"+nom);
    }
}

