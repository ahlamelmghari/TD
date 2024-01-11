package td3ex2;

public class Main2 {
    public static void main(String[] args){
        PointNom pt=new PointNom(1,2,'B');
        pt.affcor();
        pt.deplace(1,2);
        pt.affcor();
        pt.setNom('c');
        pt.affcor();
    }
}
