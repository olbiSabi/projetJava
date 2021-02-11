package Tp5;

public class Livres extends Document {
    public String nomAuteur;

    public Livres(String letitre, String lenomAuteur, int lenbrPage) {
        super(letitre, lenbrPage);
        nomAuteur = lenomAuteur;
        prefixe = 'L';
    }

    public String toString(){
        return super.toString() +" - "+titre+" - par "+nomAuteur+" - "+nbrPage;
    }
}
