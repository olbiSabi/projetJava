package Tp2Exo2;

public class TableauComplexe extends Complexe  {

    public Complexe[] t;
     public TableauComplexe(int N){
        super();
         t = new Complexe[N];
         for (int i = 0; i < N; i++){
             t[i] = new Complexe(10);
         }
     }
     public void affiche(){
         for(int i=0;i<t.length;i++){
             if (t[i] != null)
                 System.out.println(t[i].getX() + " + (" + t[i].getY()+")i");
         }
    }

     public boolean compare(Complexe z){
         for(int i=0;i<t.length;i++) {
             if(t[i].getX() == z.getX() && t[i].getY() == z.getY()){
                 return true;
             }
         }
         return false;
    }

    public void echange(int a, int b){
         Complexe[] tmp = new Complexe[1];
         tmp[0] = t[a];
         t[a] = t[b];
         t[b] = tmp[0];
    }

    public void delete(int indice){
         int i,j;
         Complexe[] tmp = new Complexe[1];
         for (i = 0; i < t.length; i++){
             if (i == indice-1){
                 for (j = i+1; j < t.length; j++){
                     t[j-1] = t[j];
                 }
             }
         }
         t[t.length-1] = tmp[0];
    }

    public void add(Complexe z){
         int taille = t.length;
         Complexe[] tmp = new Complexe[taille];
         System.arraycopy(t,0, tmp, 0,taille);
         t = new Complexe[taille+1];
         t[taille] = z;
         System.arraycopy(tmp, 0, t, 0, taille);
    }
}
