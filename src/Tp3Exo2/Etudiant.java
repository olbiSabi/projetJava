package Tp3Exo2;

public class Etudiant extends Personne{
    public String section;
    public int nbrJourAbsence;

    Etudiant(String leNom, String leprenom, int lage, String lasection, int lenbrJourAbsence) {
        super(leNom, leprenom, lage);
        section = lasection;
        nbrJourAbsence =lenbrJourAbsence;
    }

    public void affiche(){
        super.affiche();
        System.out.println("Section : " +section);
        System.out.println("Vous totaliser : " +nbrJourAbsence+ " Jours d'absence. ");
    }
}
