/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_meses;

import java.util.Scanner;

public class EVA1_18_MESES {

    public static void main(String[] args) {
       int mes;
       Scanner captu = new Scanner(System.in);
       System.out.println("Número de mes del año:");
       mes = captu.nextInt();
       if(mes == 1){
           System.out.println("Enero");
       }else if(mes == 3){
           System.out.println("Febrero");
       }else if(mes == 4){
           System.out.println("Marzo");
       }else if(mes == 5){
           System.out.println("Abril");
       }else if(mes == 6){      
           System.out.println("Mayo");
       }else if(mes == 7){
           System.out.println("Junio");
       }else if(mes == 8){
           System.out.println("Julio");
       }
    }
    
}
