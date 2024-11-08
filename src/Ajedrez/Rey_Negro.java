/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Rey_Negro extends Fichas {
    public Rey_Negro(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int dx = Math.abs(xDestino - posicionX);
        int dy = Math.abs(yDestino - posicionY);
        return dx <= 1 && dy <= 1;
    }
}