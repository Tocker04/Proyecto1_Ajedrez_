package Ajedrez.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TableroController implements Initializable {

    @FXML
    private Pane A1, A2, A3, A4, A5, A6, A7, A8;
    @FXML
    private Pane B1, B2, B3, B4, B5, B6, B7, B8;
    @FXML
    private Pane C1, C2, C3, C4, C5, C6, C7, C8;
    @FXML
    private Pane D1, D2, D3, D4, D5, D6, D7, D8;
    @FXML
    private Pane E1, E2, E3, E4, E5, E6, E7, E8;
    @FXML
    private Pane F1, F2, F3, F4, F5, F6, F7, F8;
    @FXML
    private Pane G1, G2, G3, G4, G5, G6, G7, G8;
    @FXML
    private Pane H1, H2, H3, H4, H5, H6, H7, H8;

    @FXML
    private VBox capturasBlancas, capturasNegras;
    @FXML
    private Label jugadoractual, tiempoBlancas, tiempoNegras;

    private boolean turnoBlanco = true;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarPiezas();
        colocarPiezasIniciales();
        jugadoractual.setText("Blancas");
    }

    private void inicializarPiezas() {
        // Crear instancias de cada pieza con su respectivo color
        // Crear y asignar las imágenes de las piezas
    }

    private void colocarPiezasIniciales() {
        A2.getChildren().add(crearImagenPeonBlanco());
        B2.getChildren().add(crearImagenPeonBlanco());
        // Continuar con el resto de las piezas iniciales...
    }

    private ImageView crearImagenPeonBlanco() {
        ImageView imageView = new ImageView(new Image("/resources/Peon_Blanco.png"));
        imageView.setUserData("Blanco"); // Asigna el color de la pieza como userData
        return imageView;
    }

    private ImageView crearImagenPeonNegro() {
        ImageView imageView = new ImageView(new Image("/resources/Peon_Negro.png"));
        imageView.setUserData("Negro"); // Asigna el color de la pieza como userData
        return imageView;
    }

    private ImageView crearImagenTorreBlanca() {
        ImageView imageView = new ImageView(new Image("/resources/Torre_Blanca.png"));
        imageView.setUserData("Blanco"); // Asigna el color de la pieza como userData
        return imageView;
    }

    private ImageView crearImagenTorreNegra() {
        ImageView imageView = new ImageView(new Image("/resources/Torre_Negra.png"));
        imageView.setUserData("Negro"); // Asigna el color de la pieza como userData
        return imageView;
    }

    // Métodos similares para crear las imágenes de otras piezas...

    // Cambia el turno entre blancas y negras
    private void cambiarTurno() {
        turnoBlanco = !turnoBlanco;
        jugadoractual.setText(turnoBlanco ? "Blancas" : "Negras");
    }

    // Mueve una pieza de un Pane a otro
    public boolean moverPieza(Pane origen, Pane destino) {
        if (esMovimientoValido(origen, destino)) {
            if (!destino.getChildren().isEmpty()) {
                capturarPieza(destino); // Captura si hay una pieza enemiga en el destino
            }
            Node pieza = origen.getChildren().get(0);
            origen.getChildren().clear();
            destino.getChildren().add(pieza);
            cambiarTurno();
            return true;
        } else {
            System.out.println("Movimiento no válido.");
            return false;
        }
    }

    private void capturarPieza(Pane destino) {
        Node pieza = destino.getChildren().get(0);
        destino.getChildren().clear();
        if (turnoBlanco) {
            capturasNegras.getChildren().add(pieza);
        } else {
            capturasBlancas.getChildren().add(pieza);
        }
    }

    // Verifica si el movimiento es válido
    private boolean esMovimientoValido(Pane origen, Pane destino) {
        if (origen.getChildren().isEmpty()) {
            System.out.println("No hay pieza en la casilla de origen.");
            return false;
        }

        Node pieza = origen.getChildren().get(0);
        if (pieza instanceof ImageView) {
            ImageView imagenPieza = (ImageView) pieza;
            String colorPieza = obtenerColorPieza(imagenPieza);

            if ((turnoBlanco && !colorPieza.equals("Blanco")) || (!turnoBlanco && !colorPieza.equals("Negro"))) {
                System.out.println("No es el turno de esta pieza.");
                return false;
            }

            if (!destino.getChildren().isEmpty()) {
                ImageView piezaDestino = (ImageView) destino.getChildren().get(0);
                String colorDestino = obtenerColorPieza(piezaDestino);
                if (colorPieza.equals(colorDestino)) {
                    System.out.println("No puedes mover a una casilla ocupada por una pieza de tu mismo color.");
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    private String obtenerColorPieza(ImageView imagenPieza) {
        // Recupera el color de la pieza usando el userData
        return (String) imagenPieza.getUserData();
    }

    private int obtenerFila(Pane pane) {
        // Implementar lógica para obtener la fila del tablero basado en el ID del pane
        return 0; // Ejemplo, cambiar según la lógica real
    }

    private int obtenerColumna(Pane pane) {
        // Implementar lógica para obtener la columna del tablero basado en el ID del pane
        return 0; // Ejemplo, cambiar según la lógica real
    }
}