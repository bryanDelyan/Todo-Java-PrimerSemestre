/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3T;

/**
 *
 * @author Usuario
 */
public class Elecciones {
    String [] candidatos ={"Jairo","Jorge","Ivan Javier","Ramirez"};
    int [] votos = {32329,90616,110462,21616};
    
    public double totalVotos(){ //Metodo que suma todos los votos
        double totalVotos = 0;
        for(int i = 0; i < votos.length;i++ ){
            totalVotos += votos[i];
        }
        return totalVotos;
    }
    public double [] totalPorcentaje(){ //Metodo que calcula porcentaje de los votos individualmente
        double totalVotos = totalVotos();
        double [] porcentajes = new double[4];
        for(int i = 0; i < votos.length;i++){
            double porcentaje = (votos[i]/totalVotos)*100;
            porcentajes[i] = porcentaje;
        }
        return porcentajes;
    }
     //algoritmo de ordenamiento, por el metodo de la burbuja para ordenar el arrglo
    public double [] ordenarArreglo(double []ordenado ){
        double aux = 0;
        for(int i = 0; i < ordenado.length;i++){
            for(int j = 0; j < ordenado.length-1;j++){
                if(ordenado[j] < ordenado [j+1]  ){  //De mayor a menor < y de menor a mayor >
                aux = ordenado [j];
                ordenado [j] = ordenado[j+1];
                ordenado [j+1] = aux;
            }
                
        }
    }
        return ordenado;
    }
    public void imprimir(double [] arreglo){ //Metodo que muestra el arreglo ordenado
        for(int i = 0; i < arreglo.length;i++){
        System.out.println("El indice: "+i+" el valor es "+arreglo[i]);
    }
    
    }
    public String mayorVotos() { //Este método calcula quien es el candidato con mayor votos
        int voto = votos[0];
        String name = candidatos[0];
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > voto) {
                voto = votos[i] ;
                name = candidatos[i];
            }
        }
        return name + " con " + voto;
    }
     public boolean mostrarGanadores (double[] ordenado){
         double porcentaje = ordenado [0];
         if (porcentaje > 50){
             return  true;
         }
         
         else
             return false;
     }
     public void segundaVuelta(double[] ordenado){
         System.out.println("Como no hay ganador se pasa a segunda vuelta con los más votados y son :El primero es : "+ candidatos[2] + " con un porcentaje de :"+ordenado[0]+" y el Segundo es : "+ candidatos[3] + " con un porcentaje de :"+ordenado[1]);
     }
     public void resultadoFinal(double[] ordenado){
         if(mostrarGanadores(ordenado)){
             System.out.println("Hay ganador");
         }
         else{
             segundaVuelta(ordenado);
         }
             
     }
}
