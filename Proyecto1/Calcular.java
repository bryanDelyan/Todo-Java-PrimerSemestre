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
public class Calcular {
    // propiedades
    public double impuesto = 0.05;
    public double propina = 0.15;
    //public double persona = 10;
    
    //metodos
    
    public double pagoPersona(double persona){
    
    double total = persona * (1+impuesto+ propina);
    return total;
}
      
}

