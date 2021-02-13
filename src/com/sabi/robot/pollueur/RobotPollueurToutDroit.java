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

    //move South
    public void moveSouth(){
        m.Mat[posx][posy] = true;
        if(posx+1 < m.numberOfLine){
            m.Mat[1+posx++][posy] = true;
        }
    }
    //move North
    public void moveNorth(){
        m.Mat[posx][posy] = true;
        if(posx-1 > -1){
            m.Mat[(posx--)-1][posy] = true;
        }
    }
    //move right
    public void moveRight(){
        m.Mat[posx][posy] = true;
        if(posy+1 < m.numberOfColumn){
            m.Mat[posx][1+posy++] = true;
        }
    }
    //move left
    public void moveLeft(){
        m.Mat[posx][posy] = true;
        if(posy-1 > -1){
            m.Mat[posx][(posy--)-1] = true;
        }
    }
}
