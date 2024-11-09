/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Peon_Negro extends Fichas {
    public Peon_Negro(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }
/*
    public Peon_Negro(String negro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int dy = color.equals("blanco") ? 1 : -1;
        return (yDestino - posicionY == dy) && (xDestino == posicionX);
    }
}
