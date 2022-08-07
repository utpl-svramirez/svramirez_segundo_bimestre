/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_poo_2b.pootareas2b;

/**
 *
 * @author svramirez
 */
public class jugador extends persons{
    String nivel;
    String idJugador;
    games juego;

    public jugador(String nivel, String idJugador, games juego, String nombre, String idPerson, int edad) {
        super(nombre, idPerson, edad);
        this.nivel = nivel;
        this.idJugador = idJugador;
        this.juego = juego;
    }

    public jugador(String nivel, String idJugador, games juego) {
        this.nivel = nivel;
        this.idJugador = idJugador;
        this.juego = juego;
    }
     public jugador() {
         
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public games getJuego() {
        return juego;
    }

    public void setJuego(games juego) {
        this.juego = juego;
    }
     
     
}
