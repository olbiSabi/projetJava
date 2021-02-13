package com.sabi.robot;

import com.sabi.exception.RobotException;
import com.sabi.robot.nettoyeur.RobotNettoyeurLibre;
import com.sabi.robot.nettoyeur.RobotNettoyeurSmart;
import com.sabi.robot.nettoyeur.RobotNettoyeurStandard;
import com.sabi.robot.pollueur.RobotPollueurLibre;
import com.sabi.robot.pollueur.RobotPollueurSauteurs;
import com.sabi.robot.pollueur.RobotPollueurToutDroit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    public int PX;
    public int PY;
    private int multiple;
    private int nbrBoxApolluer;
    public Monde monde;
    public RobotPollueurToutDroit robotPTD;
    public RobotPollueurToutDroit robotDirection;
    public RobotPollueurSauteurs robotPS;
    public RobotPollueurSauteurs robotPSA;
    public RobotPollueurLibre robotPL;
    public RobotNettoyeurLibre robotNL;
    public RobotNettoyeurSmart robotNSmart;
    public RobotNettoyeurStandard robotNStandard;

    public FenetreRobo(){
        add(Principal);
        setTitle("Robot");
        setSize(900,600);
        createUIComponents();
        apparenceDesComposant();

        /*******************  BOUTTON VALIDER *****************/
        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NBL = Integer.parseInt(nombreDeLigne.getText());
                NBC = Integer.parseInt(nombreDeCollonne.getText());
                PX = Integer.parseInt(positionX.getText()) -1;
                PY = Integer.parseInt(positionY.getText()) -1;
                box = new JLabel[NBL][NBC];
                multiple = NBL ;
                nbrBoxApolluer = (NBL*NBC)/3;
                initMonde(NBL,NBC);
                nombreDeLigne.setText("");
                nombreDeCollonne.setText("");
                btnValider.setEnabled(false);
            }
        });
        /******************* BOUTTON RENITIALISER *****************/
        btnRenitialiser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetreRobo fenetre = new FenetreRobo();
                fenetre.setVisible(true);
                btnValider.setEnabled(true);
            }
        });
        /*******************  BOUTTON QUITTER *****************/
        btnQuitter.addActionListener(e -> System.exit(0));
        /**********  BOUTTON POLLUEUR TOUT DROIT *************/
        btnPollueurToutDroit.addActionListener(e -> toutDroit(PX,PY));
        /***********  BOUTTON POLLUEUR SAUTEUR **************/
        btnPollueurSauteur.addActionListener(e -> sauteur(PX,PY));
        /***********  BOUTTON POLLUEUR LIBRE ******************/
        btnPollueurLibre.addActionListener(e -> pollueurLibre());
        /***********  BOUTTON NETTOYEUR SMART *****************/
        btnNettoyeurSmart.addActionListener(e -> nettoyeurSmart());
        /***********  BOUTTON NETTOYEUR STANDARD **************/
        btnNettoyeurStandard.addActionListener(e -> nettoyeurSmart());
        /*************** BOUTTON NETTOYEUR LIBRE **************/
        btnNettoyeurLibre.addActionListener(e -> nettoyeurLibre());
        /***********  BOUTTON POLLUEUR HAUT *******************/
        btnPollueurHaut.addActionListener(e -> pollueurHaut(PX,PY));
        /**************  BOUTTON POLLUEUR BAS *****************/
        btnpollueurBas.addActionListener(e ->pollueurBas(PX,PY));
        /***********  BOUTTON POLLUEUR GAUCHE *****************/
        btnPollueurGauche.addActionListener(e -> pollueurGauche(PX,PY));
        /*************  BOUTTON POLLUEUR DROIT ****************/
        btnPollueurDroit.addActionListener(e -> pollueurDroit(PX,PY));
        /**************** BOUTTON NETTOYEUR HAUT **************/
        //btnNettoyeurHaut.addActionListener(e ->);
        /***********  BOUTTON NETTOYEUR BAS *******************/
        //btnNettoyeurBas.addActionListener(e ->);
        /***********  BOUTTON NETTOYEUR GAUCHE *****************/
        //btnNettoyeurGauche.addActionListener(e ->);
        /***********  BOUTTON NETTOYEUR DROIT ******************/
        //btnNettoyeurDroit.addActionListener(e ->);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }


    private void createUIComponents() {
        containerWest = new JPanel();
        containerEast = new JPanel();
        containerNorth = new JPanel();

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
                box[i][j].setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.WHITE));
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
                box[i][j].setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.WHITE));
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
                if (!monde.Mat[i][j]){
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
    /*##################################################################################################################
                                        **********  POLLUEUR TOUT DROIT *******************
    ###################################################################################################################*/
    public void toutDroit(int positionI, int positionJ){
        robotPTD = new RobotPollueurToutDroit(positionI,positionJ,monde);
        robotPTD.moveStandard();
        for(int i = 0; i < monde.numberOfLine; i++){
                if (monde.Mat[i][positionJ]){
                    caseSalle(i,positionJ);
            }
        }
    }
    /*##################################################################################################################
                                        **********  POLLUEUR SAUTEUR *******************
    ###################################################################################################################*/
    public void sauteur(int positionI, int positionJ){
        robotPS = new RobotPollueurSauteurs(positionI,positionJ,monde);
        robotPS.moveStandardStep();
        for(int i = 0; i < monde.numberOfLine; i++){
                if (monde.Mat[i][positionJ]){
                    caseSalle(i,positionJ);
            }
        }
    }
    public void sauteurAlleatoir(int positionI, int positionJ){
        robotPS = new RobotPollueurSauteurs(positionI,positionJ,monde);
        robotPS.moveRandomStep();
        //robotPSA = new RobotPollueurSauteurs(8,monde);
        //robotPSA.moveRandomStep();
        for(int i = 0; i < monde.numberOfLine; i++){
            for (int j = 0; j < monde.numberOfColumn; j++){
                if (monde.Mat[i][j]){
                    caseSalle(i,j);
                }
            }
        }
    }
    /*##################################################################################################################
                                    **********  POLLUEUR LIBRE *******************
    ###################################################################################################################*/
    public void pollueurLibre(){
        robotPL = new RobotPollueurLibre(multiple,monde);
        robotPL.randomMove(nbrBoxApolluer);
        for(int i = 0; i < monde.numberOfLine; i++){
            for (int j = 0; j < monde.numberOfColumn; j++){
                if (monde.Mat[i][j]){
                    caseSalle(i,j);
                }
            }
        }
    }

    /*##################################################################################################################
                                        **********  NETTOYEUR SMART *******************
    ###################################################################################################################*/
    public void nettoyeurSmart(){
        robotNSmart = new RobotNettoyeurSmart(multiple,monde);
        robotNSmart.cleanSmart();
        for(int i = 0; i < monde.numberOfLine; i++){
            for (int j = 0; j < monde.numberOfColumn; j++){
                if (!monde.Mat[i][j]){
                    casePropre(i,j);
                }
            }
        }
    }

    /*##################################################################################################################
                                        **********  NETTOYEUR STANDARD *******************
    ###################################################################################################################*/

    public void nettoyeurStandard(int positionI, int positionJ){
        robotNStandard = new RobotNettoyeurStandard(positionI,positionJ,monde);
        //robotNStandard.moveRandomStep();
        for(int i = 0; i < monde.numberOfLine; i++){
            for (int j = 0; j < monde.numberOfColumn; j++){
                if (!monde.Mat[i][j]){
                    casePropre(i,j);
                }
            }
        }
    }
    /*##################################################################################################################
                                        **********  NETTOYEUR LIBRE *******************
    ###################################################################################################################*/
    public void nettoyeurLibre(){
        robotNL = new RobotNettoyeurLibre(multiple,monde);
        robotNL.freeClean();
        for(int i = 0; i < monde.numberOfLine; i++){
            for (int j = 0; j < monde.numberOfColumn; j++){
                if (!monde.Mat[i][j]){
                    casePropre(i,j);
                }
            }
        }
    }

    /*##########################################################################
                     **********  BOTTONPOLLUEUR HAUT *******************
    ###########################################################################*/
        public void pollueurHaut(int positionI, int positionJ){
            robotDirection = new RobotPollueurToutDroit(positionI,positionJ,monde);
            robotDirection.moveNorth();
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                }
            }

        }
        /*##########################################################################
                             **********  BOUTTON POLLUEUR BAS ****************
         ###########################################################################*/
        public void pollueurBas(int positionI, int positionJ){
            robotDirection = new RobotPollueurToutDroit(positionI,positionJ,monde);
            robotDirection.moveSouth();
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                }
            }
        }
        /*##########################################################################
                             **********  BOUTTON POLLUEUR GAUCHE *******************
        ###########################################################################*/
        public void pollueurGauche(int positionI, int positionJ){
            robotDirection = new RobotPollueurToutDroit(positionI,positionJ,monde);
            robotDirection.moveLeft();
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                }
            }
        }
        /*##########################################################################
                             **********  BOUTTON POLLUEUR DROIT ***************
        ###########################################################################*/
        public void pollueurDroit(int positionI, int positionJ){
            robotDirection = new RobotPollueurToutDroit(positionI,positionJ,monde);
            robotDirection.moveRight();
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                }
            }
        }

        /*##########################################################################
                             **********  BOUTTON POLLUEUR DROIT ***************
        ###########################################################################
        btnPollueurDroit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pollueurDroit(PX,PY);
        }
    });*/

}
