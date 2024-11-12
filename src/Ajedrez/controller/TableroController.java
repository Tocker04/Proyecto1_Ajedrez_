package Ajedrez.controller;

import Ajedrez.Jugador;
import ajedrez.controller.Controller;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Kendal
 */
public class TableroController extends Controller implements Initializable {

    @FXML
    private Pane A8;
    @FXML
    private ImageView Torre_negra_izq;
    @FXML
    private Pane A7;
    @FXML
    private ImageView Peon_negro1;
    @FXML
    private Pane A6;
    @FXML
    private Pane A5;
    @FXML
    private Pane A3;
    @FXML
    private Pane A2;
    @FXML
    private ImageView Peon_Blanco1;
    @FXML
    private Pane A1;
    @FXML
    private ImageView Torre_Blanca_izq;
    @FXML
    private Pane A4;
    @FXML
    private Pane B8;
    @FXML
    private ImageView Caballo_negro_izq;
    @FXML
    private Pane B6;
    @FXML
    private Pane B5;
    @FXML
    private Pane B4;
    @FXML
    private Pane B3;
    @FXML
    private Pane B2;
    @FXML
    private ImageView Peon_Blanco2;
    @FXML
    private Pane B1;
    @FXML
    private ImageView Caballo_Blanca_izq;
    @FXML
    private Pane C8;
    @FXML
    private ImageView Alfil_negro_izq;
    @FXML
    private Pane C7;
    @FXML
    private ImageView Peon_negro3;
    @FXML
    private Pane C6;
    @FXML
    private Pane C5;
    @FXML
    private Pane C3;
    @FXML
    private Pane C2;
    @FXML
    private ImageView Peon_Blanco3;
    @FXML
    private Pane C1;
    @FXML
    private ImageView Alfil_Blanca_izq;
    @FXML
    private Pane B7;
    @FXML
    private ImageView Peon_negro2;
    @FXML
    private Pane C4;
    @FXML
    private Pane D8;
    @FXML
    private ImageView Dama_negra;
    @FXML
    private Pane D7;
    @FXML
    private ImageView Peon_negro4;
    @FXML
    private Pane D6;
    @FXML
    private Pane D5;
    @FXML
    private Pane D4;
    @FXML
    private Pane D3;
    @FXML
    private Pane D2;
    @FXML
    private ImageView Peon_Blanco4;
    @FXML
    private Pane D1;
    @FXML
    private ImageView Dama_Blanca;
    @FXML
    private Pane E8;
    @FXML
    private ImageView Rey_negro;
    @FXML
    private Pane E7;
    @FXML
    private ImageView Peon_negro5;
    @FXML
    private Pane E6;
    @FXML
    private Pane E5;
    @FXML
    private Pane E4;
    @FXML
    private Pane E2;
    @FXML
    private ImageView Peon_Blanco5;
    @FXML
    private Pane E1;
    @FXML
    private ImageView Rey_Blanca;
    @FXML
    private Pane F8;
    @FXML
    private ImageView Alfil_negro_der;
    @FXML
    private Pane F7;
    @FXML
    private ImageView Peon_negro6;
    @FXML
    private Pane F6;
    @FXML
    private Pane F5;
    @FXML
    private Pane F4;
    @FXML
    private Pane F3;
    @FXML
    private Pane F2;
    @FXML
    private ImageView Peon_Blanco6;
    @FXML
    private Pane F1;
    @FXML
    private ImageView Alfil_Blanca_der;
    @FXML
    private Pane G8;
    @FXML
    private ImageView Caballo_negro_der;
    @FXML
    private Pane G7;
    @FXML
    private ImageView Peon_negro7;
    @FXML
    private Pane G6;
    @FXML
    private Pane G5;
    @FXML
    private Pane G4;
    @FXML
    private Pane G3;
    @FXML
    private Pane G2;
    @FXML
    private ImageView Peon_Blanco7;
    @FXML
    private Pane G1;
    @FXML
    private ImageView Caballo_Blanca_der;
    @FXML
    private Pane H8;
    @FXML
    private ImageView Torre_negra_der;
    @FXML
    private Pane H7;
    @FXML
    private ImageView Peon_negro8;
    @FXML
    private Pane H6;
    @FXML
    private Pane H5;
    @FXML
    private Pane H4;
    @FXML
    private Pane H3;
    @FXML
    private Pane H2;
    @FXML
    private ImageView Peon_Blanco8;
    @FXML
    private Pane H1;
    @FXML
    private ImageView Torre_Blanca_der;
    @FXML
    private Pane E3;
    @FXML
    private VBox capturasBlancas;
    @FXML
    private VBox capturasNegras;
    @FXML
    private Label jugadoractual;
    @FXML
    private Label tiempoBlancas;
    @FXML
    private Label tiempoNegras;

    /**
     * Initializes the controller class.
     */
  

