/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_cap;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class EVA_1_9_CAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREAMOS EL SCANNER
        
        //COMO CAPTURAR EN JAVA:
        System.out.println("Introduce el nombre completo:");
        nombre = input.nextLine();//nextLine()--> CAPTURA TEXTO
        System.out.println("Introduce la edad:");
        edad = input.nextInt();
        System.out.println("Captura el promedio:");
        promedio = input.nextDouble();
        
        System.out.println("El nombre capturado es: ");
        System.out.println(nombre);
        System.out.println("La edad es: ");
        System.out.println(edad);
        System.out.println("El promedio es: ");
        System.out.println(promedio);
        

    }
    
}