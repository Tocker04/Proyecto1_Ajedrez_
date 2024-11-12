
package Ajedrez;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author froya
 */
public class Rey extends Fichas {
private boolean movido; // Indica si el rey se ha movido

    public Rey(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
        this.movido = false;  // Al principio el rey no se ha movido
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int dx = Math.abs(xDestino - posicionX);
        int dy = Math.abs(yDestino - posicionY);
        return dx <= 1 && dy <= 1;
    }

    // Método para verificar el enroque
    public boolean puedeEnrocar(int xDestino, int yDestino, Tablero tablero) {
        if (this.movido || Math.abs(posicionY - yDestino) != 2) {
            return false;
        }

        int minY = Math.min(posicionY, yDestino);
        int maxY = Math.max(posicionY, yDestino);

        for (int i = minY + 1; i < maxY; i++) {
            if (tablero.getFicha(posicionX, i) != null || tablero.esAtacada(posicionX, i)) {
                return false;  // Hay piezas entre el rey y la torre o está en jaque
            }
        }

        if (tablero.esAtacada(posicionX, posicionY) || tablero.esAtacada(xDestino, yDestino)) {
            return false;
        }

        return true;
    }

    // Método para mover el rey y marcarlo como movido
    public void moverRey(int xDestino, int yDestino) {
        posicionX = xDestino;
        posicionY = yDestino;
        movido = true;
    }
}