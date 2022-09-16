package com.company;

public class Poligono extends Figura {
    private double x;
    private double y;
    private double calculoArea;
    public Poligono(Punto... puntos) {
        super(puntos);
    }

    public void calcularAreaPoligono() {
        //Calcula la diagonal principal
        for (int i = 0; i < (puntos1.length - 1); i++) {
            x += puntos1[i].getX() * puntos1[i + 1].getY();
        }
        x += puntos1[puntos1.length-1].getX()*puntos1[0].getY();
        //System.out.println(x); Imprime el valor de la diagonal principal
        //Calcula la diagonal secundaria
        for (int f = 0; f < (puntos1.length - 1); f++) {
            y += puntos1[f].getY() * puntos1[f + 1].getX();
        }
        y += puntos1[puntos1.length-1].getY()*puntos1[0].getX();
        //System.out.println(y); Imprime el valor de diagonal secundaria
        //Calcula el área del polígono
        calculoArea=Math.abs((x-y)/2);
        System.out.println("El área del polígono es: "+ calculoArea);
    }
    

}

