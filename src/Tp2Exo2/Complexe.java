package Tp2Exo2;

public class Complexe {

    private double x;
    private double y;

    public Complexe(){
        this.x = 3;
        this.y = 5;
    }
    public Complexe(int a){
        this.x = Math.random()*a;
        this.y = Math.random()*a;
    }
    public Complexe(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("La représentation algébrique du nombre complexe z = "+x+" + "+y+"i");
    }

    public Complexe conjuger(){
        Complexe z = new Complexe();
        z.x = 1*this.x;
        z.y = -1*this.y;
        return z;
    }
    public void add(Complexe z){
        this.x += z.x;
        this.y += z.y;
    }

    public boolean compare(Complexe z){
        if (this.x == z.x && this.y == z.y){
            return true;
        }
        return false;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }
}
