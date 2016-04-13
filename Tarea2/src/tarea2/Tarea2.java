/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.*;
import java.io.*;

/**
 *
 * @author sebastian
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] Final = new String[10][3];
        Menu(Final);
    }

    public static void Menu(String[][] Final) {
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
            Hotel(Final);
            switch (op) {
                case 1: {
                    Estado(Final);
                }
                break;
                case 2: {
                    Op(Final);
                }
                break;
                case 3: {
                    Boleta(Final);
                }
                break;
                case 4: {
                    reset(superUsuario(), Final);
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

    public static String leer() {
        String x = null;
        boolean valor;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                x = leer.readLine();
                valor = true;
            } catch (Exception e) {
                System.out.println("------------------------------------------");
                valor = false;
            }
        } while (valor == false);
        return x;
    }

    public static String[][] Hotel(String[][] Final) {
        int i, j;
        for (i = 0; i < 4; i++) {
            Final[i][0] = "Matrimonial";
        }
        for (i = 4; i < 7; i++) {
            Final[i][0] = "Doble";
        }
        for (i = 7; i < 10; i++) {
            Final[i][0] = "Simple";
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 3; j++) {
                Final[i][1] = "Disponible";
                Final[i][2] = "cuenta: ";
            }
        }
        return Final;
    }

    public static void Estado(String[][] Final) {
        int i, j, s, x = 0, y = 0;
        do {
            System.out.print("Estado de habitacion numero: ");
            s = leerOP();
            if (s > 0 && s < 11) {

                for (j = 0; j < 2; j++) {
                    System.out.println(" /" + Final[s - 1][j] + "/");
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
                System.out.println("--------------------------");

            } else {
                System.out.println("La habitacion seleccionada no existe.");
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
                System.out.println("--------------------------");
            }
        } while (y != 0);
    }

    public static String[][] Op(String[][] Final) {
        int i, j, a;
        System.out.println("Operacion a realizar : ");
        System.out.println("1.Marcar habitacion como reservada.");
        System.out.println("2.Marcar habitacion como ocupada.");
        System.out.println("3.Marcar habitacion como disponible.");
        a = leerOP();
        if (a == 1) {
            Op1(Final);
        } else {
            if (a == 2) {
                Op2(Final);
            } else {
                if (a == 3) {
                    Op3(Final);
                } else {
                    System.out.println("La operacion seleccionada no existe.");
                    System.out.println("---------------------------------------");
                }
            }
        }
        return Final;
    }

    public static String Op1(String[][] Final) {
        String Op1 = null;
        int s, x = 0, y = 0, i, j;
        int cuenta = 0, cont = 0;
        Op1 = String.valueOf(cuenta);
        Op1 = Integer.toString(cuenta);
        do {
            System.out.print("Reservar habitacion numero: ");
            s = leerOP();
            if (s > 0 && s < 11) {
                if (s > 0 && s < 5) {
                    x = 1;
                    System.out.println("Cantidad de noches: ");
                    cuenta = leerOP();
                    if (Final[s - 1][1] == "Reservada") {
                        System.out.println("Habitacion ya reservada.");
                    } else {
                        Final[s - 1][1] = "Reservada";
                        Final[s - 1][2] = "cuenta: " + cuenta * 60000;
                        System.out.println("Total: " + cuenta * 60000);
                    }
                    System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                    y = leerOP();
                    System.out.println("----------------------------------");
                } else {
                    if (s >= 5 && s < 8) {
                        x = 1;
                        System.out.println("Cantidad de noches: ");
                        cuenta = leerOP();
                        if (Final[s - 1][1] == "Reservada") {
                            System.out.println("Habitacion ya reservada.");
                        } else {
                            Final[s - 1][1] = "Reservada";
                            Final[s - 1][2] = "cuenta: " + cuenta * 50000;
                            System.out.println("Total: " + cuenta * 50000);
                        }
                        System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                        y = leerOP();
                        System.out.println("----------------------------------");
                    }
                }
            } else {
                if (s >= 8) {
                    x = 1;
                    System.out.println("Cantidad de noches: ");
                    cuenta = leerOP();
                    if (Final[s - 1][1] == "Reservada") {
                        System.out.println("Habitacion ya reservada.");
                    } else {
                        Final[s - 1][1] = "Reservada";
                        Final[s - 1][2] = "cuenta: " + cuenta * 40000;
                        System.out.println("Total: " + cuenta * 40000);
                    }
                    System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                    y = leerOP();
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("La habitacion seleccionada no existe.");
                    x = 0;
                    System.out.println("----------------------------------");
                }
            }
        } while (y != 0);
        return Op1;
    }

    public static String Op2(String[][] Final) {
        String Op2 = null;
        int s, x = 0, y = 0, i, j;
        do {
            System.out.print("Ocupar habitacion numero: ");
            s = leerOP();
            if (s > 0 && s < 11) {
                x = 1;
                if (Final[s - 1][1] == "Ocupada") {
                    System.out.println("Habitacion ya ocupada.");
                } else {
                    Final[s - 1][1] = "Ocupada";
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
                System.out.println("----------------------------------");
            } else {
                System.out.println("La habitacion seleccionada no existe.");
                x = 0;
                System.out.println("----------------------------------");
            }
        } while (y != 0);
        return Op2;
    }

    public static String Op3(String[][] Final) {
        String Op3 = null;
        int s, x = 0, y = 0, i, j;
        do {
            System.out.print("Dejar libre habitacion numero: ");
            s = leerOP();
            if (s > 0 && s < 11) {
                x = 1;
                if (Final[s - 1][1] == "Disponible") {
                    System.out.println("Habitacion ya disponible.");
                } else {
                    Final[s - 1][1] = "Disponible";
                }
                System.out.println("¿Desea ver otra habitacion? S(1)/N(0)");
                y = leerOP();
                System.out.println("----------------------------------");
            } else {
                System.out.println("La habitacion seleccionada no existe.");
                x = 0;
                System.out.println("----------------------------------");
            }
        } while (y != 0);
        return Op3;
    }

    public static boolean superUsuario() {
        boolean R = false;
        System.out.print("Ingrese contraseña: ");
        String x = leer();
        if (x == "1234") {
            R = true;
        }
        return R;
    }

    public static String[][] reset(boolean R, String[][] Final) {
        int j, i;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 3; j++) {
                Final[i][1] = "Disponible";
            }
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(Final[i][j]);
            }
        }
        System.out.println("Todo disponible.");
        System.out.println("----------------------------------");

        return Final;
    }

    public static void Boleta(String[][] Final) {
        String[][] e = new String[10][3];
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("| " + e[i][j] + " |");
            }
        }
    }
}
