package com.sabi.robot.pollueur;

import com.sabi.exception.ErrorParcourir;
import com.sabi.exception.RobotException;
import com.sabi.robot.Monde;
import com.sabi.robot.Robot;

public class RobotPollueurToutDroit extends Robot {
    public Monde m;
    public RobotPollueurToutDroit(int x, int y,Monde m) {
        super(x, y);
        this.m = m;
    }

    public RobotPollueurToutDroit(int multiple, Monde m) {
        super(multiple);
        this.m = m;
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
    public void parcourir(int posx, int posy) throws ErrorParcourir {

    }

    public void moveStandard() {
        for(int i = 0; i < m.numberOfColumn; i++){
            m.Mat[i][posy] = true;
        }
        //monde.affiche();
    }

}
