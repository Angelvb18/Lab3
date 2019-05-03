/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_angelluis;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Equipo {
    private String nombre;
    private String palmares;
    private String ciudad;
    private double presupuesto;
    ArrayList<Jugador> listaj= new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String palmares, String ciudad, double presupuesto) {
        this.nombre = nombre;
        this.palmares = palmares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalmares() {
        return palmares;
    }

    public void setPalmares(String palmares) {
        this.palmares = palmares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getListaj() {
        return listaj;
    }

    public void setListaj(ArrayList<Jugador> listaj) {
        this.listaj = listaj;
    }
    
    
}
