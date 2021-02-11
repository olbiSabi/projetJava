package Tp3Exo1;

public class Voiture {
    public String marque;
    public int nbchevaux;
    public String[] options;

    Voiture(String marque, int nbchevaux, String[] Options){
        this.marque = marque;
        this.nbchevaux =nbchevaux;
        options = new String[Options.length];
        for (int i = 0; i < Options.length; i++){
            this.options[i] = Options[i];
        }
    }

    public void affiche(){
        System.out.println("***** Marque de la voiture: ---> " +marque+ " Nombre chevaux: = "+nbchevaux);
        System.out.print("***** Options: ----> ");
        for (int i = 0; i < options.length; i++){
            System.out.print(" "+options[i]);
        }
        System.out.println();
    }

    public void demarrer(){
        System.out.println("######## Demarrage OK ########");
    }


}
