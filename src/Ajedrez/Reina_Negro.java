/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Reina_Negro extends Fichas {
    public Reina_Negro(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        return (posicionX == xDestino || posicionY == yDestino || 
                Math.abs(posicionX - xDestino) == Math.abs(posicionY - yDestino));
    }
}