package com.sabi.exception;

public class ErrorParcourir extends Exception{
    public ErrorParcourir(){
        super("Error Parcour");
    }

    public ErrorParcourir(String message){
        super(message);
    }
}
