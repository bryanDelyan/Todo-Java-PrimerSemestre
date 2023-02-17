/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {
            Temperatura t = new Temperatura();
            t.llenarArreglo();
            System.out.println("El promedio de las temperaturas es : "+t.promedio());
            System.out.println("El promedio de las estacion 2 es : "+t.promedioEstacion1()+"°C"+ " y de la estacion 4 es: "+t.promedioEstacion2()+"°C");
            t.sumarColumnas();
            System.out.println("L: "+t.temperatura());
            
            
    }
    
}
