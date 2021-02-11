package Tp4;

public class Paie {
    public static void main(String[] args) {
        Employe e1 = new Employe("Olbi", 37, 10);
        AutreEmployInterne e2 = new AutreEmployInterne("Sabi", 37, 10);
        EmployeExterne e3 = new EmployeExterne("Sabi", 37, 10);
        /*e2.salaryWeek();
        e2.affiche();
        e2.salaryMonth();
        e2.affiche();*/
        //e1.salaryMonth();
        //e1.affiche();
        e3.salaryWeek();
        e3.affiche();
        e3.salaryMonth();
        e3.affiche();
    }
}
