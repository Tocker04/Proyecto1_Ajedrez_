
package Ajedrez.controller;

import ajedrez.controller.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
    @Override
    public void initialize() {
   
    }
    
}
