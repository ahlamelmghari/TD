package td3ex4;

public class Main4 {

    public static void main(String[] args) {

        // Création d'un bâtiment
        Batiment bâtiment1 = new Batiment();
        bâtiment1.setAdress("123 Rue de la Paix");

        // Affichage du bâtiment
        System.out.println(bâtiment1);

        // Création d'une maison
        Maison maison1 = new Maison("456 Rue des Champs-Élysées", 5);

        // Affichage de la maison
        System.out.println(maison1);

        // Création d'un immeuble
        Immeuble immeuble1 = new Immeuble("789 Avenue de la République", 100);

        // Affichage de l'immeuble
        System.out.println(immeuble1);
    }
}

