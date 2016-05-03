/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendavirtual;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebastian
 */
public class Menu {

    Agenda a = new Agenda();
    Persona p = new Persona();

    Menu() {
    }

    public void setMenu() throws IOException {
        System.out.println("!Bienvenido!");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int n;
        boolean valor;
        do {
            System.out.println("1.Agregar contacto.");
            System.out.println("2.Eliminar contacto.");
            System.out.println("3.Cantidad de contactos.");
            System.out.println("4.Limpiar agenda.");
            System.out.println("5.Estado de la agenda.");
            System.out.println("6.Informacion contacto.");
            System.out.println("7.Existe contacto.");
            System.out.println("8.Salir.");
            do {
                try {
                    n = Integer.parseInt(leer.readLine());
                    valor = true;
                } catch (Exception e) {
                    System.out.println("Ingrese solo numeros.");
                    System.out.println("------------------------------------------");
                    valor = false;
                }
            } while (valor == false);
            if (n<1 || n>8){
                System.out.println("Opcion no valida");
            }else{
                switch (n) {
                    case 1: {
                        System.out.println("============================================");
                        System.out.println("Ingrese Nombre del contacto: ");
                        String nombre = leerString();
                        System.out.println("Ingrese numero de telefono: ");
                        String telefono = leerString();
                        System.out.println("Ingrese correo electronico: ");
                        String correo = leerString();
                        System.out.println("Ingrese Direccion: ");
                        String direccion = leerString();
                        System.out.println("Ingrese ciudad de nacimiento: ");
                        String ciudad = leerString();
                        System.out.println("Ingrese fecha de nacimiento: ");
                        String fecha = leerString();
                        a.agregarContacto(a.getAgenda(), nombre, telefono, correo, direccion, ciudad, fecha);
                        System.out.println("============================================");
                    }
                    break;
                    case 2: {
                        System.out.println("============================================");
                        System.out.println("Ingrese nombre del contacto: ");
                        String nombre = leerString();
                        a.eliminarContacto(a.getAgenda(), nombre);
                        System.out.println("============================================");
                    }
                    break;
                    case 3: {
                        System.out.println("============================================");
                        a.tamañoAgenda(a.getAgenda());
                        System.out.println("============================================");
                    }
                    break;
                    case 4: {
                        System.out.println("============================================");
                        a.eliminarAgenda(a.getAgenda());
                        System.out.println("============================================");
                    }
                    break;
                    case 5: {
                        System.out.println("============================================");
                        a.vaciaAgenda(a.getAgenda());
                        System.out.println("============================================");
                    }
                    break;
                    case 6: {
                        System.out.println("============================================");
                        System.out.println("Ingrese nombre del contacto: ");
                        String nombre = leerString();
                        a.mostrarContacto(a.getAgenda(), nombre);
                        System.out.println("========================================================");
                    }
                    break;
                    case 7: {
                        System.out.println("============================================");
                        System.out.println("Ingrese nombre del contacto: ");
                        String nombre = leerString();
                        a.mostrarBusquedaContacto(a.getAgenda(), nombre);
                        System.out.println("============================================");
                    }
                    break;
                    case 8: {
                        System.out.println("============================================");
                        System.out.println("Adios.");
                        System.out.println("============================================");
                    }
                    break;
                }
            }
        } while (n != 8);
    }

    public String leerString() {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        try {
            a = leer.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
}
