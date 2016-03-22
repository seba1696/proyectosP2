/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.*;

/**
 *
 * @author sebastian
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static int Numero() {
        int a = 0, b = 0;
        System.out.println("Ingrese primer numero");
        Leer(a);
        System.out.println("Ingrese segundo numero");
        Leer(b);
        return a;
    }

    public static void Menu() {
        int dato = 0;
        int suma;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Seleccione operacion: ");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Divicion");
            System.out.println("5.Salir");
            dato = leer.nextInt();
            if (dato==1){
                System.out.println("" + Suma(a,b));
            }
        } while (dato != 5);
    }

    public static void Leer(int a) {
        Scanner leer = new Scanner(System.in);
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

    public static int Multi(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

    public static float Divicion(int a, int b) {
        float divicion;
        divicion = (float) (a / b);
        return divicion;
    }
}
