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
public class Agenda {

    private ArrayList<Persona> agenda = new ArrayList<Persona>();

    Agenda() {
    }

    public ArrayList<Persona> getAgenda() {
        return agenda;
    }

    public void setcolecVinilos(ArrayList<Persona> agenda) {
        this.agenda = agenda;
    }

    public void agregarContacto(ArrayList<Persona> per, String nombre, String telefono, String correo, String direccion, String ciudad, String fecha) throws IOException {
        per.add(new Persona(nombre, telefono, correo, direccion, ciudad, fecha));
    }

    public boolean buscarContacto(ArrayList<Persona> per, String nombre) throws IOException {
        boolean r = false;
        for (int i = 0; i < per.size(); i++) {
            if (per.get(i).getNombre().equals(nombre)) {
                r = true;
                break;
            }
        }
        return r;
    }

    public void mostrarBusquedaContacto(ArrayList<Persona> per, String nombre) throws IOException {
        if (buscarContacto(per, nombre)) {
            System.out.println("El contacto: " + nombre + ",si esta en la agenda\n");
        } else {
            System.out.println("El contacto: " + nombre + ",no esta en la agenda\n");
        }
    }

    public void eliminarContacto(ArrayList<Persona> per, String nombre) throws IOException {
        for (int i = 0; i < per.size(); i++) {
            if (per.get(i).getNombre().equals(nombre)) {
                per.remove(i);
                break;
            }
        }
    }

    public void tamañoAgenda(ArrayList<Persona> per) {
        System.out.println("Cantidad de contactos en la agenda: " + per.size());
    }

    public void mostrarContacto(ArrayList<Persona> per, String nombre) throws IOException {
        for (int i = 0; i < per.size(); i++) {
            if (per.get(i).getNombre().equals(nombre)) {
                System.out.println("Datos del contacto: ");
                System.out.println("\tNombre contacto" + "\tNumero de telefono" + "\tCorreo" + "\tDireccion electronico" + "\tCiudad de nacimiento" + "\tFecha de nacimiento \n");
                System.out.println("=================================================================");
                System.out.println(i + 1);
                per.get(i).mostrarPersona();
            } else {
                System.out.println("El contacto no se encuentra en la agenda.");
            }
        }
    }

    public void eliminarAgenda(ArrayList<Persona> per) {
        for (int i = 0; i < per.size(); i++) {
            per.remove(i);
        }
    }

    public void vaciaAgenda(ArrayList<Persona> per) {
        for (int i = 0; i < per.size(); i++) {
            if (per.get(i) == null) {
                System.out.println("La agenda esta vacia.");
            }else{
                System.out.println("La agenda contiene contactos.");
            }
        }
    }
}
