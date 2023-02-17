/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto19;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Matriz m = new Matriz();
       // m.llenarScanner();
        m.llenarScanner();
        m.imprimir();
        System.out.println("El promeido es : "+m.promedio());
        System.out.println("La suma de la fila 0 es : "+m.sumaFila(0));
        System.out.println("La suma de la fila 1 es : "+m.sumaFila(1));
        System.out.println("La suma de la fila 2 es : "+m.sumaFila(2));
        
    }
}
