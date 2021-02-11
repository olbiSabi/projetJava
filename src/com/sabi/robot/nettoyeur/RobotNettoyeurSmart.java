package com.sabi.robot.nettoyeur;

import com.sabi.robot.Monde;

public class RobotNettoyeurSmart extends RobotNettoyeur {
    public RobotNettoyeurSmart(int x, int y, Monde m) {
        super(x, y, m);
    }

    public RobotNettoyeurSmart(int multiple, Monde m) {
        super(multiple, m);
    }
    
    public void cleanSmart(){
        for (int i = 0; i < m.numberOfLine; i++){
            for (int j = 0; j < m.numberOfColumn; j++){
                if (m.Mat[i][j] == true)
                    m.Mat[i][j] = false;
            }
        }
    }
}
