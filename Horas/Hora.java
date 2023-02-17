/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Horas;

/**
 *
 * @author Usuario
 */
public class Hora {
    public void calcularHora(int h,int m,int s){
    if ( h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59 )
    {
        s++;
        if ( s == 60 )
        {
            s = 0;
            m++;
            if ( m == 60 )
            {
                m = 0;
                h++;
                if ( h == 24 )
                    h = 0;
            }
        }
        
        System.out.println("La hora un segundo despues es : "+h +" : "+m+ ": "+s );
    }
    else{
        System.out.println("La hora no es correcta");
    }
}
    }

