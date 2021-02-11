package Tp2Exo3;

import Tp2Exo2.Complexe;

public class Recette {
    public String nom;
    public int numero;
    public String[] ingredients;
    public int[] proportions;
    static int nbrecettes = 0;

    public Recette(String nom, String[] Ingredients, int[] Proportions){
        ingredients = new String[Ingredients.length];
        proportions = new int[Proportions.length];
        this.nom = nom;
        for (int i =0; i< Ingredients.length; i++){
            this.ingredients[i] = Ingredients[i];
        }
        for (int i =0; i< Proportions.length; i++){
            this.proportions[i] = Proportions[i];
        }
        nbrecettes++;
        numero = nbrecettes;
    }

    public void affiche(){
        System.out.println("La recette " +nom+ " de numéro " +numero+ " à pour détaille:");
        for (int i = 0; i < ingredients.length; i++){
            System.out.println("Ingrédient " +ingredients[i]+ " pour une Proportion de  " +proportions[i]);
        }
    }


    public void ajoute(String Ingredients, int Proportions){
        int tailleI = this.ingredients.length;
        String[] tmp = new String[tailleI+1];
        System.arraycopy(this.ingredients,0, tmp, 0,tailleI);
        tmp[tailleI] = Ingredients;
        this.ingredients = new String[tailleI+1];
        System.arraycopy(tmp,0, this.ingredients, 0,tailleI+1);

        int tailleP = this.proportions.length;
        int[] tmp1 = new int[tailleP+1];
        System.arraycopy(this.proportions,0, tmp1, 0,tailleP);
        tmp1[tailleP] = Proportions;
        this.proportions = new int[tailleP+1];
        System.arraycopy(tmp1,0, this.proportions, 0,tailleP+1);

    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public static int getNbrecettes() {
        return nbrecettes;
    }

    public int[] getProportions() {
        return proportions;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
