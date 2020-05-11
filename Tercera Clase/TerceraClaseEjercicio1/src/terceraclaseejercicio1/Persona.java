/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraclaseejercicio1;

/**
 *
 * @author Lucas
 */
public class Persona {
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;

    public Persona(String nombre, String apellido, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getIMC() {
        double alturaEnMetros;
        alturaEnMetros = (this.altura * 1) / 100;
        
        return this.peso / (alturaEnMetros * alturaEnMetros);
    }
}
