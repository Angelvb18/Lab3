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
class Medio extends Jugador {

    int lvlCreatividad;
    int lvlDominio;
    double avgAsist;

    public Medio() {
        super();
    }
    public Medio( String nombre, String apellido, int edad, String estado, String pais, String piePreferido, int lvlCreatividad, int lvlDominio, double avgAsist) {
        super.nombre = nombre;
        super.apellido=apellido;
        super.edad=edad;
        super.piePreferido=piePreferido;
        super.estado=estado; 
        super.pais=pais;
        this.lvlCreatividad = lvlCreatividad;
        this.lvlDominio = lvlDominio;
        this.avgAsist = avgAsist;
    }
    public Medio(int lvlCreatividad, int lvlDominio, double avgAsist) {
        this.lvlCreatividad = lvlCreatividad;
        this.lvlDominio = lvlDominio;
        this.avgAsist = avgAsist;
    }

    public int getLvlCreatividad() {
        return lvlCreatividad;
    }

    public void setLvlCreatividad(int lvlCreatividad) {
        this.lvlCreatividad = lvlCreatividad;
    }

    public int getLvlDominio() {
        return lvlDominio;
    }

    public void setLvlDominio(int lvlDominio) {
        this.lvlDominio = lvlDominio;
    }

    public double getAvgAsist() {
        return avgAsist;
    }

    public void setAvgAsist(double avgAsist) {
        this.avgAsist = avgAsist;
    }

    @Override
    public String toString() {
        return "Medio{" + "lvlCreatividad=" + lvlCreatividad + ", lvlDominio=" + lvlDominio + ", avgAsist=" + avgAsist + '}';
    }
}
