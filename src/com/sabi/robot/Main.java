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
        Mafenetre.setVisible(true);
        Monde monde = new Monde(5,5);
        monde.affiche();
        try{
            monde.polluteBox(6,2);
        } catch (RobotException e) {
            System.out.println(e);
        }


    }
//box[i][j] = new JLabel("["+Integer.toString(i)+"]["+Integer.toString(j)+"]");
}
