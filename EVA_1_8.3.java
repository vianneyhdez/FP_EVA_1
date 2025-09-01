/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_10;

/**
 *
 * @author Diego
 */
public class EVA_1_10 {
   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONVERSIÓN DE FAR A CELSIUS
        //FÓRMULA: C = (5/9) * (F - 32)
        double celsius, far; //variables de tipo double
        //INICIALIZACIÓN 
        far = 77;//valor de ejemplo 
        celsius = (5.0 / 9.0) * (far - 32) ;
         System.out.println("Temperatura en far:" + far + "°F");
        System.out.println("Temperatura en celsius" + celsius + "°C");
       
    }
    
}
