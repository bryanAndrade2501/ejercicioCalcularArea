package com.company;

public class Figura {
    protected Punto punto1,punto2;
    protected Punto[] puntos1;
    /*
    public Figura (Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
     */
    public Figura(Punto ... puntos){
        if(puntos.length==1){
            System.out.println("No se puede calcular el área");
        } else if(puntos.length==2){
            puntos = new Circulo();
        }
        this.puntos1= puntos;
    }
    public void calcularAreaCirculo(){
        calcularAreaCirculo();
    }
    public void calcularAreaPoligono(){
        calcularAreaPoligono();
    }
}
