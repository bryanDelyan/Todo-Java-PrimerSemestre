/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto17;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        CalcularCalorias c = new CalcularCalorias();
        c.agregarCalorias();
        System.out.println("El promedio de las calorias es : "+c.promedioCalorias()); 
        System.out.println("El menor de las calorias fue : " +c.menorCaloria()); 
         System.out.println("El mayor de las calorias fue : " +c.mayorCaloria()); 
        
    }
}
