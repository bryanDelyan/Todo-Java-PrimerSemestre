/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Elecciones e = new Elecciones ();
        e.pedirCandidatos();
        System.out.println("Los porcentajes de los candidatos son los siguiente : "+e.calcularPorcentaje() ); 
        System.out.println("El candidato más votado es : "+e.mayorVotos());
        e.candidatoGanador();
    }
}
