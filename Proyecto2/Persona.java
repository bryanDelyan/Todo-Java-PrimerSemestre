/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author Usuario
 */
public class Persona {
   // public double estatura;
    //public double peso;
    
    public String calcularIMC(double estatura, double peso){
        double imc = peso / (estatura*estatura); 
        String mensaje =""; // o = null;
        if (imc < 18.5){
           mensaje =  "Peso inferior a la normal";
          
        }
        else
        if(imc >= 18.5 && imc <=24.9){
            mensaje= "Peso normal";
        }
        else
        if(imc >= 25 && imc <= 29.9){
            mensaje = "Peso superior al normal";
        }
        else{
        mensaje = "Obesidad";
        }
         
        return mensaje;
    }
}
