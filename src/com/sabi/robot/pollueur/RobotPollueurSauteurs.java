package com.sabi.robot.pollueur;

import com.sabi.exception.ErrorParcourir;
import com.sabi.exception.RobotException;
import com.sabi.robot.Monde;
import com.sabi.robot.Robot;

public class RobotPollueurSauteurs extends Robot {
    public RobotPollueurSauteurs(int x, int y, Monde m) {
        super(x, y);
        this.m = m;
    }

    public RobotPollueurSauteurs(int multiple, Monde m) {
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
    public void parcourir() throws ErrorParcourir {

    }

    public void moveStandardStep() {
        for(int i = 0; i < m.numberOfColumn; i+=2){
            m.Mat[i][posy] = true;
        }
    }
    public void moveRandomStep(){
        for(int j = 0; j < m.numberOfLine; j+=((int) (Math.random() * 10))/2){
            for(int i = 0; i < m.numberOfColumn; i+=2){
                m.Mat[i][j] = true;
            }
        }
    }

}
