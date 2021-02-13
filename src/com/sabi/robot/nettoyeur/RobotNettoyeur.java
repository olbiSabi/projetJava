package com.sabi.robot.nettoyeur;

import com.sabi.exception.ErrorParcourir;
import com.sabi.exception.RobotException;
import com.sabi.robot.Monde;
import com.sabi.robot.Robot;

public class RobotNettoyeur extends Robot {
    public RobotNettoyeur(int x, int y, Monde m) {
        super(x, y);
        this.m = m;
    }
    public RobotNettoyeur(int multiple, Monde m) {
        super(multiple);
        this.m = m;
    }

    @Override
    public void deplace(int i, int j) throws RobotException{
        if (i > m.numberOfLine-1 || j > m.numberOfColumn-1){
            throw new RobotException();
        }
        else{
            m.Mat[i][j] = false;
        }
    }

    @Override
    public void parcourir(int posx, int posy) throws ErrorParcourir {
        if (posx > m.numberOfLine-1 || posy > m.numberOfColumn-1){
            throw new ErrorParcourir();
        }
        else{
            for (int i = 0; i< m.numberOfLine; i++){
                for(int j =0; j< m.numberOfColumn; j++){
                    if(m.Mat[posx][posy]){
                        m.Mat[posx][posy] = false;
                    }
                }
            }
        }
    }

}
