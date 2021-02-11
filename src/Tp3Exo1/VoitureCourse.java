package Tp3Exo1;

public class VoitureCourse extends Voiture {

    public boolean aileron;
    VoitureCourse(String marque, String[] Options, boolean aileron ) {
        super(marque, 250,Options);
        this.aileron = aileron;
    }

    public void affiche(){
        super.affiche();
        if (aileron){
            System.out.println("Je suis une voiture de course avec aileron");
        }
        else
            System.out.println("Je suis une voiture de course sans aileron");
    }

    public void demarrer(){
        super.demarrer();
        System.out.println("Vrouuum");
    }
}
