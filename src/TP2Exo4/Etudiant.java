package TP2Exo4;

public class Etudiant {
    String nom;
    String prenom;
    int numero; // numero de l’etudiant
    static int nbretucrees=0; // nombre d’etudiants crees
    String [] courssuivis; // tableau contenant les cours suivis
    int notes[]; // tableau des notes pour chaque cours suivis.

     public Etudiant(){
     }

     public Etudiant(String nom, String prenom,String[] Courssuivis){
         this.nom = nom;
         this.prenom = prenom;
         this.courssuivis = new String[Courssuivis.length];
         for (int i = 0; i < courssuivis.length; i++){
             courssuivis[i] = Courssuivis[i];
         }
         notes = new int[Courssuivis.length];
         for (int i = 0; i < Courssuivis.length; i++){
             notes[i] = 0;
         }
         numero = nbretucrees+1;
         nbretucrees++;
     }

     public  Etudiant(Etudiant etudiant){
         nom = etudiant.nom;
         prenom = etudiant.prenom;
         courssuivis = etudiant.courssuivis;
         numero = etudiant.numero;
         courssuivis = new  String[etudiant.courssuivis.length];
         for (int i = 0; i < etudiant.courssuivis.length; i++){
             courssuivis[i] = etudiant.courssuivis[i];
         }
         notes = new  int[etudiant.courssuivis.length];
         for (int i = 0; i < etudiant.courssuivis.length; i++){
             notes[i] = 0;
         }
     }

     public boolean compare(Etudiant personne){
         if (numero == personne.numero && nom.equals(personne.nom) && prenom.equals(personne.prenom)){
             return  true;
         }
         else
             return false;
     }

//     public void  transformeEtudiantEnString(){
//        String transforme;
//        transforme = String.valueOf(numero) + nom + prenom;
//
//     }

    public void affiche(){
        System.out.println("###### ----> N°"+numero+": Etudiant: " +nom+" "+prenom+ " ######");
        System.out.println("\t\t\t**** Cours suivis et note : ****");
        for (int i = 0; i < courssuivis.length; i++){
            System.out.println(courssuivis[i]+ "--------> "+notes[i]);
        }
    }

    public String getNom(){
         return this.nom;
    }
    public String getPrenom(){
         return this.prenom;
    }
}
