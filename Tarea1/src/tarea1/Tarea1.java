/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.*;

/**
 *
 * @author sebastian
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static void Menu() {
        int op;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Menu de opciones.");
            System.out.println("1.Numero multiplo.");
            System.out.println("2.Numeros primos.");
            System.out.println("3.Numero mayor del arreglo y su posicion.");
            System.out.println("4.Salir.");
            System.out.println("------------------------------------------");
            op = Leer();
            switch (op) {
                case 1: {
                    Opcion1();
                }
                break;
                case 2: {
                    Opcion2();
                }
                break;
                case 3: {

                }
                break;
                case 4: {
                    System.out.println("Adios.");
                }
                break;
            }
        } while (op != 4);

    }

    public static int Leer() {
        int op;
        Scanner leer = new Scanner(System.in);
        op = leer.nextInt();
        return op;
    }

    public static int numero() {
        int n = 0;
        n = Leer();
        return n;
    }

    public static void Opcion1() {
        int a, b;
        System.out.println("Ingrese primer numero.");
        a = numero();
        System.out.println("Ingrese segundo numero.");
        b = numero();
        if (a % b == 0) {
            System.out.println("El primer numero es multiplo del segundo.");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("No es multiplo.");
            System.out.println("------------------------------------------");
        }
    }

    public static void Opcion2() {
        Scanner leer = new Scanner(System.in);
        int i, a, j;
        System.out.println("Ingrese numero maximo.");
        a = leer.nextInt();
        System.out.println();
        for (i = 2; i < (a + 1); i++) {
            for (j = 2; j < i && i % j != 0; j++);
            if (j == i) {
                if (i != 2) {
                    System.out.print(" , ");
                }
                System.out.print(i);
                j--;
            }
        }
        System.out.println("");
        System.out.println("------------------------------------------");
    }

}
