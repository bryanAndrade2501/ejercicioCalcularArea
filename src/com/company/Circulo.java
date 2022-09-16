package com.company;

public class Circulo extends Figura {
    protected Punto punto;
    private double coordenadaX;
    private double coordenadaY;
    private double calculoArea;
    private double radio;
    public Circulo(Punto ... puntos) {
        super(Punto punto ... puntos);
    }
    @Override
    public void calcularAreaCirculo(){
        coordenadaX = punto1.getX()-punto2.getX();
        coordenadaY=punto1.getY()-punto2.getY();
        radio=(Math.sqrt((Math.pow(coordenadaX,2))+(Math.pow(coordenadaY,2))));
        calculoArea=(Math.PI)*(Math.pow(radio,2));
        System.out.println("El área del círculo es "+ calculoArea);
    }

}
