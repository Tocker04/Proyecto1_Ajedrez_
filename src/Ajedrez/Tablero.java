package Ajedrez;

import java.awt.Color;
import java.util.List;

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
        jugadorBlanco = new Jugador("Jugador Blanco", "blanco");
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
        if (ficha instanceof Rey) {
            int xRey = ficha.getPosicionX();
            int yRey = ficha.getPosicionY();

            // Verificar todas las piezas enemigas en el tablero
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    Fichas piezaEnemiga = getFicha(i, j);
                    if (piezaEnemiga != null && !piezaEnemiga.getColor().equals(ficha.getColor())) {
                        // Verificar si la pieza enemiga puede atacar la casilla del rey
                        if (piezaEnemiga.movimientoValido(xRey, yRey)) {
                            return true; // El rey está en jaque
                        }
                    }
                }
            }
        }
        return false; // El rey no está en jaque
    }

    
    
    private Rey obtenerRey(String color) {
    // Recorrer todo el tablero de ajedrez
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            Fichas ficha = getFicha(i, j);  // Asumo que 'getFicha(i, j)' obtiene la pieza en la posición (i, j)
            if (ficha instanceof Rey && ficha.getColor().equals(color)) {
                return (Rey) ficha;  // Si encontramos un rey con el color correspondiente, lo retornamos
            }
        }
    }
    return null;  // Si no se encuentra el rey, retornamos null
}
    // Verificar si es jaque mate
    private boolean esJaqueMate() {
    // Obtener el rey del jugador actual
    Rey rey = obtenerRey(turnoActual.getColorFicha());  // Usamos el color del jugador actual

    // Verificar si el rey está en jaque
    if (rey == null || !estaEnJaque(rey)) {
        return false;  // Si el rey no está en jaque, no puede ser jaque mate
    }

    // Obtener la posición del rey
    int xRey = rey.getPosicionX();
    int yRey = rey.getPosicionY();

    // Verificar si el rey tiene algún movimiento válido para escapar del jaque
    for (int i = -1; i <= 1; i++) {
        for (int j = -1; j <= 1; j++) {
            int xNuevo = xRey + i;
            int yNuevo = yRey + j;

            // Verificar si la nueva posición está dentro del tablero
            if (xNuevo >= 0 && xNuevo < 8 && yNuevo >= 0 && yNuevo < 8) {
                Fichas fichaDestino = getFicha(xNuevo, yNuevo);  // Obtener la ficha en la nueva posición

                // Verificar que el destino no esté ocupado por una pieza del mismo color
                if (fichaDestino == null || !fichaDestino.getColor().equals(turnoActual.getColorFicha())) {
                    // Mover el rey a la nueva posición y verificar si sigue en jaque
                    moverFicha(xRey, yRey, xNuevo, yNuevo);  // Mover la pieza
                    if (!estaEnJaque(rey)) {
                        // Si el rey puede escapar del jaque, no es jaque mate
                        moverFicha(xNuevo, yNuevo, xRey, yRey);  // Deshacer el movimiento
                        return false;
                    }
                    moverFicha(xNuevo, yNuevo, xRey, yRey);  // Deshacer el movimiento
                }
            }
        }
    }

    // Si no hay movimientos válidos para escapar del jaque, es jaque mate
    return true;
}

    // Método para realizar el enroque
    public boolean enrocar(int xRey, int yRey, int xDestinoRey, int yDestinoRey, int xTorre, int yTorre) {
        Fichas rey = getFicha(xRey, yRey);
        Fichas torre = getFicha(xTorre, yTorre);

        if (rey instanceof Rey && torre instanceof Torre) {
            Rey reyJugador = (Rey) rey;
            Torre torreJugador = (Torre) torre;

            if (reyJugador.puedeEnrocar(xDestinoRey, yDestinoRey, this) && !torreJugador.seHaMovido()) {
                moverFicha(xRey, yRey, xDestinoRey, yDestinoRey);

                int xDestinoTorre = (yDestinoRey == 6) ? 5 : 3;
                moverFicha(xTorre, yTorre, xDestinoTorre, yTorre);

                ((Rey) rey).moverRey(xDestinoRey, yDestinoRey);
                torreJugador.moverTorre(xDestinoTorre, yTorre);

                return true;
            }
        }
        return false;
    }

    // Mostrar el nombre del jugador que tiene el turno
    public String obtenerJugadorTurno() {
        return turnoActual.getNombreJugador();
    }

    private List<Fichas> piezasCapturadasBlanco;
    private List<Fichas> piezasCapturadasNegro;

    public void actualizarPiezasCapturadas() {
        // Recorre todas las casillas del tablero para verificar si alguna pieza ha sido capturada
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Fichas ficha = getFicha(i, j);
                if (ficha != null) {
                    // Si es una pieza capturada, agregarla a la lista correspondiente
                    if (ficha.getColor().equals("blanco") && !piezaCapturada(ficha)) {
                        piezasCapturadasBlanco.add(ficha);
                    } else if (ficha.getColor().equals("negro") && !piezaCapturada(ficha)) {
                        piezasCapturadasNegro.add(ficha);
                    }
                }
            }
        }
    }

    private boolean piezaCapturada(Fichas ficha) {
        return ficha == null || !getFicha(ficha.getPosicionX(), ficha.getPosicionY()).equals(ficha);
    }

    boolean esAtacada(int posicionX, int posicionY) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Fichas ficha = getFicha(i, j);
                if (ficha != null && !ficha.getColor().equals(turnoActual.getColorFicha())) {
                    if (ficha.movimientoValido(posicionX, posicionY)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
