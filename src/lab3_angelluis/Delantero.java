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
class Delantero extends Jugador {

    int lvlDefinicion;
    double altura;
    double velocidad;
    double avgGoles;
    boolean titular;

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    
    public Delantero(int lvlDefinicion, double altura, double velocidad, double avgGoles, String nombre, String apellido, int edad, String estado, String pais, String piePreferido, String equipo) {
        super();
        this.lvlDefinicion = lvlDefinicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.avgGoles = avgGoles;
    }

    public Delantero(int lvlDefinicion, double altura, double velocidad, double avgGoles) {
        this.lvlDefinicion = lvlDefinicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.avgGoles = avgGoles;
    }

    public Delantero() {
    }

    public int getLvlDefinicion() {
        return lvlDefinicion;
    }

    public void setLvlDefinicion(int lvlDefinicion) {
        this.lvlDefinicion = lvlDefinicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAvgGoles() {
        return avgGoles;
    }

    public void setAvgGoles(double avgGoles) {
        this.avgGoles = avgGoles;
    }

    @Override
    public String toString() {
        return "Delantero{" + "lvlDefinicion=" + lvlDefinicion + ", altura=" + altura + ", velocidad=" + velocidad + ", avgGoles=" + avgGoles + '}';
    }

}
