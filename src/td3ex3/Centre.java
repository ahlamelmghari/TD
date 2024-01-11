package td3ex3;

public class Centre extends Point{
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom=nom;
    }




    public void affNom(){
        System.out.println("le nom du point est:"+nom);
    }
    public void affCorNom(){
        super.affCoord();
        System.out.println("le nom du point est:"+nom);

    }
}

