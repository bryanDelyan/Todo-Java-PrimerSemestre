/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaMat;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tienda {
    int [] []asistencia = new int [8][7];
    public void llenar(){
        try (//Departamento 1
               /** asistencia[0][0] = 9;
                asistencia[0][1] = 10;
                asistencia[0][2] = 15;
                asistencia[0][3] = 2;
                asistencia[0][4] = 20;
                asistencia[0][5] = 6;
                asistencia[0][6] = 4;
                //Departamento 2
                asistencia[1][0] = 21;
                asistencia[1][1] = 1;
                asistencia[1][2] = 18;
                asistencia[1][3] = 4;
                asistencia[1][4] = 20;
                asistencia[1][5] = 12;
                asistencia[1][6] = 16;*/
        Scanner s = new Scanner(System.in)) {
            //Crear dos for para que uno recorra las columnas y las otra las filas
            for (int i = 0; i < asistencia.length; i++) { //Cantidad de filas
                for (int j = 0; j < asistencia[i].length; j++) {
                    System.out.println("Digite el número" + "[" + i + "," + j + "]");
                    asistencia[i][j] = s.nextInt(); // Llenar matriz
                }
            }
        }
    }
    
    public int trabajadoresDias(int dia){
        int suma = 0;
        for(int i = 0; i < asistencia.length;i++){
            suma +=asistencia[i][dia];
        }
        return suma;
    }
    //Calcular el departamento con mas trabajajadores en la semana
    public int []  trabajadoresDepartamentos(){
        int [] departamentos = new int [8];
        for (int i = 0; i < asistencia.length; i++) {
            int suma = 0;//La declaramos aquí para que cada vez que termine de sumar una fila vuelve a comenzar de 0 a la siguiente
            for (int j = 0; j < asistencia[i].length; j++) {
                suma += asistencia[i][j];
            }
            departamentos[i] = suma;    
        }
        return departamentos;
    }
   //Determinar el departamento en en que más asistieron
    public void mayorAsistencia(){
        int [] asistencias = trabajadoresDepartamentos();
        int mayor = asistencias[0];
        int departamento = 0;
        for (int i = 1; i < asistencia.length; i++) {
            if(asistencias[i] > mayor){
                mayor = asistencias[i];
                departamento = i;
            }
        } 
        System.out.println("La mayor asistencia es : "+mayor +" En el departamento: "+" :" + departamento);

    }
     public void menorAsistencia(){
         int menor = menor();
        int [] asistencias = trabajadoresDepartamentos();
        for (int i = 1; i < asistencia.length; i++) {
            if(asistencias[i] == menor){
               System.out.println("La menor asistencia es : "+menor +" En el departamento: "+" :" + i);
            }
        }
        
    }
     //Todos los menores 
     public int menor(){
         
        int [] asistencias = trabajadoresDepartamentos();
        int menor = asistencias[0];
        for (int i = 1; i < asistencia.length; i++) {
            if(asistencias[i] < menor){
                menor = asistencias[i];
                
        }
            
     } 
        return menor;
        
} 
     public int asistenciaSabadoDomingo(){
         int suma = 0;
         int sabado = trabajadoresDias(6);
         int domingo= trabajadoresDias(7);
         suma = sabado + domingo;
         
         return suma;
     }
}