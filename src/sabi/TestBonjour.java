package sabi;


public class TestBonjour {

    public static void main(String[] args) {
        Bonjour val = new Bonjour();
        val.affiche(val);
        Bonjour val1 = new Bonjour(6,8);
        val.affiche(val1);
    }
}
