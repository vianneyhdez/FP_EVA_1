/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_24_calificación;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EVA_1_24_CALIFICACIÓN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu calificación (0-100): ");
        int calif = sc.nextInt();

        char letra; // Variable para la calificación en letra

        if (calif >= 90 && calif <= 100) {
            letra = 'A';
        } else if (calif >= 80 && calif <= 89) {
            letra = 'B';
        } else if (calif >= 70 && calif <= 79) {
            letra = 'C';
        } else if (calif >= 60 && calif <= 69) {
            letra = 'D';
        } else if (calif >= 0 && calif <= 59) {
            letra = 'F';
        } else {
            System.out.println("Calificación inválida. Ingresa un número entre 0 y 100.");
            return; // Sale del programa si no es válido
        }

        System.out.println("Tu calificación en letra es: " + letra);

    }
}