    @FXML
    private Label lbJugadorNegro; //player con piezas negras
    @FXML
    private Label lbJugadorBlanco; //player con piezas blancas
    @FXML
    private Label lbTiempoBlancas;
    @FXML
    private Label lbTiempoNegras;
    @FXML
    private Label lbActualJugador;
    
    
    private Jugador jugador1;
    private Jugador jugador2;
    private String tiempoPartida;
    boolean turnoBlanco;
    @FXML
    private ImageView Torre_Blanca_der1;
    @FXML
    private ImageView Torre_Blanca_der11;

    @Override
    public void initialize() {
        /*
        // Inicializar eventos de drag-and-drop
        inicializarPiezas();
        
        // Crear los jugadores
        jugador1 = new Jugador("Jugador Blanco", "Blanco"); // Asignar nombre y color
        jugador2 = new Jugador("Jugador Negro", "Negro");

        // Actualizar los labels con los nombres de los jugadores
        lbJugadorBlanco.setText(jugador1.getNombreJugador()); // Nombre jugador blanco
        lbJugadorNegro.setText(jugador2.getNombreJugador()); // Nombre jugador negro
         */
    }

    //@Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicializar eventos de drag-and-drop
        inicializarPiezas();

        // Crear los jugadores
        jugador1 = new Jugador("Jugador Blanco", "Blanco"); // Asignar nombre y color
        jugador2 = new Jugador("Jugador Negro", "Negro");

