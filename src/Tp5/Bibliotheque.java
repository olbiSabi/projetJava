package Tp5;


import java.util.List;

public class Bibliotheque {

    Document[] armoire;

    Bibliotheque(Document document){
        armoire = new Document[1];
        armoire[0] = document;
    }

    // Ajouter livres
    public  void ajouterLivre(Livres document){
        int newTaille = armoire.length+1;
        Document[] tmp = new Document[newTaille];
        tmp[newTaille-1] = document;
        System.arraycopy(armoire, 0, tmp, 0, armoire.length);
        armoire = new Document[newTaille];
        System.arraycopy(tmp, 0, armoire, 0, newTaille);
    }

    //Ajouter Vieux Livres
    public  void ajouterVieuxLivre(VieuxLivres document){
        int newTaille = armoire.length+1;
        Document[] tmp = new Document[newTaille];
        tmp[newTaille-1] = document;
        System.arraycopy(armoire, 0, tmp, 0, armoire.length);
        armoire = new Document[newTaille];
        System.arraycopy(tmp, 0, armoire, 0, newTaille);
    }

    //Ajouter Magazines
    public  void ajouterMagazine(Magazines document){
        int newTaille = armoire.length+1;
        Document[] tmp = new Document[newTaille];
        tmp[newTaille-1] = document;
        System.arraycopy(armoire, 0, tmp, 0, armoire.length);
        armoire = new Document[newTaille];
        System.arraycopy(tmp, 0, armoire, 0, newTaille);
    }

    //affiche
    public void affiche(){
        for(int i = 0; i < armoire.length; i++){
            System.out.println(armoire[i].toString());
        }
    }

    //recherche
    public void rechercheDocument(String num){
        for (int i = 0; i < armoire.length; i++){
            if (this.toString().equals(num)){
                System.out.println(armoire[i].toString());
            }
        }
    }

}
