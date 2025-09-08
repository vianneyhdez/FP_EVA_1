/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EVA_1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
// Solicitar monto
        System.out.print("Ingrese el monto de la venta: ");
        double monto = sc.nextDouble();
        
        double montoFinal = monto;

        // Verificar si aplica el descuento
        if (monto > 1000) {
            double descuento = monto * 0.15;
            montoFinal = monto - descuento;
            System.out.println("Se aplicó un descuento de 15%: $" + descuento);
        }
        
        // Imprimir el monto a pagar
        System.out.println("Monto a pagar: $" + montoFinal);
        
        sc.close();
    }
}