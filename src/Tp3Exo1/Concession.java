package Tp3Exo1;

public class Concession {
    Voiture[] stock;

    Concession(Voiture voiture){
        stock = new Voiture[1];
        stock[0] = voiture;
    }
    public  void ajoutVoiture(Voiture car){

        int newTaille = stock.length+1;
        Voiture[] tmp = new Voiture[newTaille];
        tmp[newTaille-1] = car;
        System.arraycopy(stock, 0, tmp, 0, stock.length);
        stock = new Voiture[newTaille];
        System.arraycopy(tmp, 0, stock, 0, newTaille);
    }

    public void affiche(){
        System.out.println("########## Voiture en stock ##########");
        for(int i = 0; i < stock.length; i++){
            System.out.println("Voiture N° "+i);
            stock[i].affiche();
        }
    }

    public void rechercheOptions(String option){
        for (int i = 0; i < stock.length; i++){
            for (int j = 0; j < stock[i].options.length; j++){
                if (stock[i].options[j].equals(option)){
                    stock[i].affiche();
                }
            }
        }
    }
}
