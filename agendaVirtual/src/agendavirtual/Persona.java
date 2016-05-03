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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
