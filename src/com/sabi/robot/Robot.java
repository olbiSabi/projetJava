package com.sabi.robot;

import com.sabi.exception.ErrorParcourir;
import com.sabi.exception.RobotException;
import com.sabi.robot.Monde;

public abstract class Robot {
    public int posx;
    public int posy;
    public Monde m;
    public Robot(int x, int y){
        posx = x;
        posy = y;
    }
    public Robot(int multiple){
        posx = (int) (Math.random() * multiple);
        posy = (int) (Math.random() * multiple);
    }
    public abstract void deplace(int i, int j) throws RobotException;
    public abstract void parcourir() throws ErrorParcourir;
}
