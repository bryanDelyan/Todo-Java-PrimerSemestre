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
public class Test {
    public static void main(String[] args) {
        CompañiaFastCom c = new  CompañiaFastCom();
        System.out.println("El total a pagar es : "+c.calcularFactura(3, 30));
        
}
}