package com.duquehenry.duquehenrysubmission;

/**
 * Created by hduque on 18/07/2016.
 */
public class DatosPersonales {

    //declaracion de variables de datos de contacto

    private String nombre;
    private String fechaNacimiento;
    private String telefono;
    private String email;
    private String descripcion;

    //constructor

    public DatosPersonales(String nombre, String fechaNacimiento, String telefono, String email, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
