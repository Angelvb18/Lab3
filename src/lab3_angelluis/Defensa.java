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
    
 
    public Defensa(int lvlAgresividad, double altura, double peso, int velocidad) {
        this.lvlAgresividad = lvlAgresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }
    public Defensa( String nombre, String apellido, int edad, String estado, String pais, String piePreferido, int lvlAgresividad, double altura, double peso, int velocidad) {
        super.nombre = nombre;
        super.apellido=apellido;
        super.edad=edad;
        super.piePreferido=piePreferido;
        super.estado=estado; 
        super.pais=pais;
        
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
