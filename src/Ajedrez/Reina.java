/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Reina extends Fichas {

    public Reina(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        // La reina puede moverse en cualquier dirección: vertical, horizontal o diagonal
        return Math.abs(xDestino - posicionX) == Math.abs(yDestino - posicionY) || 
               posicionX == xDestino || posicionY == yDestino;
    }

    public void mover(int xDestino, int yDestino) {
        if (movimientoValido(xDestino, yDestino)) {
            // Mover la reina a la nueva posición
            this.posicionX = xDestino;
            this.posicionY = yDestino;
            System.out.println("Reina movida a la posición: (" + xDestino + ", " + yDestino + ")");
        } else {
            System.out.println("Movimiento no válido para la Reina.");
        }
    }
}