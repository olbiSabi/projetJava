package com.sabi.robot.pollueur;

import com.sabi.exception.ErrorParcourir;
import com.sabi.exception.RobotException;
import com.sabi.robot.Monde;
import com.sabi.robot.Robot;

public class RobotPollueurLibre extends Robot {
    public int numberOfBoxToPollute;
    public RobotPollueurLibre(int x, int y, Monde m) {
        super(x, y);
        this.m = m;
    }

    public RobotPollueurLibre(int multiple, Monde m) {
        super(multiple);
        this.m = m;
    }

    public void randomMove(int numberOfBoxToPollute) {

        while(m.countBoxPollute() < numberOfBoxToPollute){
           posx = (int) ((Math.random() * (m.numberOfLine-1)));
           posy = (int) ((Math.random() * (m.numberOfColumn-1)));
           try {
               parcourir(posx,posy);
           }catch (ErrorParcourir e){
               System.out.println("position x ou y est superieur à la taille de la matrice");
           }
        }
    }
    @Override
    public void deplace(int i, int j) throws RobotException {
        if (i > m.numberOfLine-1 || j > m.numberOfColumn-1){
            throw new RobotException();
        }
        else{
            m.Mat[i][j] = true;
        }
    }

    @Override
    public void parcourir(int posx,int posy) throws ErrorParcourir {
        if (posx > m.numberOfLine-1 || posy > m.numberOfColumn-1){
            throw new ErrorParcourir();
        }
        else{
            for (int i = 0; i< m.numberOfLine; i++){
                for(int j =0; j< m.numberOfColumn; j++){
                    if(!m.Mat[posx][posy]){
                        m.Mat[posx][posy] = true;
                    }
                }
            }
        }
    }
}
