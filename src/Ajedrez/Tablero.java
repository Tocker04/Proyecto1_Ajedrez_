/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajedrez;

import javafx.scene.image.ImageView;

/**
 *
 * @author froya
 */
public class Tablero {
    private Fichas[][] tablero;

    public Tablero() {
        tablero = new Fichas[8][8];
    }

    public Fichas getFicha(int x, int y) {
        return tablero[x][y];
    }

    public void colocarFicha(Fichas ficha, int x, int y) {
        tablero[x][y] = ficha;
    }

    public boolean moverFicha(int xInicial, int yInicial, int xDestino, int yDestino) {
        Fichas ficha = getFicha(xInicial, yInicial);
        if (ficha != null && ficha.movimientoValido(xDestino, yDestino)) {
            tablero[xInicial][yInicial] = null;
            tablero[xDestino][yDestino] = ficha;
            ficha.posicionX = xDestino;
            ficha.posicionY = yDestino;
            return true;
        }
        return false;
    }

}