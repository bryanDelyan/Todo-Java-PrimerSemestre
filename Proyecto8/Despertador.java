/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto8;

/**
 *
 * @author Usuario
 */
public class Despertador {
    public void reloj(int h,int m,int s){
       int hora = h; 
       int minutos = m;
       int segundos = s;
    if ( h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59 ){
            if(h == hora && m == minutos && s == segundos )
        
               System.out.println ("Levantarse");
           }
    else{  
             System.out.println ("La alarma es incorrecta");
    }
    }
}

