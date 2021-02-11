package com.sabi.robot;

import javax.swing.*;
import java.awt.*;

public class FenetreRobo extends JFrame {
    private JPanel Principal;
    private JPanel container;
    private JPanel containerCenter;
    private JPanel containerWest;
    private JPanel containerEast;
    private JPanel containerNorth;
    private JPanel boxPollueurBas;
    private JPanel boxPollueurHaut;
    private JPanel boxNettoyeurBas;
    private JPanel boxNettoyeurHaut;
    private JButton btnPollueurToutDroit;
    private JButton btnPollueurLibre;
    private JButton btnPollueurSauteur;
    private JButton btnNettoyeurSmart;
    private JButton btnNettoyeurLibre;
    private JButton btnNettoyeurStandard;
    private JButton btnPollueurDroit;
    private JButton btnpollueurBas;
    private JButton btnPollueurHaut;
    private JButton btnNettoyeurDroit;
    private JButton btnNettoyeurGauche;
    private JButton btnNettoyeurHaut;
    private JButton btnNettoyeurBas;
    private JButton btnPollueurGauche;
    private JTextField nombreDeCollonne;
    private JTextField nombreDeLigne;
    private JTextField positionX;
    private JTextField positionY;
    private JButton btnValider;
    private JButton btnRenitialiser;
    private JButton btnQuitter;
    private JTextArea nombrePapierGras;
    private JButton papierGras;
    private JButton caseNettoyer;

    public FenetreRobo(){
        add(Principal);
        setTitle("Robot");
        setSize(900,600);
        createUIComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void createUIComponents() {
        containerWest = new JPanel();
        containerEast = new JPanel();
        containerNorth = new JPanel();
        containerWest.setPreferredSize(new Dimension(180,100));
        containerEast.setPreferredSize(new Dimension(180,100));
        containerNorth.setPreferredSize(new Dimension(100,100));

        containerWest.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.BLACK));
        containerEast.setBorder(BorderFactory.createMatteBorder(1,1,5,5,Color.BLACK));
        containerNorth.setBorder(BorderFactory.createMatteBorder(5,5,1,5,Color.BLACK));

        // pollueur tout droit
        btnPollueurToutDroit = new JButton();
        btnPollueurToutDroit.setPreferredSize(new Dimension(40, 60));

        // pollueur sauteur
        btnPollueurSauteur = new JButton();
        btnPollueurSauteur.setPreferredSize(new Dimension(40, 60));

        // pollueur libre
        btnPollueurLibre = new JButton();
        btnPollueurLibre.setPreferredSize(new Dimension(40, 60));

        // Nettoyeur Smart
        btnNettoyeurSmart = new JButton();
        btnNettoyeurSmart.setPreferredSize(new Dimension(40, 60));

        // Nettoyeur standar
        btnNettoyeurStandard = new JButton();
        btnNettoyeurStandard.setPreferredSize(new Dimension(40, 60));

        // Nettoyeur libre
        btnNettoyeurLibre = new JButton();
        btnNettoyeurLibre.setPreferredSize(new Dimension(40, 60));
//###################POLLUEUR############################"
        // boutton pollueur Gauche
        btnPollueurGauche = new JButton();
        btnPollueurGauche.setPreferredSize(new Dimension(20, 10));

        // boutton pollueur Droite
        btnPollueurDroit = new JButton();
        btnPollueurDroit.setPreferredSize(new Dimension(20, 10));

        // boutton pollueur Haut
        btnPollueurHaut = new JButton();
        btnPollueurHaut.setPreferredSize(new Dimension(20, 10));

        // boutton pollueur Bas
        btnpollueurBas = new JButton();
        btnpollueurBas.setPreferredSize(new Dimension(20, 10));
//###################POLLUEUR############################"
        // boutton Nettoyeur Gauche
        btnNettoyeurGauche = new JButton();
        btnNettoyeurGauche.setPreferredSize(new Dimension(20, 10));

        // boutton Nettoyeur Droite
        btnNettoyeurDroit = new JButton();
        btnNettoyeurDroit.setPreferredSize(new Dimension(20, 10));

        // boutton Nettoyeurr Haut
        btnNettoyeurHaut = new JButton();
        btnNettoyeurHaut.setPreferredSize(new Dimension(20, 10));

        // boutton Nettoyeur Bas
        btnNettoyeurBas = new JButton();
        btnNettoyeurBas.setPreferredSize(new Dimension(20, 10));

//######################## Etat Du Monde #################################"
        caseNettoyer = new JButton();
        caseNettoyer.setPreferredSize(new Dimension(40, 40));
        caseNettoyer.setBackground(Color.CYAN);
        papierGras = new JButton();
        papierGras.setPreferredSize(new Dimension(40, 40));
        papierGras.setBackground(Color.BLACK);
    }
}
