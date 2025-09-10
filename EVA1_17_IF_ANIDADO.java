/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_if_anidado;

import java.util.Scanner;

public class EVA1_17_IF_ANIDADO {

    public static void main(String[] args) {
       int dia;
       Scanner captu = new Scanner(System.in);
       System.out.println("Número del dia de la semana:");
       dia = captu.nextInt();
       //else - if --> if anidado
       if(dia == 1){
           System.out.println("Domingo");
       }else if(dia == 2){
           System.out.println("Lunes");
       }else if(dia == 3){
           System.out.println("Martes");
       }else if(dia == 4){
           System.out.println("Miercoles");
       }else if(dia == 5){      
           System.out.println("Jueves");
       }else if(dia == 6){
           System.out.println("Viernes");
       }else if(dia == 7){
           System.out.println("Sabado");
       }
       
}
       
    
}
