/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraclaseejercicio1;

import java.util.Scanner;


/**
 *
 * @author Lucas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        String nombre, apellido;
        double peso, altura;
        
        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = lector.nextLine();
        System.out.println("Ingrese su peso en kg: ");
        peso = lector.nextInt();
        System.out.println("Ingrese su altura en cm: ");
        altura = lector.nextInt();
        
        Persona p = new Persona(nombre, apellido, peso, altura);
        
        System.out.println("Su índice de masa corporal es: " + p.getIMC());
    }
    
}
