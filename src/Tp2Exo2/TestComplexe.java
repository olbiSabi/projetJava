package Tp2Exo2;

public class TestComplexe {
    public static void main(String[] args) {
    /*Complexe valeur = new Complexe();
    Complexe val = new Complexe();
    Complexe valeur1 = new Complexe(10);
    Complexe valeur2 = new Complexe(2.3,4.5);
    valeur.affiche();
    valeur1.affiche();
    valeur2.affiche();
    val = valeur1.conjuger();
    val.affiche();*/
        TableauComplexe val = new TableauComplexe(7);
        val.affiche();
        val.delete(2);
        System.out.println();
        val.affiche();

    }
}
