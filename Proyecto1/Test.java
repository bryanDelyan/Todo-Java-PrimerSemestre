/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

/**
 *
 * @author Usuario
 */
public class Test {
    
    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        Calcular calcular1 = new Calcular();
        System.out.println("Esto debe pagar la persona 1: "+calcular.pagoPersona(10));
        //calcular1.persona = 12;
        System.out.println("Esto debe pagar la persona 2: "+calcular1.pagoPersona(12));
    }
}
