/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_;

/**
 *
 * @author Diego
 */
public class EVA_1_9_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONVERSIÓN DE CELSIUS A FAHRENHEIT
        //FÓRMULA: F = (°C x 9.0 / 5.0) + 32 
        double celsius, fahrenheit; //variables de tipo double
        //INICIALIZACIÓN 
        celsius = 25;
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
         System.out.println("Temperatura en celsius:" + celsius + "C°");
        System.out.println("Temperatura en fahrenheit" + fahrenheit + "°F");
    }
    
}
