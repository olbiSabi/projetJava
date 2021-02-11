package Tp4;

public class EmployeExterne extends Employe{
    private double chiffreAffaire;
    public EmployeExterne(String lenom) {
        super(lenom);
    }

    public EmployeExterne(String lenom, double lenbHeureSemaine, double letarifHoraire) {
        super(lenom, lenbHeureSemaine, letarifHoraire);
        chiffreAffaire = hoursWeek*tarifHoraire;
    }

    //Week salary
    public void salaryWeek(){
        setSalaire(chiffreAffaire+chiffreAffaire*0.05);
    }

    public void salaryMonth(){
        setSalaire((chiffreAffaire+chiffreAffaire*0.05)*4);
    }

    public void setInfosSalaire(double nbHeursDeTravail, double chiffreAffaire){
        hoursWeek = nbHeursDeTravail;
        this.chiffreAffaire = chiffreAffaire;
    }
}
