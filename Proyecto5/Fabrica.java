/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto5;

/**
 *
 * @author Usuario
 */
public class Fabrica {
         public double calcularFactura(int cantidadDeComputadoras){
             double precioPc = 1150000;
             double iva = (precioPc * 12)/100;
             double precioTotal = precioPc + iva;
             double precioNeto = 0;
             
             if(cantidadDeComputadoras ==1){
                precioNeto = precioTotal;
             }
             if(cantidadDeComputadoras >=2 && cantidadDeComputadoras <=5){
                 double descuento = (((cantidadDeComputadoras * precioTotal)*10)/100);
                 precioNeto = cantidadDeComputadoras * precioTotal - descuento;
             }
             if(cantidadDeComputadoras >=6 && cantidadDeComputadoras <10){
                 double descuento = (((cantidadDeComputadoras * precioTotal)*20)/100);
                  precioNeto = cantidadDeComputadoras * precioTotal - descuento;
             }
             if(cantidadDeComputadoras >=10){
                 double descuento = (((cantidadDeComputadoras * precioTotal)*40)/100);
                 precioNeto = cantidadDeComputadoras * precioTotal - descuento;
             }
             return precioNeto ;
         }
}