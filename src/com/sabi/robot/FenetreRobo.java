package com.sabi.robot;

import com.sabi.exception.RobotException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton papierGras;
    private JButton caseNettoyer;
    private JPanel tableau;
    private JLabel messageError;
    private JLabel nombePapierGras;
    public JLabel box[][];
    private JLabel[] boxx;
    public int NBC;
    public int NBL;
    public Monde monde;

    public FenetreRobo(){
        add(Principal);
        setTitle("Robot");
        setSize(900,600);
        NBC = 8;
        NBL = 8;;
        box = new JLabel[NBL][NBC];
        createUIComponents();
        apparenceDesComposant();
        initMonde(NBL,NBC);
        //initMonde();
        //initParamettrerMonde(5,5);
/*################################################################################################################
 *********************************CONFIGURATION DES ECOUTEUR ADDACTIONLISTNER ************************************
##################################################################################################################*/

        /*##########################################################################
                             **********  BOUTTON VALIDE ****************
         ###########################################################################*/
        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(4,9);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR SAUTEUR *******************
        ###########################################################################*/
        btnPollueurSauteur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(4,7);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR TOUT DROIT ****************
         ###########################################################################*/
        btnPollueurToutDroit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(7,3);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR LIBRE *******************
        ###########################################################################*/
        btnPollueurLibre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(6,5);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON NETTOYEUR SMART ****************
         ###########################################################################*/
        btnNettoyeurSmart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(5,2);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON NETTOYEUR STANDARD ***************
        ###########################################################################*/
        btnNettoyeurStandard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(0,0);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             ********** BOUTTON NETTOYEUR LIBRE *************
         ###########################################################################*/
        btnNettoyeurLibre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(0,4);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR HAUT *******************
        ###########################################################################*/
        btnPollueurHaut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(6,6);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR BAS ****************
         ###########################################################################*/
        btnpollueurBas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(1,6);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR GAUCHE *******************
        ###########################################################################*/
        btnPollueurGauche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(4,4);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON POLLUEUR DROIT ***************
        ###########################################################################*/
        btnPollueurDroit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(2,2);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             ********** BOUTTON NETTOYEUR HAUT *************
         ###########################################################################*/
        btnNettoyeurHaut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(0,5);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON NETTOYEUR BAS *******************
        ###########################################################################*/
        btnNettoyeurBas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(3,3);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON NETTOYEUR GAUCHE ****************
         ###########################################################################*/
        btnNettoyeurGauche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(1,7);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        /*##########################################################################
                             **********  BOUTTON NETTOYEUR DROIT *******************
        ###########################################################################*/
        btnNettoyeurDroit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caseSalle(7,2);
                for (int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        tableau.add(box[i][j]);
                    }
                }
            }
        });
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
    private void createUIComponents() {
        containerWest = new JPanel();
        containerEast = new JPanel();
        containerNorth = new JPanel();
       /* btnPollueurToutDroit = new JButton();
        btnPollueurSauteur = new JButton();
        btnPollueurLibre = new JButton();
        btnNettoyeurSmart = new JButton();
        btnNettoyeurLibre = new JButton();
        btnNettoyeurStandard = new JButton();
        /*btnPollueurGauche = new JButton();
        btnPollueurDroit = new JButton();
        btnPollueurHaut = new JButton();
        btnpollueurBas = new JButton();
        btnNettoyeurGauche = new JButton();
        btnNettoyeurDroit = new JButton();
        btnNettoyeurHaut = new JButton();
        btnNettoyeurBas = new JButton();*/

    }
    public void apparenceDesComposant(){
        containerWest.setPreferredSize(new Dimension(180,100));
        containerEast.setPreferredSize(new Dimension(180,100));
        containerNorth.setPreferredSize(new Dimension(100,100));
        containerWest.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.BLACK));
        containerEast.setBorder(BorderFactory.createMatteBorder(1,1,5,5,Color.BLACK));
        containerNorth.setBorder(BorderFactory.createMatteBorder(5,5,1,5,Color.BLACK));
        btnPollueurToutDroit.setPreferredSize(new Dimension(40, 60));
        btnPollueurSauteur.setPreferredSize(new Dimension(40, 60));
        btnPollueurLibre.setPreferredSize(new Dimension(40, 60));
        btnNettoyeurSmart.setPreferredSize(new Dimension(40, 60));
        btnNettoyeurStandard.setPreferredSize(new Dimension(40, 60));
        btnNettoyeurLibre.setPreferredSize(new Dimension(40, 60));
        btnPollueurGauche.setPreferredSize(new Dimension(20, 10));
        btnPollueurDroit.setPreferredSize(new Dimension(20, 10));
        btnPollueurHaut.setPreferredSize(new Dimension(20, 10));
        btnpollueurBas.setPreferredSize(new Dimension(20, 10));
        btnNettoyeurGauche.setPreferredSize(new Dimension(20, 10));
        btnNettoyeurDroit.setPreferredSize(new Dimension(20, 10));
        btnNettoyeurHaut.setPreferredSize(new Dimension(20, 10));
        btnNettoyeurBas.setPreferredSize(new Dimension(20, 10));
        caseNettoyer.setPreferredSize(new Dimension(40, 40));
        caseNettoyer.setBackground(Color.CYAN);
        papierGras.setPreferredSize(new Dimension(40, 40));
        papierGras.setBackground(Color.BLACK);

    }

    //case propre
    public void casePropre(int i, int j){
        try{
            messageError.setText("");
            monde.cleanBox(i,j);
            if (!monde.Mat[i][j]){
                box[i][j].setBackground(Color.cyan);
                box[i][j].setOpaque(true);
                box[i][j].setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.BLACK));
            }
        }catch(RobotException e){
            messageError.setText("Erreur. (i ou j) > (NBL ou NBC)");
            messageError.setForeground(Color.red);
        }
        nombePapierGras.setText(String.valueOf(monde.countBoxPollute()));
    }
    // case salle
    public void caseSalle(int i,int j){
        try{
            messageError.setText("");
            monde.polluteBox(i,j);
            if (monde.Mat[i][j]){
                box[i][j].setBackground(Color.BLACK);
                box[i][j].setOpaque(true);
                box[i][j].setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.BLACK));
            }

        }catch(RobotException e){
            messageError.setText("Erreur. (i ou j) > (NBL ou NBC)");
            messageError.setForeground(Color.red);
        }
        nombePapierGras.setText(String.valueOf(monde.countBoxPollute()));
    }
    // Initialiser notre monde
    public void initMonde(int ligne, int colonne){
        monde = new Monde(ligne,colonne);
        for (int i = 0; i < ligne; i++){
            for(int j = 0; j < colonne; j++){
                if (false == monde.Mat[i][j]){
                    box[i][j] = new JLabel("");
                    casePropre(i,j);
                }
            }
        }
        tableau.setLayout(new GridLayout(ligne,colonne));
        for (int i = 0; i < ligne; i++){
            for(int j = 0; j < colonne; j++){
                tableau.add(box[i][j]);
            }
        }
    }
    // nombres papier gras


}
