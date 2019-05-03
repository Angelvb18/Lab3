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
        int op = 0, op2;
        Scanner lea = new Scanner(System.in);

        String nombre, apellido, estado, nacionalidad, piepr = "", euipo, palmares, ciudad;
        int num, edad, posj, pos;
        double precio, prep;
        ArrayList<Jugador> sincomprar = new ArrayList();
        ArrayList<Equipo> equipos = new ArrayList();

        while (op != 7) {
            System.out.println("1.Primero se podan crear, modificar, y eliminar Jugadores\n2.Crear y Eliminar Equipos\n3.Hacer compras\n"
                    + "4.Organizar Equiopos\n5.Listar Equipos\n6.Listar jugadores");
            op = lea.nextInt();
            switch (op) {
                case 1://Crear jugadores
                    
                    System.out.println("Ingrese nombre");
                    nombre = lea.next();
                    System.out.println("Ingrese apellido");
                    apellido = lea.next();
                    System.out.println("Ingrese edad");
                    edad = lea.nextInt();
                    System.out.println("Ingrese precio");
                    precio = lea.nextDouble();
                    System.out.println("1.Derecho\n2.Izquierdo");
                    op2 = lea.nextInt();
                    while (op2 > 2 || op2 < 1) {
                        System.out.println("1.Derecho\n2.Izquierdo");
                        op2 = lea.nextInt();
                    }
                    switch (op2) {
                        case 1:
                            piepr = "Derecho";
                            break;
                        case 2:
                            piepr = "Izquierdo";
                            break;

                    }
                    sincomprar.add(new Jugador(nombre, apellido, edad, euipo = "no tiene", piepr, precio, euipo));

                    break;
                default:
                    System.out.println("Ingreso uno opcion no valida");
                    break;
                case 2://
                    System.out.println("1.Crear\n2.Eliminar\nIngrese un numero:");
                    op2 = lea.nextInt();
                    if (op2 == 1) {
                        System.out.println("Ingrese ingrese nombre del equipo");
                        nombre = lea.next();
                        System.out.println("Ingrese palmare");
                        palmares = lea.next();
                        System.out.println("Ingrese ciudad");
                        ciudad = lea.next();
                        System.out.println("Ingrese presupuesto");
                        prep = lea.nextDouble();
                        equipos.add(new Equipo(nombre, palmares, ciudad, prep));
                    } else {
                        System.out.println("Ingrese posicion del equipo que desea eliminar");
                        op2 = lea.nextInt();
                        if (op2 >= equipos.size()) {
                            System.out.println("Vuelva a intentarlo");
                        } else {
                            equipos.remove(op2);
                            System.out.println("Operacion completada");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Seleccione el equipo: ");
                    printEquipos(equipos);
                    System.out.print("Opcion: ");
                    pos = lea.nextInt();
                    
                    System.out.println("Seleccione el jugador: ");
                    printJugadores(equipos.get(pos).getListaj());
                    System.out.print("Opcion: ");
                    int pos2 = lea.nextInt();
                    System.out.println("Que posicion?");
                    System.out.println("1. Delantero");
                    System.out.println("2. Medio");
                    System.out.println("3. Defensa");
                    System.out.println("4. Portero");
                    System.out.print("Opcion: ");
                    int subop = lea.nextInt();

                    switch (subop) {
                        case 1:
                            // get equipo get arraylist add new Delantero
                            // get equipo get arraylist size -1, set de las caracteristicas;
                            break;
                                    

                        case 2:
                            // get equipo get arraylist add new Medio
                            // get equipo get arraylist size -1, set de las caracteristicas;
                            break;

                        case 3:
                            // get equipo get arraylist add new Defensa
                            // get equipo get arraylist size -1, set de las caracteristicas;
                            break;

                        case 4:
                            // get equipo get arraylist add new Portero
                            // get equipo get arraylist size -1, set de las caracteristicas;
                            break;
                    }

                    break;
                case 4:
                    System.out.println("Seleccione el equipo: ");
                    printEquipos(equipos);
                    System.out.print("Opcion: ");
                    pos = lea.nextInt();

                    do {

                        System.out.println("Sus jugadores: ");
                        for (int i = 0; i < equipos.get(pos).getListaj().size() - 1; i++) {
                            if (equipos.get(pos).getListaj().get(i).isTitular()) {
                                System.out.println(i + ". TITULAR: " + equipos.get(pos).getListaj().get(i).getNombre() + equipos.get(pos).getListaj().get(i).getApellido());

                            } else {
                                System.out.println(i + ". NO TITULAR: " + equipos.get(pos).getListaj().get(i).getNombre() + equipos.get(pos).getListaj().get(i).getApellido());
                            }
                        }

                        System.out.print("Ingrese el jugador a cambiar o -1 para salir: ");
                        posj = lea.nextInt();

                        if (equipos.get(pos).getListaj().get(posj).isTitular()) {
                            equipos.get(pos).getListaj().get(posj).setTitular(false);

                        } else {
                            equipos.get(pos).getListaj().get(posj).setTitular(true);

                        }
                    } while (posj > -1);

                    System.out.println("Listo!");

                    break;
                case 5:
                    System.out.println("Ingrese posicion de el equipo en la lista");
                    num = lea.nextInt();
                    while (num >= equipos.size()) {
                        System.out.println("Ingrese posicion de el equipo en la lista");
                        num = lea.nextInt();
                    }

                    break;
                case 6:
                    System.out.println("Jugadores con equipos");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println();
                    }
                    System.out.println("Jugadores sin quipo");
                    break;
                case 7:
                    System.out.println("Adiós");
                    break;

            }
        }
    }

    public static void printEquipos(ArrayList<Equipo> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println((i + ". " + x.get(i).getNombre()));
        }
    }

    public static void printJugadores(ArrayList<Jugador> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + " " + x.toString());
        }
    }
}
