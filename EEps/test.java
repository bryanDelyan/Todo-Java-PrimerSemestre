/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EEps;

/**
 *
 * @author Usuario
 */
public class test {
    public static void main(String[] args) {
        Eps e = new Eps();
        e.llenar();
        e.imprimir();
        e.mostrarInformacion("1232");
        System.out.println("La cantidad de mujeres que pertenecen a un mismo estrato es: "+e.estratoMujeres(1));
    }
    
    
}
