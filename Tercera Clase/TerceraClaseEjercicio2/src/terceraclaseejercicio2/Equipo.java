/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraclaseejercicio2;

/**
 *
 * @author Lucas
 */
public class Equipo {
    private String nombre;
    private int puntosLiga;
    private int cantPartidosGanados;
    private int cantPartidosEmpatados;
    private int cantPatidosPerdidos;
    private int cantGolesRealizados;
    private int cantGolesRecibidos;
    private int posicionLiga;

    public Equipo(String nombre, int puntosLiga, int cantPartidosGanados, int cantPartidosEmpatados, int cantPatidosPerdidos, int cantGolesRealizados, int cantGolesRecibidos, int posicionLiga) {
        this.nombre = nombre;
        this.puntosLiga = puntosLiga;
        this.cantPartidosGanados = cantPartidosGanados;
        this.cantPartidosEmpatados = cantPartidosEmpatados;
        this.cantPatidosPerdidos = cantPatidosPerdidos;
        this.cantGolesRealizados = cantGolesRealizados;
        this.cantGolesRecibidos = cantGolesRecibidos;
        this.posicionLiga = posicionLiga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosLiga() {
        return puntosLiga;
    }

    public void setPuntosLiga(int puntosLiga) {
        this.puntosLiga = puntosLiga;
    }

    public int getCantPartidosGanados() {
        return cantPartidosGanados;
    }

    public void setCantPartidosGanados(int cantPartidosGanados) {
        this.cantPartidosGanados = cantPartidosGanados;
    }

    public int getCantPartidosEmpatados() {
        return cantPartidosEmpatados;
    }

    public void setCantPartidosEmpatados(int cantPartidosEmpatados) {
        this.cantPartidosEmpatados = cantPartidosEmpatados;
    }

    public int getCantPatidosPerdidos() {
        return cantPatidosPerdidos;
    }

    public void setCantPatidosPerdidos(int cantPatidosPerdidos) {
        this.cantPatidosPerdidos = cantPatidosPerdidos;
    }

    public int getCantGolesRealizados() {
        return cantGolesRealizados;
    }

    public void setCantGolesRealizados(int cantGolesRealizados) {
        this.cantGolesRealizados = cantGolesRealizados;
    }

    public int getCantGolesRecibidos() {
        return cantGolesRecibidos;
    }

    public void setCantGolesRecibidos(int cantGolesRecibidos) {
        this.cantGolesRecibidos = cantGolesRecibidos;
    }

    public int getPosicionLiga() {
        return posicionLiga;
    }

    public void setPosicionLiga(int posicionLiga) {
        this.posicionLiga = posicionLiga;
    }
    
    public String getEquipoInfo() {
        return "Nombre Equipo: " + this.nombre + "\n" +
                "Puntaje en la Liga: " + this.puntosLiga + "\n" +
                "Partidos Ganados: " + this.cantPartidosGanados + "\n" +
                "Partidos Empatados: " + this.cantPartidosEmpatados + "\n" +
                "Partidos Perdidos: " + this.cantPatidosPerdidos + "\n" +
                "Goles Realizados: " + this.cantGolesRealizados + "\n" +
                "Goles Recibidos: " + this.cantGolesRecibidos + "\n" +
                "Posicion en la Liga: " + this.posicionLiga;
    }
}
