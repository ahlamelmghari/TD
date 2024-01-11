package td3ex4;

public class Batiment {
    String adress;
    public Batiment(){
    }
    public Batiment(String adress){
        this.adress=adress;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public String  toString(){
        return "Batiment{" +
                "adresse='" + adress + '\'' +
                '}';

    }
}
