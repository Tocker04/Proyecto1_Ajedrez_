
package Ajedrez;

/**
 *
 * @author Evans
 */
public class Jugador {
    private String nombreJugador;
    private String colorFicha;

    public Jugador(String nombreJugador, String colorFicha) {
        this.nombreJugador = nombreJugador;
        this.colorFicha = colorFicha;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getColorFicha() {
        return colorFicha;
    }

    public void setColorFicha(String colorFicha) {
        this.colorFicha = colorFicha;
    }
    
    
}
