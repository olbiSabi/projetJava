package com.sabi.robot.nettoyeur;

import com.sabi.robot.Monde;

public class RobotNettoyeurStandard extends RobotNettoyeur{
    public RobotNettoyeurStandard(int x, int y, Monde m) {
        super(x, y, m);
    }

    public RobotNettoyeurStandard(int multiple, Monde m) {
        super(multiple, m);
    }

    //move South
    public void moveSouth(){
        m.Mat[posx][posy] = false;
        if(posx+1 < m.numberOfLine){
            m.Mat[posx][posy] = false;
            m.Mat[1+posx++][posy] = false;
        }
    }
    //move North
    public void moveNorth(){
        m.Mat[posx][posy] = false;
        if(posx-1 > -1){
            m.Mat[(posx--)-1][posy] = false;
        }
    }
    //move right
    public void moveRight(){
        m.Mat[posx][posy] = false;
        if(posy+1 < m.numberOfColumn){
            m.Mat[posx][1+posy++] = false;
        }
    }
    //move left
    public void moveLeft(){
        m.Mat[posx][posy] = false;
        if(posy-1 > -1){
            m.Mat[posx][(posy--)-1] = false;
        }
    }

}
