
package Ajedrez;

/**
 *
 * @author froya
 */
public class Peon extends Fichas {

    private boolean primerMovimiento;

    public Peon(String color, int posicionX, int posicionY) {
        super(color, posicionX, posicionY);
        this.primerMovimiento = true;
    }

    @Override
    public boolean movimientoValido(int xDestino, int yDestino) {
        int direccion = color.equals("blanco") ? 1 : -1;
        if (primerMovimiento && xDestino == posicionX + 2 * direccion && yDestino == posicionY) {
            return true;
        } else if (xDestino == posicionX + direccion && yDestino == posicionY) {
            return true;
        } else if (xDestino == posicionX + direccion && Math.abs(yDestino - posicionY) == 1) {
            // Captura en diagonal
            return true;
        }
        return false;
    }

    public boolean puedePromocionar() {
        return (color.equals("blanco") && posicionX == 7) || (color.equals("negro") && posicionX == 0);
    }

    public Fichas promocionar(String nuevaPieza) {
        switch (nuevaPieza.toLowerCase()) {
            case "reina":
                return new Reina(color, posicionX, posicionY);
            case "torre":
                return new Torre(color, posicionX, posicionY);
            case "alfil":
                return new Alfil(color, posicionX, posicionY);
            case "caballo":
                return new Caballo(color, posicionX, posicionY);
            default:
                return null;
        }
    }
    
    
    
    /*
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
    }*/
}