/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3T;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Elecciones e = new Elecciones();
        System.out.println("Total votos: "+ e.totalVotos());
        e.imprimir(e.totalPorcentaje());
        double [] ordenado = e.ordenarArreglo(e.totalPorcentaje());
        System.out.println("Arreglo ordenado");
        e.imprimir(ordenado);
        System.out.println("El candidato que recibio más votos fue: "+e.mayorVotos());
        System.out.println("Hay ganador "+e.mostrarGanadores(ordenado));
        e.resultadoFinal(ordenado);
    }
}
