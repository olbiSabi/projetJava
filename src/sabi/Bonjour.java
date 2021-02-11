package sabi;

public class Bonjour {
    int x ;
    int y;
    public Bonjour(){
        this.x = 1;
        this.y = 2;
    }
    public Bonjour(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void affiche(Bonjour valeur){
        System.out.println("abscisse = " +valeur.x+ " et ordonnée = "+valeur.y);
    }
}
