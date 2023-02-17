/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto15;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args){
    Alumno a = new Alumno("Juan", "23020", true, 20, 4.5);
   // a.inicializar("Juan", "23020", true, 20, 4.5);
    System.out.println("Nombre: "+a.verNombre());
    System.out.println("Edad: "+a.verEdad());
    System.out.println("Promedio = "+a.verPromedio());     
    System.out.println("Tiene beca: "+a.verTieneBeca());
    System.out.println("Tamaño del nombre =  " + a.tamanoNombre());
    }  
}
