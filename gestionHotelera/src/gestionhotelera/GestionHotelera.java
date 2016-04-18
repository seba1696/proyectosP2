/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhotelera;

import java.io.*;
import java.util.*;

/**
 *
 * @author sebastian
 */
public class GestionHotelera {

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
            System.out.println("--------------------------");
            System.out.println("'Bienvenido'.");
            System.out.println("1.Estado de habitacion o del hotel");
            System.out.println("2.Reservas.");
            System.out.println("3.Boleta.");
            System.out.println("4.Reiniciar hotel.");
            System.out.println("5.Salir");
            System.out.println("--------------------------");
            op = leerOP();
            switch (op) {
                case 1: {
                    Habitaciones();
                    Estado(Habitaciones());
                    Habitacion(Habitaciones());
                }
                break;
                case 2: {
                    Habitaciones2(Habitaciones());
                }
                break;
                case 3: {
                }
                break;
                case 4: {
                }
                break;
                case 5: {
                    System.out.println("Adios.");
                    System.out.println("--------------------------");
                }
                break;
            }
            if (op < 1 || op > 5) {
                System.out.println("Error!!-Ingrese opcion valida.");
            }
        } while (op != 5);
    }

    public static int leerOP() {
        int op = 0;
        boolean valor;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                op = Integer.parseInt(leer.readLine());
                valor = true;

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros.");
                System.out.println("------------------------------------------");
                valor = false;
            }
        } while (valor == false);
        return op;
    }

    public static String[][] Habitaciones() {
        String habitaciones[][] = new String[10][3];
        int i, j;
        for (i = 0; i < 4; i++) {
            habitaciones[i][0] = "Matrimonial";
        }
        for (i = 4; i < 7; i++) {
            habitaciones[i][0] = "Doble";
        }
        for (i = 7; i < 10; i++) {
            habitaciones[i][0] = "Simple";
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++) {
                habitaciones[i][1] = "Disponible";
            }
        }

        return habitaciones;
    }

    public static void Estado(String[][] habitaciones) {
        int i, j;
        System.out.println("Estado del hotel.");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++) {
                if (habitaciones[i][1] == "Disponible") {
                    System.out.println(" |" + habitaciones[i][j] + "|");
                }

            }
        }
    }

    public static void Habitacion(String[][] habitaciones) {
        int i, j, s, x = 0, y = 0;
        System.out.print("Estado de habitacion numero: ");
        s = leerOP();
        if (s > 0 && s < 11) {
            do {
                for (j = 0; j < 2; j++) {
                    System.out.println(" /" + habitaciones[s - 1][j] + "/");
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
            } while (y != 0);
        } else {
            System.out.println("La habitacion seleccionada no existe.");
        }
    }

    public static String[][] Habitaciones2(String[][] habitaciones) {
        String[][] habitaciones2 = new String[10][2];
        int i, j, a;
        System.out.println("Operacion a realizar : ");
        System.out.println("1.Marcar habitacion como reservada.");
        System.out.println("2.Marcar habitacion como ocupada.");
        System.out.println("3.Marcar habitacion como disponible.");
        a = leerOP();
        if (a == 1) {
            Operacion1(Habitaciones());
        } else {
            if (a == 2) {
                Operacion2(Habitaciones());
            } else {
                if (a == 3) {
                    Operacion3(Habitaciones());
                } else {
                    System.out.println("La operacion seleccionada no existe.");
                }
            }
        }
        return habitaciones2;
    }

    public static String Operacion1(String[][] habitaciones) {
        String Operacion1 = null;
        int s, x = 0, y = 0, i, j;
        int cuenta = 0, cont = 0;
        Operacion1 = String.valueOf(cuenta);
        Operacion1 = Integer.toString(cuenta);
        System.out.print("Reservar habitacion numero: ");
        s = leerOP();
        if (s > 0 && s < 11) {
            if (s > 0 && s < 5) {
                do {
                    x = 1;
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 3; j++) {
                            System.out.println("Cantidad de noches: ");
                            cuenta = leerOP();
                            habitaciones[s - 1][1] = "Reservada";
                            habitaciones[s-1][2] = "cuenta: " + cuenta*40000;
                            
                        }
                    }
                    System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                    y = leerOP();
                } while (y != 0);
            } else {
                if (s >= 5 && s < 8) {
                    do {
                        x = 1;
                        for (i = 0; i < 10; i++) {
                            for (j = 0; j < 3; j++) {
                                habitaciones[s - 1][1] = "Reservada";
                            }
                        }
                        System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                        y = leerOP();
                    } while (y != 0);
                } else {
                    if (s >= 8) {
                        do {
                            x = 1;
                            for (i = 0; i < 10; i++) {
                                for (j = 0; j < 3; j++) {
                                    habitaciones[s - 1][1] = "Reservada";
                                }
                            }
                            System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                            y = leerOP();
                        } while (y != 0);
                    }
                }
            }

        } else {
            System.out.println("La habitacion seleccionada no existe.");
            x = 0;
        }
        return Operacion1;
    }

    public static String Operacion2(String[][] habitaciones) {
        String Operacion2 = null;
        int s, x = 0, y = 0, i, j;
        System.out.print("Ocupar habitacion numero: ");
        s = leerOP();
        if (s > 0 && s < 11) {
            do {
                x = 1;
                for (i = 0; i < 10; i++) {
                    for (j = 0; j < 2; j++) {
                        habitaciones[s - 1][1] = "Ocupada";
                    }
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
            } while (y != 0);
        } else {
            System.out.println("La habitacion seleccionada no existe.");
            x = 0;
        }
        return Operacion2;
    }

    public static String Operacion3(String[][] habitaciones) {
        String Operacion3 = null;
        int s, x = 0, y = 0, i, j;
        System.out.print("Dejar libre habitacion numero: ");
        s = leerOP();
        if (s > 0 && s < 11) {
            do {
                x = 1;
                for (i = 0; i < 10; i++) {
                    for (j = 0; j < 2; j++) {
                        habitaciones[s - 1][1] = "Disponible";
                    }
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
            } while (y != 0);
        } else {
            System.out.println("La habitacion seleccionada no existe.");
            x = 0;
        }
        return Operacion3;
    }
}
