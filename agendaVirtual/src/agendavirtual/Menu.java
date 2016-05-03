/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendavirtual;

import java.io.IOException;
import java.util.*;

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
        Scanner leer = new Scanner(System.in);
        int n;
        do {

            System.out.println("1.Agregar contacto.");
            System.out.println("2.Eliminar contacto.");
            System.out.println("3.Cantidad de contactos.");
            System.out.println("4.Limpiar agenda.");
            System.out.println("5.Estado de la agenda.");
            System.out.println("6.Informacion contacto.");
            System.out.println("7.Existe contacto.");
            System.out.println("8.Salir.");
            n = leer.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("============================================");
                    a.agregarContacto(a.getAgenda(), p.getNombre(), p.getTelefono(), p.getCorreo(), p.getDireccion(), p.getCiudad(), p.getFecha());
                    System.out.println("============================================");
                }
                break;
                case 2: {
                    System.out.println("============================================");
                    a.eliminarContacto(a.getAgenda(), p.getNombre());
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
                    a.mostrarContacto(a.getAgenda(), p.getNombre());
                    System.out.println("============================================");
                }
                break;
                case 7: {
                    System.out.println("============================================");
                    a.mostrarBusquedaContacto(a.getAgenda(), p.getNombre());
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
        } while (n != 8);
    }
}
