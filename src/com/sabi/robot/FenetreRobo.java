package com.sabi.robot;

import com.sabi.exception.RobotException;
import com.sabi.robot.nettoyeur.RobotNettoyeurLibre;
import com.sabi.robot.nettoyeur.RobotNettoyeurSmart;
import com.sabi.robot.nettoyeur.RobotNettoyeurStandard;
import com.sabi.robot.pollueur.RobotPollueurLibre;
import com.sabi.robot.pollueur.RobotPollueurSauteurs;
import com.sabi.robot.pollueur.RobotPollueurToutDroit;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FenetreRobo extends JFrame implements ActionListener {
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
    private JButton robot;
    public JLabel box[][];
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
        setTitle("Robot Monde De ONIANKITAN Sabi");
        setSize(1000,670);
        createUIComponents();
        apparenceDesComposant();

        /*******************  BOUTTON VALIDER *****************/
        btnValider.addActionListener(this);
        /******************* BOUTTON RENITIALISER *****************/
        btnRenitialiser.addActionListener(this);
        /*******************  BOUTTON QUITTER *****************/
        btnQuitter.addActionListener(e -> System.exit(0));
        /**********  BOUTTON POLLUEUR TOUT DROIT *************/
        btnPollueurToutDroit.addActionListener(this);
        /***********  BOUTTON POLLUEUR SAUTEUR **************/
        btnPollueurSauteur.addActionListener(this);
        /***********  BOUTTON POLLUEUR LIBRE ******************/
        btnPollueurLibre.addActionListener(this);
        /***********  BOUTTON NETTOYEUR SMART *****************/
        btnNettoyeurSmart.addActionListener(this);
        /***********  BOUTTON NETTOYEUR STANDARD **************/
        btnNettoyeurStandard.addActionListener(this);
        /*************** BOUTTON NETTOYEUR LIBRE **************/
        btnNettoyeurLibre.addActionListener(this);
        /***********  BOUTTON POLLUEUR HAUT *******************/
        btnPollueurHaut.addActionListener(this);
        /**************  BOUTTON POLLUEUR BAS *****************/
        btnpollueurBas.addActionListener(this);
        /***********  BOUTTON POLLUEUR GAUCHE *****************/
        btnPollueurGauche.addActionListener(this);
        /*************  BOUTTON POLLUEUR DROIT ****************/
        btnPollueurDroit.addActionListener(this);
        /**************** BOUTTON NETTOYEUR HAUT **************/
        btnNettoyeurHaut.addActionListener(this);
        /***********  BOUTTON NETTOYEUR BAS *******************/
        btnNettoyeurBas.addActionListener(this);
        /***********  BOUTTON NETTOYEUR GAUCHE *****************/
        btnNettoyeurGauche.addActionListener(this);
        /***********  BOUTTON NETTOYEUR DROIT ******************/
        btnNettoyeurDroit.addActionListener(this);
        setDefaultCloseOperation(FenetreRobo.EXIT_ON_CLOSE);
        setVisible(true);

    }


    private void createUIComponents() {
        containerWest = new JPanel();
        containerEast = new JPanel();
        containerNorth = new JPanel();

    }
    public void apparenceDesComposant(){
        containerWest.setPreferredSize(new Dimension(160,100));
        containerEast.setPreferredSize(new Dimension(160,100));
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
        robot.setPreferredSize(new Dimension(40, 40));
        robot.setBackground(Color.red);

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
                //box[PX][PY] = new JLabel("");
                //couleurRobot();
            }
        }
        tableau.setLayout(new GridLayout(ligne,colonne));
        for (int i = 0; i < ligne; i++){
            for(int j = 0; j < colonne; j++){
                tableau.add(box[i][j]);
            }
        }
    }
    /***********  POLLUEUR SAUTEUR ***********/
    public void sauteurAlleatoir(){
        robotPS = new RobotPollueurSauteurs(PX,PY,monde);
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
//########################################## POLLUEUR ############################################
    //move South
    public void moveSouth(){
        monde.Mat[PX][PY] = true;
        if (PX < NBL-1){
            PX = PX+1;
            monde.Mat[PX][PY] = true;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move North
    public void moveNorth(){
        monde.Mat[PX][PY] = true;
        if (PX > 0){
            PX = PX-1;
            monde.Mat[PX][PY] = true;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move right
    public void moveRight(){
        monde.Mat[PX][PY] = true;
        if (PY < NBC-1){
            PY = PY+1;
            monde.Mat[PX][PY] = true;

        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move left
    public void moveLeft(){
        monde.Mat[PX][PY] = true;
        if (PY > 0){
            PY = PY-1;
            monde.Mat[PX][PY] = true;

        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //########################################## NETTOYEUR ############################################
    //move South
    public void moveSud(){
        monde.Mat[PX][PY] = false;
        if (PX < NBL-1){
            PX = PX+1;
            monde.Mat[PX][PY] = false;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move North
    public void moveNord(){
        monde.Mat[PX][PY] = false;
        if (PX > 0){
            PX = PX-1;
            monde.Mat[PX][PY] = false;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move right
    public void moveDroit(){
        monde.Mat[PX][PY] = false;
        if (PY < NBC-1){
            PY = PY+1;
            monde.Mat[PX][PY] = false;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //move left
    public void moveGauche(){
        monde.Mat[PX][PY] = false;
        if (PY > 0){
            PY = PY-1;
            monde.Mat[PX][PY] = false;
        }
        else{
            messageError.setText(" vous êtes à la limite du monde");
            messageError.setForeground(Color.red);
        }
    }
    //#############################  deplacement robot ############################
    public void couleurRobot(){
        box[PX][PY].setBackground(Color.red);
        box[PX][PY].setOpaque(true);
        box[PX][PY].setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.WHITE));
    }
    public void robotBas(){
        if (PX < NBL){
            couleurRobot();
        }
    }
    public void robotHaut(){
        if (PX >=0){
            couleurRobot();
        }
    }
    public void robotDroit(){
        if (PY < NBC){
            couleurRobot();
        }
    }
    public void robotGauche(){
        if (PY >= 0){
            couleurRobot();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRenitialiser) {
            this.dispose();
            new FenetreRobo();
        }
        if (e.getSource() == btnValider) {
            NBL = Integer.parseInt(nombreDeLigne.getText());
            NBC = Integer.parseInt(nombreDeCollonne.getText());
            PX = Integer.parseInt(positionX.getText()) -1;
            PY = Integer.parseInt(positionY.getText()) -1;
            box = new JLabel[NBL][NBC];
            multiple = NBL ;
            nbrBoxApolluer = (NBL*NBC)/3;
            initMonde(NBL,NBC);
            couleurRobot();
            nombreDeLigne.setText("");
            nombreDeCollonne.setText("");
            btnValider.setEnabled(false);
        }
        if (e.getSource() == btnPollueurToutDroit){
            robotPTD = new RobotPollueurToutDroit(PX,PY,monde);
            robotPTD.moveStandard();
            for(int i = 0; i < monde.numberOfLine; i++){
                if (monde.Mat[i][PY]){
                    caseSalle(i,PY);
                }
            }
            //couleurRobot();
        }
        if (e.getSource() == btnPollueurSauteur){
            robotPS = new RobotPollueurSauteurs(PX,PY,monde);
            robotPS.moveStandardStep();
            for(int i = 0; i < monde.numberOfLine; i++){
                if (monde.Mat[i][PY]){
                    caseSalle(i,PY);
                }
            }
        }
        if (e.getSource() == btnPollueurLibre){
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
        if (e.getSource() == btnNettoyeurLibre){
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
        if (e.getSource() == btnNettoyeurSmart){
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
        //definition de nettoyeur standard à revoir
        if (e.getSource() == btnNettoyeurStandard){
            //robotNStandard.moveRandomStep();
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (!monde.Mat[i][j]){
                        casePropre(i,j);
                    }
                }
            }
        }
        if (e.getSource() == btnPollueurHaut){
            moveNorth();
            //System.out.println(PX);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                    robotHaut();
                }
            }
        }
        if (e.getSource() == btnpollueurBas){
            moveSouth();
            //System.out.println(PX);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                    robotBas();
                }
            }
        }
        if (e.getSource() == btnPollueurDroit){
            moveRight();
            //System.out.println(PY);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                    robotDroit();
                }
            }
        }
        if (e.getSource() == btnPollueurGauche){
            moveLeft();
            //System.out.println(PY);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (monde.Mat[i][j]){
                        caseSalle(i,j);
                    }
                    robotGauche();
                }
            }
        }
        if (e.getSource() == btnNettoyeurHaut){
            moveNord();
            //System.out.println(PX);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (!monde.Mat[i][j]){
                        casePropre(i,j);
                    }
                    robotHaut();
                }
            }
        }
        if (e.getSource() == btnNettoyeurBas){
            moveSud();
            //System.out.println(PX);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (!monde.Mat[i][j]){
                        casePropre(i,j);
                    }
                    robotBas();
                }
            }
        }
        if (e.getSource() == btnNettoyeurDroit){
            moveDroit();
            //System.out.println(PY);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (!monde.Mat[i][j]){
                        casePropre(i,j);
                    }
                    robotDroit();
                }
            }
        }
        if (e.getSource() == btnNettoyeurGauche){
            moveGauche();
            //System.out.println(PY);
            for(int i = 0; i < monde.numberOfLine; i++){
                for (int j = 0; j < monde.numberOfColumn; j++){
                    if (!monde.Mat[i][j]){
                        casePropre(i,j);
                    }
                    robotGauche();
                }
            }
        }

    }

}