        // Actualizar los labels con los nombres de los jugadores
        lbJugadorBlanco.setText(jugador1.getNombreJugador()); // Nombre jugador blanco
        lbJugadorNegro.setText(jugador2.getNombreJugador()); // Nombre jugador negro

    }

    private void inicializarPiezas() {
        // Fichas negras
        configurarEventosDeArrastre(Torre_negra_izq);
        configurarEventosDeArrastre(Caballo_negro_izq);
        configurarEventosDeArrastre(Alfil_negro_izq);
        configurarEventosDeArrastre(Dama_negra);
        configurarEventosDeArrastre(Rey_negro);
        configurarEventosDeArrastre(Alfil_negro_der);
        configurarEventosDeArrastre(Caballo_negro_der);
        configurarEventosDeArrastre(Torre_negra_der);

        configurarEventosDeArrastre(Peon_negro1);
        configurarEventosDeArrastre(Peon_negro2);
        configurarEventosDeArrastre(Peon_negro3);
        configurarEventosDeArrastre(Peon_negro4);
        configurarEventosDeArrastre(Peon_negro5);
        configurarEventosDeArrastre(Peon_negro6);
        configurarEventosDeArrastre(Peon_negro7);
        configurarEventosDeArrastre(Peon_negro8);
        //... Configurar arrastre para otras piezas negras

        // Fichas blancas
        configurarEventosDeArrastre(Torre_Blanca_izq);
        configurarEventosDeArrastre(Caballo_Blanca_izq);
        configurarEventosDeArrastre(Alfil_Blanca_izq);
        configurarEventosDeArrastre(Dama_Blanca);
        configurarEventosDeArrastre(Rey_Blanca);
        configurarEventosDeArrastre(Alfil_Blanca_der);
        configurarEventosDeArrastre(Caballo_Blanca_der);
        configurarEventosDeArrastre(Torre_Blanca_der);

        configurarEventosDeArrastre(Peon_Blanco1);
        configurarEventosDeArrastre(Peon_Blanco2);
        configurarEventosDeArrastre(Peon_Blanco3);
        configurarEventosDeArrastre(Peon_Blanco4);
        configurarEventosDeArrastre(Peon_Blanco5);
        configurarEventosDeArrastre(Peon_Blanco6);
        configurarEventosDeArrastre(Peon_Blanco7);
        configurarEventosDeArrastre(Peon_Blanco8);
        //... Configurar arrastre para otras piezas blancas

        configurarEventosParaPanes(A8, A7, A6, A5, A4, A3, A2, A1);
        configurarEventosParaPanes(B8, B7, B6, B5, B4, B3, B2, B1);
        configurarEventosParaPanes(C8, C7, C6, C5, C4, C3, C2, C1);
        configurarEventosParaPanes(D8, D7, D6, D5, D4, D3, D2, D1);
        configurarEventosParaPanes(E8, E7, E6, E5, E4, E3, E2, E1);
        configurarEventosParaPanes(F8, F7, F6, F5, F4, F3, F2, F1);
        configurarEventosParaPanes(G8, G7, G6, G5, G4, G3, G2, G1);
        configurarEventosParaPanes(H8, H7, H6, H5, H4, H3, H2, H1);

    }

    private void configurarEventosDeArrastre(ImageView ficha) {
        ficha.setOnDragDetected(event -> {
            Dragboard db = ficha.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putImage(ficha.getImage());
            db.setContent(content);
            event.consume();
        });

        ficha.setOnDragOver(event -> {
            if (event.getGestureSource() != ficha && event.getDragboard().hasImage()) {
                event.acceptTransferModes(TransferMode.MOVE);
            }
            event.consume();
        });

        ficha.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            if (db.hasImage()) {
                // Obtén el ImageView del destino (casilla)
                ImageView destino = (ImageView) event.getGestureTarget();
                destino.setImage(db.getImage());
                ficha.setImage(null); // Remueve la imagen de la casilla original
                event.setDropCompleted(true);
            } else {
                event.setDropCompleted(false);
            }
            event.consume();
        });
    }

    private void configurarEventosParaPanes(Pane... panes) {
        for (Pane pane : panes) {
            pane.setOnDragOver(event -> {
                if (event.getGestureSource() != pane && event.getDragboard().hasImage()) {
                    event.acceptTransferModes(TransferMode.MOVE);
                }
                event.consume();
            });

            pane.setOnDragDropped(event -> {
                Dragboard db = event.getDragboard();
                if (db.hasImage()) {
                    ImageView sourceFicha = (ImageView) event.getGestureSource();

                    // Obtener el ImageView que estaba en el destino, si es que hay uno
                    ImageView targetFicha = (ImageView) pane.getChildren().get(0);

                    // Si ya hay una ficha en el destino, y es una ficha opuesta, la capturamos
                    if (targetFicha != null && esPiezaOpuesta(sourceFicha, targetFicha)) {
                        capturarPieza(targetFicha);
                    }

                    // Mover la ficha al nuevo Pane
                    pane.getChildren().add(sourceFicha);  // Agregar la ficha al Pane destino
                    targetFicha.setImage(db.getImage());  // Actualizar la imagen en el destino

                    // Limpiar la imagen del Pane de origen
                    ((Pane) sourceFicha.getParent()).getChildren().remove(sourceFicha);

                    // Cambiar el turno después de un movimiento exitoso
                    cambiarTurno();

                    event.setDropCompleted(true);
                } else {
                    event.setDropCompleted(false);
                }
                event.consume();
            });
        }
    }

    private boolean esPiezaBlanca(ImageView ficha) {
        return ficha.getId() != null && ficha.getId().contains("Blanca");
    }

    private boolean esPiezaNegra(ImageView ficha) {
        return ficha.getId() != null && ficha.getId().contains("negra");
    }

    private boolean esPiezaOpuesta(ImageView source, ImageView target) {
        return esPiezaBlanca(source) != esPiezaBlanca(target);
    }

    private void capturarPieza(ImageView piezaCapturada) {
    if (piezaCapturada != null) {
        // Identifica si la pieza es blanca o negra y agrégala a la lista correspondiente
        if (esPiezaBlanca(piezaCapturada)) {
            capturasBlancas.getChildren().add(piezaCapturada);
        } else {
            capturasNegras.getChildren().add(piezaCapturada);
        }
    }
}

    private void cambiarTurno() {
        turnoBlanco = !turnoBlanco; // Cambia el turno usando la variable de instancia
        jugadoractual.setText(turnoBlanco ? "Turno: Blancas" : "Turno: Negras");
    }

    public void setParams(HashMap<String, Object> params) {
        if (params != null) {
            this.jugador1 = (Jugador) params.get("jugador1");
            this.jugador2 = (Jugador) params.get("jugador2");
            Object tiempoPartidaObj = params.get("tiempoPartida");
            if (tiempoPartidaObj != null) {
                this.tiempoPartida = String.valueOf(tiempoPartidaObj);
            } else {
                this.tiempoPartida = "No especificado"; // o algún valor predeterminado
            }

        }

        // Suponemos que el jugador1 tiene las piezas blancas y el jugador2 las negras
        if (jugador1.getColorFicha().equals("Blancas")) {
            lbJugadorBlanco.setText("Jugador Blanco: " + jugador1.getNombreJugador());
            lbJugadorNegro.setText("Jugador Negro: " + jugador2.getNombreJugador());
        } else {
            lbJugadorBlanco.setText("Jugador Blanco: " + jugador2.getNombreJugador());
            lbJugadorNegro.setText("Jugador Negro: " + jugador1.getNombreJugador());
        }

        // Imprimir los nombres de los jugadores y el tiempo de la partida (opcional)
        System.out.println("Jugador 1: " + jugador1.getNombreJugador());
        System.out.println("Jugador 2: " + jugador2.getNombreJugador());
        System.out.println("Tiempo de partida: " + tiempoPartida);

        actualizarVista();
    }

    private void actualizarVista() {
        lbJugadorBlanco.setText("Jugador Blanco: " + jugador1.getNombreJugador());
        lbJugadorNegro.setText("Jugador Negro: " + jugador2.getNombreJugador());

        String tiempoTexto = tiempoPartida + ":00 ";
        lbTiempoBlancas.setText(tiempoTexto);  // Mostrando el tiempo en el label correspondiente a las blancas
        lbTiempoNegras.setText(tiempoTexto);   // Mostrando el tiempo en el label correspondiente a las negras

        inicializarTablero();
    }

    private void inicializarTablero() {
        // Configurar el tablero con las piezas en sus posiciones iniciales
        System.out.println("Tablero inicializado con jugadores: " + jugador1.getNombreJugador() + " y " + jugador2.getNombreJugador());
    }

    @FXML
    private void setOnMouseClickedPieza(MouseEvent event) {
    }

    @FXML
    private void setOnMouseDraggedPieza(MouseEvent event) {
    }

    @FXML
    private void setOnMouseReleasedPieza(MouseEvent event) {
    }

}