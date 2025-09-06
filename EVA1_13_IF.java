/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_13_IF {

    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        double califa;
        Scanner captu = new Scanner(System.in);
        //CAPTURA
        System.out.println("Introduce tu calificación:");
        califa = captu.nextDouble();
        //ESTRUCTURA DE CONTROL IF - THEN - ELSE
        //SOLO EVALUA VERDADERO FALSO (true) o FALSO (false)
        if(califa >= 70){
            //AQUI VA LO QUE CORRESPONDE A VERDADERO
            System.out.println("FELICITACIONES, ACREDITASTE!!");
        }else{           //SECCIÓN VERDADERO (OPCIONAL)
            System.out.println("AZOTES!!");
        }
    }
    
}
