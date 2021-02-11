package Tp2Exo1;

public class TestMatrice {
    public static void main(String[] args) {
        double [][] tableau = {{7,3,1,5},{1,2},{55},{4,8,9}};
        Matrice valeur = new Matrice(tableau);
        valeur.affiche();
        System.out.println("Somme de la 3 ème ligne: "+valeur.sommeLigne(2));
        System.out.println("Nombre d'élément du tableau: "+valeur.nombreElement());
    }
}
