
package Ajedrez.controller;

import ajedrez.controller.Controller;
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

/**
 * FXML Controller class
 *
 * @author User
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
// Inicialización de las piezas con sus imágenes y posiciones iniciales
        inicializarPiezas();
        colocarPiezasIniciales();
        jugadoractual.setText("Blancas");
    }    

    @Override
    public void initialize() {
    
    }

    private void inicializarPiezas() {
     // Crear instancias de cada pieza con su respectivo color
        PeonBlanco1 = new Peon("Blanco");
        PeonBlanco2 = new Peon("Blanco");
        PeonBlanco3 = new Peon("Blanco");
        PeonBlanco4 = new Peon("Blanco");
        PeonBlanco5 = new Peon("Blanco");
        PeonBlanco6 = new Peon("Blanco");
        PeonBlanco7 = new Peon("Blanco");
        PeonBlanco8 = new Peon("Blanco");
        
        PeonNegro1 = new Peon("Negro");
        PeonNegro2 = new Peon("Negro");
        PeonNegro3 = new Peon("Negro");
        PeonNegro4 = new Peon("Negro");
        PeonNegro5 = new Peon("Negro");
        PeonNegro6 = new Peon("Negro");
        PeonNegro7 = new Peon("Negro");
        PeonNegro8 = new Peon("Negro");
        
        TorreBlancaIzq = new Torre("Blanco");
        TorreBlancaDer = new Torre("Blanco");
        TorreNegraIzq = new Torre("Negro");
        TorreNegraDer = new Torre("Negro");
        
        CaballoBlancoIzq = new Caballo("Blanco");
        CaballoBlancoDer = new Caballo("Blanco");
        CaballoNegroIzq = new Caballo("Negro");
        CaballoNegroDer = new Caballo("Negro");

        AlfilBlancoIzq = new Alfil("Blanco");
        AlfilBlancoDer = new Alfil("Blanco");
        AlfilNegroIzq = new Alfil("Negro");
        AlfilNegroDer = new Alfil("Negro");
        
        DamaBlanca = new Reina("Blanco");
        DamaNegra = new Reina("Negro");
        
        ReyBlanco = new Rey("Blanco");
        ReyNegro = new Rey("Negro");
    }

    private void colocarPiezasIniciales() {
    // Colocar las piezas blancas
        A2.getChildren().add(Peon_Blanco1);
        B2.getChildren().add(crearImagenPeonBlanco());
        C2.getChildren().add(crearImagenPeonBlanco());
        D2.getChildren().add(crearImagenPeonBlanco());
        E2.getChildren().add(crearImagenPeonBlanco());
        F2.getChildren().add(crearImagenPeonBlanco());
        G2.getChildren().add(crearImagenPeonBlanco());
        H2.getChildren().add(crearImagenPeonBlanco());
        
        A1.getChildren().add(crearImagenTorreBlanca());
        H1.getChildren().add(crearImagenTorreBlanca());
        B1.getChildren().add(crearImagenCaballoBlanco());
        G1.getChildren().add(crearImagenCaballoBlanco());
        C1.getChildren().add(crearImagenAlfilBlanco());
        F1.getChildren().add(crearImagenAlfilBlanco());
        D1.getChildren().add(crearImagenDamaBlanca());
        E1.getChildren().add(crearImagenReyBlanco());

        // Colocar las piezas negras
        A7.getChildren().add(crearImagenPeonNegro());
        B7.getChildren().add(crearImagenPeonNegro());
        C7.getChildren().add(crearImagenPeonNegro());
        D7.getChildren().add(crearImagenPeonNegro());
        E7.getChildren().add(crearImagenPeonNegro());
        F7.getChildren().add(crearImagenPeonNegro());
        G7.getChildren().add(crearImagenPeonNegro());
        H7.getChildren().add(crearImagenPeonNegro());

        A8.getChildren().add(crearImagenTorreNegra());
        H8.getChildren().add(crearImagenTorreNegra());
        B8.getChildren().add(crearImagenCaballoNegro());
        G8.getChildren().add(crearImagenCaballoNegro());
        C8.getChildren().add(crearImagenAlfilNegro());
        F8.getChildren().add(crearImagenAlfilNegro());
        D8.getChildren().add(crearImagenDamaNegra());
        E8.getChildren().add(crearImagenReyNegro());
    }

    private ImageView crearImagenPeonBlanco() {
        return new ImageView(new Image("/resources/Peon_Blanco.png"));
    }

    private ImageView crearImagenPeonNegro() {
        return new ImageView(new Image("/path/to/Peon_Negro.png"));
    }

    private ImageView crearImagenTorreBlanca() {
        return new ImageView(new Image("/path/to/Torre_Blanca.png"));
    }

    private ImageView crearImagenTorreNegra() {
        return new ImageView(new Image("/path/to/Torre_Negra.png"));
    }

    private ImageView crearImagenCaballoBlanco() {
        return new ImageView(new Image("/path/to/Caballo_Blanco.png"));
    }

    private ImageView crearImagenCaballoNegro() {
        return new ImageView(new Image("/path/to/Caballo_Negro.png"));
    }

    private ImageView crearImagenAlfilBlanco() {
        return new ImageView(new Image("/path/to/Alfil_Blanco.png"));
    }

    private ImageView crearImagenAlfilNegro() {
        return new ImageView(new Image("/path/to/Alfil_Negro.png"));
    }

    private ImageView crearImagenDamaBlanca() {
        return new ImageView(new Image("/path/to/Dama_Blanca.png"));
    }

    private ImageView crearImagenDamaNegra() {
        return new ImageView(new Image("/path/to/Dama_Negra.png"));
    }

    private ImageView crearImagenReyBlanco() {
        return new ImageView(new Image("/path/to/Rey_Blanco.png"));
    }

    private ImageView crearImagenReyNegro() {
        return new ImageView(new Image("/path/to/Rey_Negro.png"));
    
    }
    private boolean turnoBlanco = true;
    // Mueve una pieza de un Pane a otro
    public boolean moverPieza(Pane origen, Pane destino) {
        if (esMovimientoValido(origen, destino)) {
            if (!destino.getChildren().isEmpty()) {
                capturarPieza(destino); // Captura si hay una pieza enemiga en el destino
            }
            Node pieza = origen.getChildren().get(0); // Obtener la pieza del origen
            origen.getChildren().clear(); // Quitar pieza del origen
            destino.getChildren().add(pieza); // Colocar pieza en el destino
            cambiarTurno();
            return true;
        } else {
            System.out.println("Movimiento no válido.");
            return false;
        }
    }

    // Verifica si el movimiento es válido
    private boolean esMovimientoValido(Pane origen, Pane destino) {
        if (origen.getChildren().isEmpty()) {
            System.out.println("No hay pieza en la casilla de origen.");
            return false; // No hay pieza para mover
        }

        Node pieza = origen.getChildren().get(0);
        if (pieza instanceof ImageView) {
            ImageView imagenPieza = (ImageView) pieza;
            String colorPieza = obtenerColorPieza(imagenPieza);

            // Verificar si es el turno de la pieza correcta (blanca o negra)
            if ((turnoBlanco && !colorPieza.equals("Blanco")) || (!turnoBlanco && !colorPieza.equals("Negro"))) {
                System.out.println("No es el turno de esta pieza.");
                return false;
            }

            // Verificar que no se mueva a una casilla ocupada por otra pieza del mismo color
            if (!destino.getChildren().isEmpty()) {
                ImageView piezaDestino = (ImageView) destino.getChildren().get(0);
                String colorDestino = obtenerColorPieza(piezaDestino);
                if (colorPieza.equals(colorDestino)) {
                    System.out.println("No puedes mover a una casilla ocupada por una pieza de tu mismo color.");
                    return false;
                }
            }

            // Aquí debes agregar lógica para cada tipo de pieza (peón, torre, caballo, etc.)
            if (colorPieza.equals("Blanco") && esPeon(imagenPieza)) {
                return movimientoValidoPeon(origen, destino, colorPieza);
            }
            
            return true; // Movimiento válido básico
        }
        return false;
    }

    // Lógica de movimiento específico para peones
    private boolean movimientoValidoPeon(Pane origen, Pane destino, String colorPieza) {
        int filaOrigen = obtenerFila(origen);
        int filaDestino = obtenerFila(destino);
        
        if (colorPieza.equals("Blanco")) {
            return filaDestino == filaOrigen + 1; // Peón blanco avanza hacia adelante
        } else {
            return filaDestino == filaOrigen - 1; // Peón negro avanza hacia atrás
        }
    }

    // Alterna el turno entre jugadores
    private void cambiarTurno() {
        turnoBlanco = !turnoBlanco;
        jugadoractual.setText(turnoBlanco ? "Blancas" : "Negras");
    }

    // Captura una pieza (mueve al área de capturas)
    private void capturarPieza(Pane destino) {
        if (!destino.getChildren().isEmpty()) {
            Node piezaCapturada = destino.getChildren().get(0);
            destino.getChildren().clear(); // Quitar pieza capturada del tablero
            
            if (turnoBlanco) {
                capturasNegras.getChildren().add(piezaCapturada); // Agregar a capturas negras si es turno blanco
            } else {
                capturasBlancas.getChildren().add(piezaCapturada); // Agregar a capturas blancas si es turno negro
            }
        }
    }

    // Helper: Obtener el color de la pieza desde su imagen
private String obtenerColorPieza(ImageView imagenPieza) {
    if (imagenPieza.getImage() == null) {
        return ""; // No hay imagen
    }

    String rutaImagen = imagenPieza.getImage().getUrl();
    if (rutaImagen != null && rutaImagen.contains("Blanco")) {
        return "Blanco";
    } else if (rutaImagen != null && rutaImagen.contains("Negro")) {
        return "Negro";
    } else {
        return ""; // Color desconocido
    }
}

    // Helper: Verifica si la imagen corresponde a un peón (a partir del nombre de la imagen)
   private boolean esPeon(ImageView imagenPieza) {
    String rutaImagen = imagenPieza.getImage().getUrl();
    
    // Asegúrate de que la ruta no sea nula y contiene "Peon" en cualquier parte del nombre del archivo
    return rutaImagen != null && rutaImagen.toLowerCase().contains("peon");
}
    // Helper: Obtener el número de fila basado en el nombre del Pane (e.g., A1 -> 1, A8 -> 8)
    private int obtenerFila(Pane casilla) {
        String id = casilla.getId();
        return Character.getNumericValue(id.charAt(1)); // Suponiendo IDs como A1, B8, etc.
    }
}

