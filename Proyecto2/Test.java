/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        //persona1.estatura = 1.80;
        //persona1.peso = 64;
        System.out.println("persona 1 = " + persona1.calcularIMC(1.80, 64));

        //objeto2
        Persona persona2 = new Persona();
        //persona2.estatura = 1.70;
        //persona2.peso = 75;
        System.out.println("persona 2 = " + persona2.calcularIMC(1.70, 75));

    }
}
