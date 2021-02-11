package Tpnote;
//ONIANKITAN Sabi
public class Magazin {
    public static void main(String[] args) {
        String[] A= {"King"};
        String[] B= {"ustwo","you"};
        Jeu j1 = new Jeu("Candy Crush Saga",A,0,"occasionnel", true);
        Jeu j2 = new Jeu("Monument Valley",B,2.99,"", false);
        Utilisateur u1 = new Utilisateur("Paul Arthur",1);
        //j1.affiche();
        //System.out.println(j2.affiche2());
        u1.afficheSolde();
    }
}
