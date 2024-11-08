
package Ajedrez.controller;

import Ajedrez.util.FlowController;
import ajedrez.controller.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


/**
 * FXML Controller class
 *
 * @author Evans
 */
public class InicioController extends Controller implements Initializable {

    @FXML
    private Button btnJugar;
    @FXML
    private Button btnReglas;
    @FXML
    private Button btnInfoNosotros;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionJugar(ActionEvent event) {
        FlowController.getInstance().goView("SelecJugadorView");
    }

    @FXML
    private void onActionReglas(ActionEvent event) {
        FlowController.getInstance().goView("ReglasView");
    }

    @FXML
    private void onActionVerInfo(ActionEvent event) {
        FlowController.getInstance().goView("InfoView");
    }

    @Override
    public void initialize() {
   
    }
    
}
