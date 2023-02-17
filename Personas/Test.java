/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
      Persona p = new Persona();
      p.agregarEdades();
        System.out.println("Personas menores a 18 años : "+p.personasMenores());
        System.out.println("Personas mayores a 60 años : "+p.personasMayores());
        System.out.println("Promedio de edad : "+p.promedio());
        System.out.println("Personas debajo del promedio : "+p.menoresAlPromedio());
    }
    
}
