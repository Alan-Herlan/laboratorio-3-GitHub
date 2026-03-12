/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1018;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Prog1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero:");
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            
            int t = sc.nextInt();

            for (int i = 1; i <= t; i++) {
                System.out.println("Ingresa el par numero " + i +":");
                System.out.println("1er numero:");
                long a = sc.nextLong();
                System.out.println("2do numero:");
                long b = sc.nextLong();

                if (a > b) {
                    System.out.println("Resultado: >");
                } else if (a < b) {
                    System.out.println("Resultado: <");
                } else {
                    System.out.println("Resultado: =");
                }
            }
        }
        sc.close();
    }
    
}
