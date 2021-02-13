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

public class Main {

    public static void main(String[] args) {
        FenetreRobo Mafenetre = new FenetreRobo();
        //Mafenetre.pack();
        Mafenetre.setVisible(true);
        /*Monde monde = new Monde(5,5);
        RobotPollueurToutDroit robo1 = new RobotPollueurToutDroit(1,1,monde);
        RobotPollueurLibre BL = new RobotPollueurLibre(5,monde);
        monde.affiche();
        try{
            monde.polluteBox(0,2);
        } catch (RobotException e) {
            System.out.println(e);
        }
        System.out.println("**************************************");
        BL.randomMove(4);
        monde.affiche();*/

    }
//box[i][j] = new JLabel("["+Integer.toString(i)+"]["+Integer.toString(j)+"]");
}
