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
                    Opcion3();
                }
                break;
                case 4: {
                    System.out.println("Adios.");
                    System.out.println("------------------------------------------");
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
        System.out.println("------------------------------------------");
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
        System.out.println("------------------------------------------");
        int i, a, j;
        System.out.println("Ingrese numero maximo.");
        a = numero();
        System.out.println("Numeros primos anteriores al maximo: ");
        for (i = 2; i < (a + 1); i++) {
            for (j = 2; i > j && i % j != 0; j++);
            if (j == i) {
                if (i != 2) {
                    System.out.print(" , ");
                }
                System.out.print(i);
                j++;
            }
        }
        System.out.println("");
        System.out.println("------------------------------------------");
    }

    public static void Opcion3() {
        System.out.println("------------------------------------------");
        int i, a, j, mayor, pos, lugar, z = 0, cont = 0;
        Random azar = new Random();
        System.out.println("Ingrese dimension del arreglo.");
        a = numero();
        int arreglo[] = new int[a];
        System.out.println("------------------------------------------");
        System.out.println("Arreglo generado: ");
        for (i = 0; i < a; i++) {
            arreglo[i] = azar.nextInt(5);
            System.out.print(arreglo[i] + " - ");
        }
        pos = 0;
        mayor = arreglo[0];
        for (j = 0; j < a; j++) {
            if (mayor < arreglo[j]) {
                mayor = arreglo[j];
                pos = j + 1;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Numero mayor generado: " + mayor);
        System.out.println("Posicion del numero mayor: " + pos);
        System.out.println("------------------------------------------");
    }
}
