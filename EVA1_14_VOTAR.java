/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_votar;

import java.util.Scanner;

public class EVA1_14_VOTAR {
    
    public static void main(String[] args) {
        int annio_nac;
        int edad;
       Scanner captu = new Scanner(System.in);
       System.out.println("Captura tu año de nacimiento:");
       annio_nac = captu.nextInt();
       edad = 2025 - annio_nac;
       if(edad >=18){
           System.out.println("PUEDES VOTAR");
           
       }else{
           System.out.println("NO PUEDES VOTAR. MENOR DE EDAD!!");
       }
       
    }
    
}
