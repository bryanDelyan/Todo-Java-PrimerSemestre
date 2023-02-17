/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto15;

/**
 *
 * @author Usuario
 */
public class Alumno {

    private String nombre;
    private boolean tieneBeca;
    private int edad;
    private double promedio;
    
   /* public void inicializar(String nombreN, String telefonoN,boolean beca,int edadN,double prom){
    nombre = nombreN;
    telefono = telefonoN;
    tieneBeca = beca;
    edad = edadN;
    promedio = prom;
    }*/
    //Constructor propio
    public Alumno(String nombreN, String telefonoN,boolean beca,int edadN,double prom){
    nombre = nombreN;
    tieneBeca = beca;
    edad = edadN;
    promedio = prom;
    }
    
   public double verPromedio(){
   return promedio;
   }
   public String verNombre(){
   return nombre;
   }
   public boolean verTieneBeca(){
   return tieneBeca;
   }
   public int verEdad(){
   return edad;
   }
   public int tamanoNombre(){
   return nombre.length();
   }
}

