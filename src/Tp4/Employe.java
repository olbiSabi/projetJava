package Tp4;

public class Employe {
    private String name;
    public double hoursWeek;
    public double tarifHoraire;
    private double salaire;

    public  Employe(String lenom){
        name = lenom;
    }
    public Employe(String lenom, double lenbHeureSemaine, double letarifHoraire){
        name = lenom;
        hoursWeek = lenbHeureSemaine;
        tarifHoraire = letarifHoraire;
        salaire = 0;
    }

    //Week salary Fixe
    public double salaryWeekFixe(){
        if (hoursWeek > 35)
            return 35*tarifHoraire;
        else
            return hoursWeek*tarifHoraire;
    }
    //Week salary supplementary
    public double salarySupp(){
        if (hoursWeek > 35)
            return  (hoursWeek-35)*(1.1*tarifHoraire);
        else
            return 0;
    }
    //Week salary
    public void salaryWeek(){
        salaire = salaryWeekFixe()+salarySupp();
    }

    //Month salary
    public void salaryMonth(){
        salaire = (salaryWeekFixe()+salarySupp())*4;
    }

    public void affiche(){
        System.out.println("Monsieur: " +name+"\nNombre Heures/semaine: " +hoursWeek+ "\nTarif horaire: "+tarifHoraire);
        System.out.println("Le salaire est de: "+salaire+ " €");
    }

    //salary hours Supplementary month
/*    public void salaryHoursSuppMonth(){
        if (4*hoursWeek <= 141){
            salaire  =  hoursWeek*tarifHoraire;
        }
        else {
            salaire = (hoursWeek*tarifHoraire) + ((4*hoursWeek-141)*(1.1*tarifHoraire));
        }
    }*/

    public double getSalaire(){
        return salaire;
    }
    public void setSalaire( double lesalaire){
        salaire = lesalaire;
    }

}
