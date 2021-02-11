package Tp3Exo2;

public class Prof extends Personne {
    public String matiere;
    Prof(String leNom, String leprenom, int lage, String lamatiere) {
        super(leNom, leprenom, lage);
        matiere = lamatiere;
    }

    public void affiche(){
        super.affiche();
        System.out.println("Enseigne : " +matiere);
    }
}
