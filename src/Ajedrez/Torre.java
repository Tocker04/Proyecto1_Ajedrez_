/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Torre extends Fichas {
private boolean movido; // Indica si la torre se ha movido

    public Torre(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
        this.movido = false;  // Al principio, la torre no se ha movido
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        return posicionX == xDestino || posicionY == yDestino;
    }

    // Método para mover la torre y marcarla como movida
    public void moverTorre(int xDestino, int yDestino) {
        posicionX = xDestino;
        posicionY = yDestino;
        movido = true;  // Marcar como movido
    }

    public boolean seHaMovido() {
        return movido;
    }

}