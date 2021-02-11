package Tp3Exo1;

public class Main {
    public static void main(String[] args) {
        String[] op1={"ABS", "GPS"};
        String[] op2={"ABS", "autoradio", "jantes alu"};
        String[] op3={"GPS", "sieges cuir"};
        Voiture v1=new Voiture("Audi", 120, op1);
        Voiture v2=new Voiture("Peugeot", 80, op2);
        VoitureCourse v3=new VoitureCourse("BMW", op3, true);
        v1.demarrer();
        v3.demarrer();
        Concession c=new Concession(v1);
        c.ajoutVoiture(v2);
        c.ajoutVoiture(v3);
        c.affiche();
        c.rechercheOptions("GPS");
    }
}
