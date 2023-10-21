/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacionmomento2;

/**
 *
 * @author Bello
 */
public class Circulo extends FiguraGeometrica  {
       double radio;
    final double pi = 3.14159;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi * radio * radio;
    }
}
