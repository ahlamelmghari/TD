package td3ex2;

public class Point {
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;

}
