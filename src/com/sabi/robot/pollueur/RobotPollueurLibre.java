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

    RobotPollueurLibre(int multiple, Monde m) {
        super(multiple);
        this.m = m;
    }

    public void randomMove(int numberOfBoxToPollute) {
        int compteur = 0;
        while(compteur <= numberOfBoxToPollute){
            m.Mat[(int) ((Math.random() * (m.numberOfLine-1)))][(int) ((Math.random() * (m.numberOfColumn-1)))] = true;
            if (m.Mat[posx][posy]==true)
                compteur = compteur-1;
            else
                compteur++;
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
    public void parcourir() throws ErrorParcourir {
        if(m.Mat[posx][posy] == true){
            throw new ErrorParcourir();
        }
    }
}
