package Tpnote;

public class Jeu extends PlateFormeAPP {
    String typeJeu;
    boolean Multijoueur;

    Jeu(String nom, String[] NomDeveloppeurs, double Prix, String typeJeu, boolean Multijoueur) {
        super(nom, NomDeveloppeurs, Prix);
        this.typeJeu = typeJeu;
        this.Multijoueur = Multijoueur;

    }

    Jeu(PlateFormeAPP copie,String typeJeu, boolean Multijoueur) {
        super(copie);
        this.typeJeu = typeJeu;
        this.Multijoueur = Multijoueur;
    }

    public void affiche(){
        System.out.println("Type de Jeu: "+typeJeu+" Mode jeu: "+Multijoueur);
        super.affiche();
    }
}
