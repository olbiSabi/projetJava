package Tp5;

public class Magazines extends Document {
    int numeroMagazine;
    public Magazines(String letitre, int lenbrPage, int lenumeroMagazine) {
        super(letitre, lenbrPage);
        numeroMagazine = lenumeroMagazine;
        prefixe = 'M';
    }

    public String toString(){
        return super.toString() +" - "+titre+" - "+nbrPage+ " pages - N° "+numeroMagazine;
    }

}
