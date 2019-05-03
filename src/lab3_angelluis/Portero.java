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
class Portero extends Jugador{
    int lvlAereo;
    int lvlPies;


    public Portero( String nombre, String apellido, int edad, String estado, String pais, String piePreferido, int Aereo, int pies) {
        super.nombre = nombre;
        super.apellido=apellido;
        super.edad=edad;
        super.piePreferido=piePreferido;
        super.estado=estado; 
        super.pais=pais;
        
        this.lvlAereo = Aereo;
        this.lvlPies = pies;
      
    }

   

    public Portero(int lvlAereo, int lvlPies) {
        this.lvlAereo = lvlAereo;
        this.lvlPies = lvlPies;
    }

    public int getLvlAereo() {
        return lvlAereo;
    }

    public void setLvlAereo(int lvlAereo) {
        this.lvlAereo = lvlAereo;
    }

    public int getLvlPies() {
        return lvlPies;
    }

    public void setLvlPies(int lvlPies) {
        this.lvlPies = lvlPies;
    }

    @Override
    public String toString() {
        return "Portero{" + "lvlAereo=" + lvlAereo + ", lvlPies=" + lvlPies + '}';
    }
}
