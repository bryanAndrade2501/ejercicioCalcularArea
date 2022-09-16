package com.company;

public class Punto {
    private double x;
    private double y;
    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }
    /*
    public void resta(Punto punto1, Punto punto2){
        double puntoResultado;
        puntoResultado = punto1.getX()- punto2.getX();
    }*/

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

