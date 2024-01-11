package td3ex6;

public  abstract class Figure {
    private String nom;
    public Figure(String nom){
        this.nom=nom;
    }

    public abstract double getPeremeter();
    public abstract double getAire();
    public abstract String toString();

}
