/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;


/**
 *
 * @author diego
 */
public class Eva1_11_CAPTURA {
    
    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD:
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)     
        //CALCULAR LA VELOCIDAD (M/S)
        //DECLARAR VARIABLES Y SCANNER
        Scanner input = new Scanner(System.in);
        double distancia, velocidad, tiempo;
        //SOLICITAR DATOS
        System.out.println("Captura la distancia (en metros):");
        distancia = input.nextDouble();
        System.out.println("Capturar el tiempo (en segundos):");
        tiempo = input.nextDouble();
        //REALIZAR CALCULOS
        velocidad = distancia / tiempo;
        //MOSTRAR RESULTADOS
        System.out.println("La velocidad (m/s) es:");
        System.out.println(velocidad);
        //dar resultado en km/hr
        velocidad = velocidad * 3.6;
        System.out.println("La velocidad en km/hr es: ");
        System.out.println(velocidad);
    }
    
}
