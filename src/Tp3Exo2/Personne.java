package Tp3Exo2;

public class Personne {
    public String nom;
    public String prenom;
    public int age;

    Personne(String leNom, String leprenom, int lage){
        nom = leNom;
        prenom = leprenom;
        age = lage;
    }
    Personne(Personne p){
        nom = p.nom;
        prenom = p.prenom;
        age = p.age;
    }

    public void affiche(){
        System.out.println("Nom : " +nom);
        System.out.println("Prenom : " +prenom);
        System.out.println("Age :" +age+ " ans");
    }
}
