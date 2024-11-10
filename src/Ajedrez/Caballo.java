/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Caballo extends Fichas {

    public Caballo(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int dx = Math.abs(xDestino - posicionX);
        int dy = Math.abs(yDestino - posicionY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}