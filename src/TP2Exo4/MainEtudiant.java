package TP2Exo4;

public class MainEtudiant {
    public static void main(String[] args) {
        String[] cours1={"Systeme Info", "Java", "UML"};
        String[] cours2={"Programmation", "Reseau info", "Math"};
        Etudiant e1 = new Etudiant("ONIANKITAN", "Sabi",cours1);
        Etudiant e2 = new Etudiant("ONIANKITAN", "Sabi",cours2);
        Etudiant e3 = new Etudiant(e1);
        /*e1.affiche();
        e2.affiche();
        e3.affiche();
        System.out.println(e1.compare(e3));*/
        Prom p1 = new Prom(e1);
        p1.ajoute(e2);
        p1.affiche();
    }
}
