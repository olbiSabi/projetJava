package Tp5;

public class MainBibliotheque {
    public static void main(String[] args) {
        Livres l1 = new Livres("Programmer en Java", "Delannoy", 799);
        VieuxLivres v1 = new VieuxLivres("La voie royale", "Lenoir", 314, 1862);
        Magazines m1 = new Magazines("Pif", 34, 190);
       Bibliotheque b = new Bibliotheque(l1);
        b.ajouterVieuxLivre(v1);
        b.ajouterMagazine(m1);
        b.affiche();
        b.rechercheDocument("V1003");


        /*System.out.println(l1 + " (" +  l1.valeur()+ " EUR)" );
        System.out.println(v1 + " (" +  v1.valeur()+ " EUR)" );
        System.out.println(m1 + " (" +  m1.valeur()+ " EUR)" );*/
    }
}
