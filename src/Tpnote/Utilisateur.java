package Tpnote;


public class Utilisateur {

    public String Nom;
    static int Id;
    PlateFormeAPP[] tableauApp;
    double solde;    //en euro
    Utilisateur(){
    }
    Utilisateur(String Nom, int solde){
        this.Nom = Nom;
        this.solde = solde;
    }

    Utilisateur(Utilisateur user){
        this.Nom = user.Nom;
        this.solde = user.solde;
    }

    public void  afficheSolde(){
        System.out.println("Utilisateur "+Nom+ " Solde = "+solde);
    }

    public int nombreApp(){
        return tableauApp.length;
    }

    public void AcheterApp(String App){

    }

    /*public void desinstallerApp(PlateFormeAPP App){
        int i, j;
            PlateFormeAPP[] tmp = new PlateFormeAPP[1];
            for (i = 0; i < tableauApp.length; i++){
                if (App.Id = tableauApp.Id){
                    for (j = i+1; j < tableauApp.length; j++){
                        tableauApp[j-1] = tableauApp[j];
                    }
                }
            }
            tableauApp[tableauApp.length-1] = tmp[0];
        }*/


}
