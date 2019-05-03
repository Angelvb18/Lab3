/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_angelluis;

/**
 *
 * @author Luis Enriquez
 */
class Jugador {
    String nombre;
    String apellido;
    int edad;
    String estado;
    String pais;
    String piePreferido;
    int numero = 0;
    double precio;
    String equipo;

    public Jugador(String nombre, String apellido, int edad, String pais, String piePreferido, double precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.piePreferido = piePreferido;
        this.precio = precio;
        this.equipo = equipo;
    }

   

    public Jugador(String nombre, String apellido, int edad, String pais, String piePreferido, int precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.piePreferido = piePreferido;
        this.precio = precio;
        this.equipo = equipo;
    }
    

    public Jugador() {
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPiePreferido() {
        return piePreferido;
    }

    public void setPiePreferido(String piePreferido) {
        this.piePreferido = piePreferido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estado=" + estado + ", pais=" + pais + ", piePreferido=" + piePreferido + ", numero=" + numero + ", equipo=" + equipo + '}';
    }
}
