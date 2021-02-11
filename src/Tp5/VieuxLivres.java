package Tp5;

public class VieuxLivres extends Livres {
    public int annee;
    public VieuxLivres(String letitre, String lenomAuteur, int lenbrPage, int lannee) {
        super(letitre, lenomAuteur, lenbrPage);
        annee = lannee;
        prefixe = 'V';
    }

    public String toString(){
        return super.toString() +" - "+titre+" - par "+nomAuteur+" - "+nbrPage+ " - "+annee;
    }
}
