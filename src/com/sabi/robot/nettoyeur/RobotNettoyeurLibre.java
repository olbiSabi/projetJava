package com.sabi.robot.nettoyeur;

import com.sabi.robot.Monde;

public class RobotNettoyeurLibre extends RobotNettoyeur{
    public RobotNettoyeurLibre(int x, int y, Monde m) {
        super(x, y, m);
    }

    public RobotNettoyeurLibre(int multiple, Monde m) {
        super(multiple, m);
    }

    public void freeClean(){
        for(int i = 0; i < m.numberOfLine; i++){
            for (int j = 0; j < m.numberOfColumn; j++){
                while(m.Mat[i][j] != false){
                    if(m.Mat[i][j] == true)
                        m.Mat[i][j] = false;
                }
            }
        }
    }
}
