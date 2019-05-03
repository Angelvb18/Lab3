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
        int num, edad, posj, pos, w;
        double precio, prep, x, y, z;
        Jugador j = new Jugador();
        ArrayList sincomprar = new ArrayList();
        ArrayList<Equipo> equipos = new ArrayList();

        while (op != 7) {
            System.out.println("1.Primero se podan crear, modificar, y eliminar Jugadores\n2.Crear y Eliminar Equipos\n3.Hacer compras\n"
                    + "4.Organizar Equiopos\n5.Listar Equipos\n6.Listar jugadores");
            op = lea.nextInt();
            switch (op) {
                case 1://Crear jugadores
                    System.out.println("1.Crear\n2.Modificar\n3.Eliminar");
                    op2 = lea.nextInt();
                    switch (op2) {
                        case 1:
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
                            System.out.println("Ingrese pais");
                            String pais = lea.next();
                            System.out.println("1.Delantero\n2.Defensa\n3.Portero\n4.Medio");
                            op2 = lea.nextInt();

                            if (op2 == 1) {
                                System.out.println("Nivel de definicion: ");
                                int lvlDefinicion= lea.nextInt();
                                System.out.println("Altura: ");
                                double altura = lea.nextDouble();
                                System.out.println("Velocidad: ");
                                
                                double velocidad = lea.nextInt();
                                System.out.println("Promedio de goles: ");
                                double avgGoles = lea.nextInt();
                                sincomprar.add(new Delantero(nombre, apellido, edad, estado = "nv", pais, piepr, lvlDefinicion, altura, velocidad, avgGoles));

                            }
                            if (op2 == 2) {
                                System.out.println("Nivel de agilidad: ");
                                int lvlAg = lea.nextInt();
                                System.out.println("Altura: ");
                                double altura = lea.nextDouble();
                                System.out.println("Peso: ");
                                double peso = lea.nextDouble();
                                System.out.println("Velocidad: ");
                                int velocidad = lea.nextInt();
                                sincomprar.add(new Defensa(nombre, apellido, edad, estado = "nv", pais, piepr, lvlAg, altura, peso, velocidad));
                            }
                            
                            if (op2 == 3) {
                                System.out.println("Nivel aereo: ");
                                int lvlA = lea.nextInt();
                                System.out.println("Nivel a pie: ");
                                int lvlP = lea.nextInt();
                                sincomprar.add(new Portero(nombre, apellido, edad, estado = "nv", pais, piepr, lvlA, lvlP));
                            }
                            if (op == 4) {
                                System.out.println("Ingrese nivel de creatividad: ");
                                int lvlC = lea.nextInt();
                                System.out.println("Ingrese nivel de dominio: ");
                                int lvlD = lea.nextInt();
                                System.out.println("Promedio de goles: ");
                                double avgA = lea.nextDouble();

                                sincomprar.add(new Medio(nombre, apellido, edad, estado = "nv", pais, piepr,lvlC, lvlD, avgA));
                            }

                    

                    break;
                    
                    
                    case 2:
                        System.out.println("Ingrese posicion del equipo");
                        pos = lea.nextInt();
                        System.out.println("Ingrese poscion del jugador");
                        num = lea.nextInt();
                        System.out.println("1.Nombre\n2.Apellido\n3.Edad\n4.precio\n5.pie");
                        op2 = lea.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Ingrese nombre");
                                nombre = lea.next();
                                break;
                            case 2:
                                System.out.println("Ingrese apellido");
                                apellido = lea.next();
                                break;
                            case 3:
                                System.out.println("Ingrese edad");
                                edad = lea.nextInt();
                                break;
                            case 4:
                                System.out.println("Ingrese precio");
                                precio = lea.nextDouble();
                                break;
                            case 5:
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
                                break;
                            default:
                                System.out.println("No valido");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("1.Eliminar de equipo\n2.Eliminar no comprados");
                        op2 = lea.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Ingrese posicion del equipo");
                                op2 = lea.nextInt();
                                System.out.println("Ingrese posion del jugador");
                                pos = lea.nextInt();
                                equipos.get(op2).getListaj().remove(pos);
                                break;
                            case 2:
                                System.out.println("Ingrese posion del jugador");
                                pos = lea.nextInt();
                                sincomprar.remove(pos);
                            default:
                                System.out.println("No valido");
                                break;
                        }
                        break;
                    default:
                        System.out.println("No valido");
                        break;
            
            
            
        
                    }
            
                case 2:
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
                    int pose = lea.nextInt();
                    
                    System.out.println("Seleccione el jugador: ");
                    printJugadores(equipos.get(pose).getListaj());
                    System.out.print("Opcion: ");
                    int pos2 = lea.nextInt();
                    
                    Object obj = sincomprar.get(pos2);
                    
                    equipos.get(pose).getListaj().add(obj);
                          

                    break;
                case 4:
                    /*
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
                    */
                    System.out.println("Este metodo no sirve! :v");

                    break;
                case 5:
                    printEquipos(equipos);

                    break;
                case 6:
                    System.out.println("Jugadores con equipos");
                    for (int i = 0; i < equipos.size(); i++) {
                        printJugadores(equipos.get(i).getListaj());
                    }
                    System.out.println("Jugadores sin quipo");
                    printJugadores(sincomprar);
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
            System.out.println(i + "." + x.toString());
        }
    }
}
