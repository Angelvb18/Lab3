/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_angelluis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Lab3_AngelLuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        Scanner lea = new Scanner(System.in);
        ArrayList euip= new ArrayList();
        String nombre,apellido,edad,estado,nacionalidad,piepr,euipo;
        int num;
        double precio;
        
        while (op != 7) {
            System.out.println("1.Primero se podan crear, modificar, y eliminar Jugadores\n2.Crear y Eliminar Equipos\n3.Hacer compras\n"
                    + "4.Organizar Equiopos\n5.Listar Equipos\n6.Listar jugadores");
            op = lea.nextInt();
            switch (op) {
                case 1://Crear jugadores
                    
                    break;
                default:
                    System.out.println("Ingreso uno opcion no valida");
                    break;
                case 2://
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Adiós");
                    break;

            }
        }
    }

}
