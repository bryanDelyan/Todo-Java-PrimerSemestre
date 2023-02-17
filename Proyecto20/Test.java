/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {
        Tienda t = new Tienda();
        t.llenarArreglo();
        System.out.println("Trabajadores el día lunes     : " + t.cantidadTrabajadores(0));
        System.out.println("Trabajadores el día martes    : " + t.cantidadTrabajadores(1));
        System.out.println("Trabajadores el día miercoles : " + t.cantidadTrabajadores(2));
        System.out.println("Trabajadores el día jueves    : " + t.cantidadTrabajadores(3));
        System.out.println("Trabajadores el día viernes   : " + t.cantidadTrabajadores(4));
        System.out.println("Trabajadores el día sabado    : " + t.cantidadTrabajadores(5));
        System.out.println("Trabajadores el día domingo   : " + t.cantidadTrabajadores(6));
        System.out.println("H: "+t.sumaDepartamento(0)); 
           }
}
