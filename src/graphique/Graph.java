package graphique;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graph extends WindowAdapter{


    public static void main(String[] args) {
        Frame fenetre = new Frame("Ma première fenêtre");
        fenetre.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button[] btn = new Button[17];
        fenetre.setLayout(new BorderLayout());

        for (int i = 0; i < 17; i++){
            btn[i] = new Button(Integer.toString(1+i));
        }
        GridLayout grill = new GridLayout(4,4);
        fenetre.setLayout(grill);

        for (int i = 0; i < 16; i++) {
            fenetre.add(btn[i]);
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int j = (int) (Math.random()*10);
                        fenetre.remove(btn[j]);

                }
            });
        }
        fenetre.pack();
        fenetre.setVisible(true);
    }

}
