package Tp5;

public class Document {

    // CONSTANTE
    final static double PRIX_DE_BASE_PAR_PAGE = 0.20 ; // prix en EUR

    public String titre;
    public static int numeroOrdre = 1000;
    public int nbrPage;
    char prefixe = '_';
    boolean empruntable = true;

    public Document(String letitre, int lenbrPage){
        numeroOrdre = numeroOrdre+1;
        titre = letitre;
        nbrPage = lenbrPage;
    }
     public String numOrdre(){
        return String.valueOf(numeroOrdre);
     }

     public  double valeur(){
        switch (this.prefixe){
            case 'L': return PRIX_DE_BASE_PAR_PAGE * nbrPage;
            case 'V': return PRIX_DE_BASE_PAR_PAGE * 2 * nbrPage;
            case 'M': return PRIX_DE_BASE_PAR_PAGE * 0.5 * nbrPage;
            default:  return PRIX_DE_BASE_PAR_PAGE * nbrPage;
        }
     }
    public boolean estEmpruntable() {
        return empruntable;
    }

    public void setPrefixe(char prefixe) {
        this.prefixe = prefixe;
    }

    public String toString() {
        return prefixe + numOrdre();
    }
}
