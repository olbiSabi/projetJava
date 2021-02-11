package Tp2Exo3;

public class Menu {
    Recette[] plats;
    int nbPlatsAjoutes = 0;

    Menu(int nbPlatsAjoutes){

        plats = new Recette[nbPlatsAjoutes];
        for (int i = 0; i < nbPlatsAjoutes; i++){
            plats[i] = null;
        }
    }

    public void ajoutPlat(Recette add){
         if(plats.length > nbPlatsAjoutes){
             plats[nbPlatsAjoutes] = add;
             nbPlatsAjoutes = nbPlatsAjoutes+1;
         }
         else {
             System.out.println("Erreur menue complet");
         }
    }

    public void affiche(){
        System.out.println("Menu:");
        for (int i = 0; i < nbPlatsAjoutes; i++){
            plats[i].affiche();
        }
    }

    public int totalIngredient(String ingredients){
        int sommeProportion = 0;
        for (int i = 0; i < plats.length-1; i++){
            for (int j = 0; j < plats[i].ingredients.length; j++){
                if (plats[i].ingredients[j].equals(ingredients)){
                    sommeProportion = sommeProportion + plats[i].proportions[j];
                }
            }
        }
        return sommeProportion;
    }

}
