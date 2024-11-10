/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Peon extends Fichas {

    public Peon(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        // Determina la dirección de movimiento en función del color
        int direccion = color.equalsIgnoreCase("blanco") ? -1 : 1;
        
        // Movimiento normal de una casilla hacia adelante
        if (posicionX + direccion == xDestino && posicionY == yDestino) {
            return true;
        }
        
        // Movimiento inicial de dos casillas hacia adelante
        if (posicionX + 2 * direccion == xDestino && posicionY == yDestino && 
            (posicionX == 1 && color.equalsIgnoreCase("negro") || 
             posicionX == 6 && color.equalsIgnoreCase("blanco"))) {
            return true;
        }
        
        // Movimiento de captura en diagonal
        if (posicionX + direccion == xDestino && Math.abs(posicionY - yDestino) == 1) {
            return true;
        }
        
        return false;
    }
}