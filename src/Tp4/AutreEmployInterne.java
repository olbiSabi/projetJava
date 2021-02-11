package Tp4;

public class AutreEmployInterne extends Employe {

    public AutreEmployInterne(String lenom) {
        super(lenom);
    }

    public AutreEmployInterne(String lenom, double lenbHeureSemaine, double letarifHoraire) {
        super(lenom, lenbHeureSemaine, letarifHoraire);
    }

    //Week salary supplementary
    public double salarySupp(){
        if (hoursWeek > 35)
            return  (hoursWeek-35)*(1.4*tarifHoraire);
        else
            return 0;
    }
    //Week salary
    public void salaryWeek(){
        setSalaire(super.salaryWeekFixe() + salarySupp());
    }

    public void salaryMonth(){
        setSalaire((super.salaryWeekFixe() + salarySupp())*4);
    }

}
