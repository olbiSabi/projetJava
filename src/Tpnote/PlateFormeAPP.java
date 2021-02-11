package Tpnote;

public class PlateFormeAPP {
    private String nom;
    public static  int Id = 0;
    String[] NomDeveloppeurs;
    double Prix;
    double Evaluation;
    int NombreDeTelechargements = 0;
    int NombreEvaluations = 0;

    PlateFormeAPP(String nom, String[] NomDeveloppeurs, double Prix){
        this.nom =nom;
        this.Prix = Prix;
        this.NomDeveloppeurs = new String[NomDeveloppeurs.length];
        for (int i = 0; i < NomDeveloppeurs.length; i++){
            this.NomDeveloppeurs[i] = NomDeveloppeurs[i];
        }
        Id = Id+1;
    }
    PlateFormeAPP(PlateFormeAPP copie){
        this.nom =copie.nom;
        this.Prix = copie.Prix;
        NomDeveloppeurs = new String[copie.NomDeveloppeurs.length];
        for (int i = 0; i < copie.NomDeveloppeurs.length; i++){
            this.NomDeveloppeurs[i] = copie.NomDeveloppeurs[i];
        }
        Id = Id+1;
    }

    public double Evaluer(int x){
        do {
            Evaluation = (Evaluation+x)/NombreEvaluations;
        }
        while (x<0 || x>5);
        return  Evaluation;
    }
     public  void affiche(){
        System.out.println("Id: "+Id+"  Nom: "+nom+"  Prix: "+Prix+"€  Evaluation: "+Evaluation+
                " Nombre De Telechargements "+NombreDeTelechargements);
        for (int i = 0; i < NomDeveloppeurs.length; i++){
            System.out.println(NomDeveloppeurs[i]);
        }

     }
    public String affiche2(){
        return "Id "+ String.valueOf(Id) +" Nom "+nom+" Prix "+String.valueOf(Prix)+" Evaluation "+Evaluation
                +" Nombre De Telechargements"+String.valueOf(NombreDeTelechargements);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
