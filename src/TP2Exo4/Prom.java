package TP2Exo4;

public class Prom {
    Etudiant tab[];
    Prom(Etudiant etudiant){
        tab = new Etudiant[1];
        tab[0] = etudiant;
    }

    public void ajoute(Etudiant etu){
        Etudiant[] copie = new Etudiant[tab.length+1];
        for (int i = 0; i < tab.length; i++){
            copie[i] = tab[i];
        }
        copie[tab.length] = etu;
        tab = new Etudiant[copie.length];
        for (int j = 0; j < copie.length; j++){
            tab[j] = copie[j];
        }
    }

    public void affiche(){
        for (int i = 0; i < tab.length; i++){
            tab[i].affiche();
        }
    }
}
