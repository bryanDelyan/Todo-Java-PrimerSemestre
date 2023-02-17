/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto18;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Personas p = new Personas();
        p.llenar();
        p.imprimir();
        System.out.println("Promedio de edad: "+p.promedioEdad());
        System.out.println("Menores al Promedio: "+p.menorPromedio());
        System.out.println("Personas mayores de edad : "+p.mayorEdad());
        System.out.println("Personas menores de edad : "+p.menorEdad());
        p.buscarPersona("Maria","Gimenez",24);
        p.imprimir();
        p.buscarPersonaA("Jose", "Mendez", "111111111");
        p.imprimir();
        
    }
}
