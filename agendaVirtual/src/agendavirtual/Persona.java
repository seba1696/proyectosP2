/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendavirtual;

import java.io.*;
import java.util.*;

/**
 *
 * @author sebastian
 */
public class Persona {

    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String fecha;

    Persona() {
    }

    Persona(String nombre, String telefono, String correo, String direccion, String ciudad, String fecha) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha = fecha;
        this.telefono = telefono;
    }
    public void mostrarPersona() {
        String msj = "";
        msj = "\t" + this.nombre;
        msj += "\t" + this.telefono;
        msj += "\t" + this.correo;
        msj += "\t" + this.direccion;
        msj += "\t" + this.ciudad;
        msj += "\t" + this.fecha;
        System.out.println(msj);
    }

    public String getNombre() throws IOException {
        System.out.println("Ingrese nombre: ");
        return nombre = leer();
    }

    public void setNombre(String nombre) throws IOException {
        this.nombre = leer();
    }

    public String getTelefono() throws IOException {
        System.out.println("Ingrese numero de telefono: ");
        return telefono= leer();
    }

    public void setTelefono(String telefono) throws IOException {
        this.telefono = leer();
    }

    public String getCorreo() throws IOException {
        System.out.println("Ingrese correo electronico: ");
        return correo= leer();
    }

    public void setCorreo(String correo) throws IOException {
        this.correo = leer();
    }

    public String getDireccion() throws IOException {
        System.out.println("Ingrese Direccion: ");
        return direccion = leer();
    }

    public void setDireccion(String direccion) throws IOException {
        this.direccion = leer();
    }

    public String getCiudad() throws IOException {
        System.out.println("Ingrese ciudad de nacimiento: ");
        return ciudad = leer();
    }

    public void setCiudad(String ciudad) throws IOException {
        this.ciudad = leer();
    }

    public String getFecha() throws IOException {
        System.out.println("Ingrese fecha de nacimiento: ");
        return fecha = leer();
    }

    public void setFecha(String fecha) throws IOException {
        this.fecha = leer();
    }

    String leer() throws IOException {
        String a;
        Scanner leer = new Scanner(System.in);
        a = leer.nextLine();
        return a;
    }
}
