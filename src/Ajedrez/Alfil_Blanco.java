/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public class Alfil_Blanco extends Fichas {
    public Alfil_Blanco(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    public Alfil_Blanco(String blanco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        return Math.abs(posicionX - xDestino) == Math.abs(posicionY - yDestino);
    }
}