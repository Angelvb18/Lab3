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
class Defensa extends Jugador{
    int lvlAgresividad;
    double altura;
    double peso;
    int velocidad;
    boolean titular;
    
    public Defensa() {
        super();
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

   
   
    public Defensa(int lvlAgresividad, double altura, double peso, int velocidad) {
        this.lvlAgresividad = lvlAgresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getLvlAgresividad() {
        return lvlAgresividad;
    }

    public void setLvlAgresividad(int lvlAgresividad) {
        this.lvlAgresividad = lvlAgresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Defensa{" + "lvlAgresividad=" + lvlAgresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
}
