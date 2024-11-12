
package Ajedrez;

/**
 *
 * @author froya
 */
public class Alfil extends Fichas {

    public Alfil(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        // El alfil se mueve en diagonales, por lo tanto, la diferencia entre las posiciones
        // en X y Y debe ser igual.
        return Math.abs(xDestino - posicionX) == Math.abs(yDestino - posicionY);
    }

    public void mover(int xDestino, int yDestino) {
        // Si el movimiento es válido, actualizamos la posición del alfil.
        if (movimientoValido(xDestino, yDestino)) {
            this.posicionX = xDestino;
            this.posicionY = yDestino;
            System.out.println("Alfil movido a la posición: (" + xDestino + ", " + yDestino + ")");
        } else {
            System.out.println("Movimiento no válido para el Alfil.");
        }
    }
}