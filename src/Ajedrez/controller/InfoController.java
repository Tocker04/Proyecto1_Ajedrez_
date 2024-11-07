
package Ajedrez.controller;

import Ajedrez.util.FlowController;
import ajedrez.controller.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InfoController extends Controller implements Initializable {

    @FXML
    private Button btnVolver_i;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //txtAreaInfo.setText("");
        
    }    

    @FXML
    private void onActionVolver_i(ActionEvent event) {
        FlowController.getInstance().goView("InicioView");
    }

    @Override
    public void initialize() {
   
    }
    
}
