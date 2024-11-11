/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author froya
 */
public abstract class Fichas {
    
protected String color;
    protected int posicionX;
    protected int posicionY;

    public Fichas (String color, int posicionX, int posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getColor() {
        return color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public abstract boolean movimientoValido(int xDestino, int yDestino);

    boolean puedeMoverse(int xInicial, int yInicial, int xDestino, int yDestino, Tablero aThis) {
        
    return false;
        
    }

    
}
//A