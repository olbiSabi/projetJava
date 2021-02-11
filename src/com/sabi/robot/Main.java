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
    }

}
