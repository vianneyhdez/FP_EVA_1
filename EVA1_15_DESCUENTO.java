/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

public class EVA1_15_DESCUENTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese el monto de la venta:");
        double monto = captu.nextDouble();
        double montoFinal = monto;
        //SI EL MONTO ES MAYOR A 1000, APLICAR DESCUENTO DEL 15%
        if(monto > 1000){
            double descuento = monto * 0.15;
            montoFinal = monto - descuento;
            System.out.println("Se aplico un descuento del 15%!!");
            System.out.println("El monto a pagar es:" + montoFinal);       
        }
    }
    
}
