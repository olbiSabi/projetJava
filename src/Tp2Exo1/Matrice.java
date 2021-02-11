package Tp2Exo1;

public class Matrice {
    double[][] tab;
    // Constructeur
    Matrice(double[][] tab){
        int i, j;
        this.tab = new double[tab.length][];
        for (i = 0; i < tab.length; i++) {
            this.tab[i] = new double[tab[i].length];
        }
        for (i = 0; i < tab.length; i++){
            for (j = 0; j < tab[i].length; j++){
                this.tab[i][j] = tab[i][j] ;
            }
        }
    }

    //Methode affiche
     public void affiche(){
         for (int i = 0; i < tab.length; i++){
             for (int j = 0; j < tab[i].length; j++){
                 System.out.print(tab[i][j]+" | ");
             }
             System.out.println();
         }
     }

     //Somme de la ième ligne passer en parametre
    public double sommeLigne(int ligne){
        ligne = ligne - 1;
        double somme = 0;
        for (int j = 0; j < tab[ligne].length; j++ ){
            somme += tab[ligne][j];
        }
        return somme;
    }

    //compter le nombre d'élement d'un tableau
    public int nombreElement(){
        int compteur = 0;
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                compteur ++;
            }
        }
        return compteur;
    }

    //somme élement du tableau
    public double sommeTableau(){
        int somme = 0;
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                somme += tab[i][j];
            }
        }
        return somme;
    }

    //Moyenne du tableau
    public double moyenneMatrice(){
        return sommeTableau()/nombreElement();
    }

    //Element le plus grands de la matrice
    public double plusGrand(){
        double max = tab[0][0];
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                if(max < tab[i][j]){
                    max = tab[i][j];
                }
            }
        }
        return max;
    }

}
