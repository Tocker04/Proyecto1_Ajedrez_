/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author froya
 */
public class Rey extends Fichas {
private boolean movido; // Indica si el rey se ha movido

    public Rey(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
        this.movido = false;  // Al principio el rey no se ha movido
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int dx = Math.abs(xDestino - posicionX);
        int dy = Math.abs(yDestino - posicionY);
        return dx <= 1 && dy <= 1;
    }

    // Método para realizar el enroque
    public boolean puedeEnrocar(int xDestino, int yDestino, Tablero tablero) {
        // Comprobar que el rey no se ha movido
        if (this.movido) {
            return false;
        }

        // Verificar que el movimiento es en línea recta (horizontal)
        if (posicionX != xDestino || Math.abs(posicionY - yDestino) != 2) {
            return false;
        }

        // Verificar que no hay piezas entre el rey y la torre
        int min = Math.min(posicionY, yDestino);
        int max = Math.max(posicionY, yDestino);
        for (int i = min + 1; i < max; i++) {
            if (tablero.getFicha(posicionX, i) != null) {
                return false;  // Hay piezas entre el rey y la torre
            }
        }

        // Verificar que el rey no está en jaque, ni va a pasar por una casilla atacada
        // Esto requiere una implementación adicional que verifica si las casillas están atacadas.
        // Suponemos que hay un método `esAtacada` en la clase `Tablero` que lo valida.
        if (tablero.esAtacada(posicionX, posicionY) || 
            tablero.esAtacada(xDestino, yDestino)) {
            return false;  // El rey no puede enrocar si está en jaque o pasa por una casilla atacada
        }

        return true;
    }

    // Método para mover el rey y marcarlo como movido
    public void moverRey(int xDestino, int yDestino) {
        posicionX = xDestino;
        posicionY = yDestino;
        movido = true;  // Marcar como movido
    }
}