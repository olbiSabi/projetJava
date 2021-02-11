package Tp2Exo3;

public class testMain {

    public static void main(String[] args) {
        String[] ingredients1= {"farine", "oeufs", "lait"};
        int[] proportions1={500, 6, 1000};
        Recette r1=new Recette("Crepes", ingredients1, proportions1);
        String[] ingredients2= {"sucre", "citron", "beurre", "oeufs"};
        int[] proportions2={200, 2, 80, 2};
        Recette r2=new Recette("Creme de citron", ingredients2, proportions2);

        //r1.affiche();
        Menu m=new Menu(3);
       m.ajoutPlat(r1);
       m.ajoutPlat(r2);
       m.affiche();
       System.out.println("Nb d’oeufs? "+m.totalIngredient("oeufs"));
       r1.ajoute("fleur d’oranger", 5);
       m.affiche();
       m.ajoutPlat(r1);

    }
}
