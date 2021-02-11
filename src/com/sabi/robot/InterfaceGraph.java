package com.sabi.robot;

import javax.swing.*;
import java.awt.*;

public class InterfaceGraph extends JFrame {
    private JFrame fenetre;
    private JPanel principal;
    private JPanel ouest;
    private JPanel est;
    private JPanel nord ;
    private JPanel centre;
    private JPanel blocPollueur;
    private JPanel blocDirectionPollueur;
    private JPanel blocPollueurLibre;
    private JPanel blocNettoyeur;
    private JPanel blocDirectionNettoyeur;
    private JPanel blocNettoyeurLibre;
    private JPanel menu;
    private JPanel afficheInformation;

    public InterfaceGraph(){
        fenetre = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);


        ouest = new JPanel();
        est = new JPanel();
        nord = new JPanel();
        centre = new JPanel();

        ouest.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.BLACK));
        est.setBorder(BorderFactory.createMatteBorder(1,1,5,5,Color.BLACK));
        nord.setBorder(BorderFactory.createMatteBorder(5,5,1,5,Color.BLACK));

        ouest.setBackground(Color.red);
        est.setBackground(Color.red);
        nord.setBackground(Color.red);
        centre.setBackground(Color.red);

        fenetre.add(nord, BorderLayout.NORTH);
        fenetre.add(ouest, BorderLayout.WEST);
        fenetre.add(est, BorderLayout.EAST);
        fenetre.add(centre, BorderLayout.CENTER);


        // definition des couleurs de contour

        // definition de la taille


        //insertion des panels sur la fenetre




    }
}
