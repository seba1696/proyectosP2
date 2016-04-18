/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiobinario;

import java.util.*;

/**
 *
 * @author sebastian
 */
public class Cambiobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        System.out.println("Ingrese numero decimal: ");
        numero = leerNumero();
        System.out.println(validarNumero(numero));
        if (validarNumero(numero)==true){
            calcularBinario8(numero);
        }else{
            System.out.println("Error!!");
        }
    }

    public static int leerNumero() {
        int num;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        return num;
    }

    public static boolean validarNumero(int num) {
        boolean r;
        if (num < 256 || num > -1) {
            r = true;
            System.out.println("");
        } else {
            r = false;
        }
        return r;
    }

    public static int[] calcularBinario8(int num) {
        int i, j = 0;
        int a[] = new int[8];
        for (i = 0; i < 8; i++) {
            a[i] = 0;
        }
        while (0 != num) {
            if (0 != num % 2) {
                a[j++] = num % 2;
                num -= num % 2;
                num /= 2;
            } else {
                a[j++] = 0;
                num /= 2;
            }
        }
        int x = 0, aux;
        while ((7 - x) > x) {
            aux = a[x];
            a[x] = a[7 - x];
            a[7 - x] = aux;
            x++;
        }
        imprimirResultado( num,a );
        return a;
    }
    public static void imprimirResultado(int num, int [] a){
        System.out.println("Numero decimal ingresado: " + num);
        System.out.println("");
        int x;
        for (x = 0; x < 8; x++) {
            System.out.print("[" + a[x] + "]");
        }
    }

}
