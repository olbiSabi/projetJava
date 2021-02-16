package com.sabi.robot;

import com.sabi.exception.RobotException;

public class Monde {
    public int numberOfLine;
    public int numberOfColumn;
    public boolean[][] Mat;

    public Monde() {}
    public Monde(int numberOfLine, int numberOfColumn){
        this.numberOfLine = numberOfLine;
        this.numberOfColumn = numberOfColumn;
        Mat = new boolean[numberOfLine][numberOfColumn];
        for (int i = 0; i < numberOfLine; i++){
            for (int j = 0; j < numberOfColumn; j++){
                Mat[i][j] = false;
            }
        }
    }
    //Function who pollute the box
    public void polluteBox(int i, int j) throws RobotException {
        if (i > numberOfLine-1 || j > numberOfColumn-1){
            throw new RobotException();
        }
        else
            Mat[i][j] = true;
    }

    public void verification(int i, int j) throws RobotException {
        if (i > numberOfLine-1 || j > numberOfColumn-1){
            throw new RobotException();
        }
    }
    //Function who clean the box
    public void cleanBox(int i, int j) throws RobotException {
        if (i > numberOfLine-1 || j > numberOfColumn-1){
            throw new RobotException();
        }
        else
            Mat[i][j] = false;
    }
    //Function that checks if the box is polluting or not
    public boolean checkbox(int i, int j) throws RobotException{
        if (i > numberOfLine-1 || j > numberOfColumn-1){
            throw new RobotException();
        }
        else{
            return Mat[i][j];
        }
    }
    //Function which counts the number of pollute boxes
    public int countBoxPollute(){
        int count = 0;
        for (int i = 0; i < numberOfLine; i++){
            for (int j = 0; j < numberOfColumn; j++){
                if (Mat[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    //Function that displays the material
    public void affiche(){
        for (int i = 0; i < numberOfLine; i++){
            for (int j = 0; j < numberOfColumn; j++){
                System.out.print(" | "+Mat[i][j]);
            }
            System.out.println("|\n");
        }
    }

    public int getNumberOfLine() {
        return numberOfLine;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public void setNumberOfLine(int numberOfLine) {
        this.numberOfLine = numberOfLine;
    }

    public void setNumberOfColumn(int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
    }
}
