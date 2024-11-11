
package Ajedrez;

import java.awt.Color;

/**
 *
 * @author froya
 */
public class Tablero {
    private Fichas[][] tablero;
    private Jugador jugadorBlanco;
    private Jugador jugadorNegro;
    private Jugador turnoActual;

    public Tablero() {
        tablero = new Fichas[8][8];
        inicializarTablero();
        jugadorBlanco = new Jugador("Jugador Blanco","blanco");
        jugadorNegro = new Jugador("Jugador Negro", "negro");
        turnoActual = jugadorBlanco;
    }

    // Inicializar las piezas en el tablero en sus posiciones iniciales
    private void inicializarTablero() {
        // Colocación de piezas negras
    colocarFicha(new Torre("negro", 0, 0), 0, 0);
    colocarFicha(new Caballo("negro", 0, 1), 0, 1);
    colocarFicha(new Alfil("negro", 0, 2), 0, 2);
    colocarFicha(new Reina("negro", 0, 3), 0, 3);
    colocarFicha(new Rey("negro", 0, 4), 0, 4);
    colocarFicha(new Alfil("negro", 0, 5), 0, 5);
    colocarFicha(new Caballo("negro", 0, 6), 0, 6);
    colocarFicha(new Torre("negro", 0, 7), 0, 7);

    for (int i = 0; i < 8; i++) {
        colocarFicha(new Peon("negro", 1, i), 1, i);
    }

    // Colocación de piezas blancas
    colocarFicha(new Torre("blanco", 7, 0), 7, 0);
    colocarFicha(new Caballo("blanco", 7, 1), 7, 1);
    colocarFicha(new Alfil("blanco", 7, 2), 7, 2);
    colocarFicha(new Reina("blanco", 7, 3), 7, 3);
    colocarFicha(new Rey("blanco", 7, 4), 7, 4);
    colocarFicha(new Alfil("blanco", 7, 5), 7, 5);
    colocarFicha(new Caballo("blanco", 7, 6), 7, 6);
    colocarFicha(new Torre("blanco", 7, 7), 7, 7);

    for (int i = 0; i < 8; i++) {
        colocarFicha(new Peon("blanco", 6, i), 6, i);
    }
    }

    public Fichas getFicha(int x, int y) {
        return tablero[x][y];
    }

    public void colocarFicha(Fichas ficha, int x, int y) {
        tablero[x][y] = ficha;
    }

    // Método para mover una ficha
    public boolean moverFicha(int xInicial, int yInicial, int xDestino, int yDestino) {
        Fichas ficha = getFicha(xInicial, yInicial);
        Fichas fichaDestino = getFicha(xDestino, yDestino);

        if (ficha == null) {
            return false;  // No hay ficha en la posición inicial
        }

        if (fichaDestino != null && fichaDestino.getColor().equals(ficha.getColor())) {
            return false;  // No puede moverse a una casilla ocupada por una ficha del mismo color
        }

        if (ficha.movimientoValido(xDestino, yDestino)) {
            tablero[xInicial][yInicial] = null;
            tablero[xDestino][yDestino] = ficha;
            ficha.posicionX = xDestino;
            ficha.posicionY = yDestino;
            return true;
        }

        return false;
    }

    // Verificar si el rey está en jaque
    private boolean estaEnJaque(Fichas ficha) {
        // Verifica si el rey del jugador está en jaque después del movimiento.
        // Aquí necesitarías revisar si el rey está amenazado por alguna pieza enemiga.
        return false; // Implementar la lógica de verificación de jaque.
    }

    // Verificar si es jaque mate
    private boolean esJaqueMate() {
        // Verifica si el rey del jugador está en jaque mate.
        return false; // Implementar la lógica de jaque mate.
    }

    // Método para realizar el enroque
   public boolean enrocar(int xRey, int yRey, int xDestinoRey, int yDestinoRey, int xTorre, int yTorre) {
    Fichas rey = getFicha(xRey, yRey);
    Fichas torre = getFicha(xTorre, yTorre);

    if (rey instanceof Rey && torre instanceof Torre) {
        Rey reyJugador = (Rey) rey;
        Torre torreJugador = (Torre) torre;

        // Verificar que el rey y la torre pueden enrocar
        if (reyJugador.puedeEnrocar(xDestinoRey, yDestinoRey, this) && !torreJugador.seHaMovido()) {
            // Realizar el movimiento de enroque: mover el rey dos casillas hacia la torre
            moverFicha(xRey, yRey, xDestinoRey, yDestinoRey);

            // Mover la torre a la posición opuesta
            int xDestinoTorre = (yDestinoRey == 6) ? 5 : 3;
            moverFicha(xTorre, yTorre, xDestinoTorre, yTorre);

            // Marcar que el rey y la torre se han movido
            ((Rey) rey).moverRey(xDestinoRey, yDestinoRey);
            torreJugador.moverTorre(xDestinoTorre, yTorre);

            return true; // Enroque realizado con éxito
        }
    }
    return false; // No se pudo realizar el enroque
}

    
    // Mostrar el nombre del jugador que tiene el turno
    public String obtenerJugadorTurno() {
        return turnoActual.getNombreJugador();
    }
    
    // Método para actualizar la vista o las piezas capturadas.
    public void actualizarPiezasCapturadas() {
        // Implementar lógica para actualizar la visualización de piezas capturadas.
    }

    boolean esAtacada(int posicionX, int posicionY) {
    // Verificar todas las piezas del tablero
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            Fichas ficha = getFicha(i, j);

            // Si la casilla contiene una pieza enemiga, verificar si puede atacar la posición
            if (ficha != null && !ficha.getColor().equals(turnoActual.getColorFicha())) {
                // Verificar si la pieza enemiga puede atacar la posición
                if (ficha.movimientoValido(posicionX, posicionY)) {
                    return true; // La casilla está siendo atacada
                }
            }
        }
    }
    return false;
    
    }
}
