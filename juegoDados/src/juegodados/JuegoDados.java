/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebastian
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego();
    }

    public static void Juego() {
        String x;
        int n;
        Juego j = new Juego();
        Scanner leer = new Scanner(System.in);
        do {
            j.jugar();
            System.out.println("Jugar de nuevo?(si-1/no-0)");
            n = leer.nextInt();
        } while (n != 0);
    }

}
