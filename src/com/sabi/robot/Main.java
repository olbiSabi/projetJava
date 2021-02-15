package com.sabi.robot;
import com.sabi.robot.pollueur.RobotPollueurLibre;
import com.sabi.robot.pollueur.RobotPollueurToutDroit;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        FenetreRobo Mafenetre = new FenetreRobo();

        /*Monde monde = new Monde(8,8);
        RobotPollueurLibre rbt = new RobotPollueurLibre(2,monde);
        rbt.randomMove(25);
        monde.affiche();
        try{
            Thread.sleep(1000); // sleep for 10 seconds
        }catch (InterruptedException a)
        {
            // ooops
        }
        System.out.println("**************************************");*/


        /*for(int i=0; i<10;i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000); // sleep for 10 seconds
                }catch (InterruptedException a)
                {
                    // ooops
                }
        }*/
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
}
