/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto14;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Notas n = new Notas();
        n.agregarNotas();
        n.mostrarNotas();
        System.out.println("Promedio: "+n.promedio());
        System.out.println("Calidad de promedio: "+n.calidadPromedio());
        System.out.println("La menor nota es : "+n.menorNota());
        System.out.println("La mayor nota es : "+n.mayorNota());
        System.out.println("La cantidad de notas menores al promedio son: "+n.cantidadMenoresPromedio());
}
}