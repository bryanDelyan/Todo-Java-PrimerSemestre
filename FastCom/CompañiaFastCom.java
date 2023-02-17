/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FastCom;

/**
 *
 * @author Usuario
 */
public class CompañiaFastCom {
    public double calcularFactura(int plan, int tiempo){
    int tarifa = 0;
    int adicional = 0;
    double total=0;
    if(plan == 1){
        if(tiempo == 15){
            tarifa = 10;
            total = tarifa;
            
        }
        else{
            if(tiempo >15){
                tarifa = 10;
                adicional = (tiempo - 15);
                total = (adicional * 0.50)+tarifa; //ese 50 son los centavos
            }
        }
    }
    if(plan ==2){
        if(tiempo == 30){
            tarifa = 15;
            total = tarifa;  
    }
    else{
        if(tiempo >30){
            tarifa = 15;
            adicional = (tiempo - 30) ;
            total = (50 / adicional)+tarifa;
        }
    }
    
    
}
    if(plan ==3){
        tarifa = 23;
        total = tarifa;
    
    }
    return total;
}
}