/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacionmomento2;

/**
 *
 * @author Bello
 */
public abstract class FiguraGeometrica {
        String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    
}
