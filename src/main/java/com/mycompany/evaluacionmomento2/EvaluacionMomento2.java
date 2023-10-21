/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacionmomento2;

/**
 *
 * @author Bello
 */
public class EvaluacionMomento2 {

    public static void main(String[] args) {
        
        Cuadrado cuadrado = new Cuadrado("Rojo", 5);
        Circulo circulo = new Circulo("Azul", 3);

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
    }

