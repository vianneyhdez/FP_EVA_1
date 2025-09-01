/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_celsius;

/**
 *
 * @author Diego
 */
public class EVA_1_8_CELSIUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONVERSIÓN DE CELSIUS A KELVIN
        //FÓRMULA: K = °C + 273.15
        double celsius, kelvin; //variables de tipo double
        //INICIALIZACIÓN 
        celsius = 25; //variables de ejemplo en Celsius
        kelvin = celsius + 273.15;
        System.out.println("Temperatura en celsius:" + celsius + "C°");
        System.out.println("Temperatura en kelvin" + kelvin + "K");
    }
    
}
