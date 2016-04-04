/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.util.*;
import static java.lang.Math.*;

/**
 *
 * @author sebastian
 */

public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static void Menu() {
        int a, b;
        int op = 0;
        do {
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Raiz cuadrada");
            System.out.println("6.Potencia");
            System.out.println("7.Salir");
            System.out.println("-------------------");
            op = Leer();
            switch (op) {
                case 1: {
                    System.out.println("Opcion suma: ");
                    a = numero();
                    b = numero();
                    System.out.println("La suma es: " + Suma(a, b));
                }
                break;
                case 2: {
                    System.out.println("Opcion resta: ");
                    a = numero();
                    b = numero();
                    System.out.println("La resta es: " + Resta(a, b));
                }
                break;
                case 3: {
                    System.out.println("Opcion multiplicacion: ");
                    a = numero();
                    b = numero();
                    System.out.println("La multiplicacion es: " + Multiplicacion(a, b));
                }
                break;
                case 4: {
                    System.out.println("Opcion divicion: ");
                    a = numero();
                    b = numero();
                    System.out.println("La divicion es: " + Divicion(a, b));
                }
                break;
                case 5: {
                    System.out.println("Opcion raiz:  ");
                    a = numero();
                    System.out.println("La raiz es: " + Raiz(a));
                }
                break;
                case 6: {
                    System.out.println("Opcion potencia:  ");
                    System.out.println("Ingrese numero a elevar: ");
                    a = numero();
                    System.out.println("Elevado a: ");
                    b = numero();
                    System.out.println("La potencia es : " + Potencia(a,b));
                }
                break;
               case 7: {
                    System.out.println("Opcion potencia 2: ");
                    System.out.println("Ingrese numero a elevar: ");
                    a = numero();
                    System.out.println("Elevado a: ");
                    b = numero();
                    System.out.println("La potencia es : " + Potencia2(a, b));
                }
                break;
                case 8: {
                    System.out.println("Adios ");
                }
            }
        } while (op != 8);
    }

    public static int Suma(int a, int b) {
        int suma;
        suma = a + b;
        return suma;
    }

    public static int Resta(int a, int b) {
        int resta;
        resta = a - b;
        return resta;
    }

    public static int Multiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

    public static float Divicion(int a, int b) {
        float divicion;
        divicion = (float) a / b;
        return divicion;
    }

    public static double Raiz(int a) {
        double raiz;
        raiz = sqrt(a);
        return raiz;
    }
    public static double Potencia (int a , int b){
        double potencia;
        potencia = pow(a,b);
        return potencia;
    }
    public static double Potencia2(int a, int b) {
        double potencia = 1;
        int x;
        x = 0;
        if (b > 0) {
            do {
                potencia = potencia * (a);
                x++;
            } while (x != b);
        } else {
            do {
                potencia = potencia * (a);
                x--;
            } while (x != b);
            potencia = (1 / potencia);
        }
        return potencia;
    }

    public static int Leer() {
        int dato;
        Scanner leer = new Scanner(System.in);
        dato = leer.nextInt();
        return dato;
    }

    public static int numero() {
        int n = 0;
        System.out.println("Ingrese numero");
        n = Leer();
        return n;
    }
}
