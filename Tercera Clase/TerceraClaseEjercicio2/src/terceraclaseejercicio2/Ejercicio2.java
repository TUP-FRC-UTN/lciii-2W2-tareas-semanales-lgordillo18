/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraclaseejercicio2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        String nombre;
        int puntosEquipo, puntosLiga, partidosGanados, partidosEmpatados, partidosPerdidos, golesRealizados, golesRecibidos, posicionLiga;
        
        System.out.println("Ingrese nombre del equipo: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese puntos en la liga: ");
        puntosLiga = lector.nextInt();
        System.out.println("Ingrese cantidad de partidos ganados: ");
        partidosGanados = lector.nextInt();
        System.out.println("Ingrese cantidad de partidos empatados: ");
        partidosEmpatados = lector.nextInt();
        System.out.println("Ingrese cantidad de partidos perdidos: ");
        partidosPerdidos = lector.nextInt();
        System.out.println("Ingrese cantidad de goles realizados: ");
        golesRealizados = lector.nextInt();
        System.out.println("Ingrese cantidad de goles recibidos: ");
        golesRecibidos = lector.nextInt();
        System.out.println("Ingrese posicion del Liga: ");
        posicionLiga = lector.nextInt();
        
        Equipo eq = new Equipo(nombre, puntosLiga, partidosGanados, partidosEmpatados, partidosPerdidos, golesRealizados, golesRecibidos, posicionLiga);
       
        System.out.println("Informacion de su equipo: " + eq.getEquipoInfo());
        
    } 
}
