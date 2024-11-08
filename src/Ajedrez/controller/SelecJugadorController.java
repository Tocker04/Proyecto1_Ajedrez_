
package Ajedrez.controller;

import Ajedrez.util.FlowController;
import java.net.URL;
import ajedrez.controller.Controller;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Evans
 */
public class SelecJugadorController extends Controller implements Initializable {

    @FXML
    private ToggleGroup EscogerJugador;
    @FXML
    private TextField txtNombreJugador;
    @FXML
    private TextField txtTiempoPartida;
    @FXML
    private Button btnJugarTablero;
    @FXML
    private Button btnGuardarSelec;
    @FXML
    private RadioButton rbfichaB;
    @FXML
    private RadioButton rbfichaN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
   
    }

    @FXML
    private void onActionJugarSelec(ActionEvent event) {
        FlowController.getInstance().goView("TableroView");
    }

    @FXML
    private void onActionGuardarSelec(ActionEvent event) {
    }
    
}
