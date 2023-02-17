/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto7;

/**
 *
 * @author Usuario
 */
public class Semana {
    public String diaSemana(int dia){
    String nombreDia = null;    
    if(dia == 1){
        nombreDia = "Lunes";
        }
    else if(dia ==2){
            nombreDia ="Martes";
    }
    else if(dia ==3){
        nombreDia = "Miercoles";
    }
    else if (dia ==4){
        nombreDia= "Jueves";
    }
    else if (dia == 5){
        nombreDia = "Viernes";
    }
    else if (dia == 6){
         nombreDia ="Sabado";
    }
    else if(dia == 7){
        nombreDia = "Domingo";
    }
    else{
        nombreDia = "Dia no existe";
   }
return nombreDia;
    } 
    public String diaSemanaS(int dia){
    
    String nombreDia = null;    
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia ="Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia= "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia ="Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Dia no existe";
                break;
    }
        return nombreDia;
}
}