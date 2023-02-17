/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

/**
 *
 * @author Usuario
 */
public class Nota {
   public String calcularNota(int calificacion){
   String notaFinal = null;
   if(calificacion >= 0 && calificacion <=3){
       notaFinal = "Insuficiente";
   }
   if(calificacion >= 3.1 && calificacion <=5){
        notaFinal = "Suficiente";
   }
   if(calificacion >= 5.1 && calificacion <= 8){
       notaFinal = "Bien";
   }
   if(calificacion >8){
         notaFinal = "Sobresaliente";
}
   return notaFinal;
}
}