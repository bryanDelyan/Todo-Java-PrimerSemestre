/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Tests {
    public static void main(String[] args) {
        Empleado e = new Empleado ();
        e.pedirDatos();
       System.out.println("La suma total es: "+ e.calcularSuma());
        System.out.println("La persona con mayor sueldo es " + e.mayorSueldo());
    }
}
