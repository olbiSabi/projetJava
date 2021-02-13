package com.sabi.robot.nettoyeur;

import com.sabi.robot.Monde;

public class RobotNettoyeurStandard extends RobotNettoyeur{
    public RobotNettoyeurStandard(int x, int y, Monde m) {
        super(x, y, m);
    }

    public RobotNettoyeurStandard(int multiple, Monde m) {
        super(multiple, m);
    }

}
