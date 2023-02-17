/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas2;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
         Notas a = new Notas();
         a.agregarNota();
         System.out.println("Las notas suspendidas fueron: "+a.calcularSuspenso());
         System.out.println("Las notas Buenas fueron: "+a.calcularBien());
         System.out.println("Las notas Notables fueron: "+a.calcularNotable());
         System.out.println("Las notas Sobresalientes fueron: "+a.calcularSobresaliente());
    }
    
    
}
