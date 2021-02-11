package Tp3Exo2;

public class Main {
    public static void main(String[] args) {
        Etudiant etu1 = new Etudiant("ONIANKITAN","Sabi",28,"Informatique",2);
        Prof prf1 = new Prof("OWOLABI","Olbi", 37, "Reseau Informatique");
        etu1.affiche();
        prf1.affiche();
    }
}
