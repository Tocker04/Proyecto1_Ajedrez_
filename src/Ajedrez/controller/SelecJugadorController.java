
package Ajedrez.controller;
import Ajedrez.Jugador;
import Ajedrez.util.FlowController;
import Ajedrez.util.Mensaje;
import java.net.URL;
import ajedrez.controller.Controller;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
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

    private Jugador jugador1;
    private Jugador jugador2;
    private boolean isJugador1Saved = false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
   
    }

    @FXML
    private void onActionJugarSelec(ActionEvent event) {
        // Validar que se haya configurado el tiempo de partida
        String tiempoStr = txtTiempoPartida.getText();

        if (tiempoStr.isEmpty()) {
            Mensaje.show(Alert.AlertType.ERROR, "Error", "Debe ingresar el tiempo en minutos para la partida.");
            return;
        }

        try {
            int tiempoPartida = Integer.parseInt(tiempoStr);
            if (tiempoPartida <= 0) {
                Mensaje.show(Alert.AlertType.ERROR, "Error", "El tiempo debe ser un valor positivo.");
                return;
            }

            // Si el tiempo es válido, mostrar mensaje de confirmación
            Mensaje.show(Alert.AlertType.INFORMATION, "Tiempo configurado", "El tiempo se configuró correctamente.");

            // Cambiar a la vista del tablero
            FlowController.getInstance().goView("TableroView");

        } catch (NumberFormatException e) {
            Mensaje.show(Alert.AlertType.ERROR, "Error", "Ingrese un número válido para el tiempo.");
        }
    }

    @FXML
private void onActionGuardarSelec(ActionEvent event) {
    String nombre = txtNombreJugador.getText();
    String colorFicha = rbfichaB.isSelected() ? "Blancas" : "Negras";

    if (nombre.isEmpty()) {
        mostrarMensaje("Error", "Debe ingresar el nombre del jugador.");
        return;
    }

    if (!isJugador1Saved) {
        // Guardamos datos para el Jugador 1
        jugador1 = new Jugador(nombre, colorFicha);
        isJugador1Saved = true;
        mostrarMensaje("Éxito", "El jugador 1 se guardó correctamente.");
        txtNombreJugador.clear();

        // Desactivamos la selección del color elegido para el Jugador 2
        if (colorFicha.equals("Blancas")) {
            rbfichaB.setDisable(true);
            rbfichaN.setSelected(true);
        } else {
            rbfichaN.setDisable(true);
            rbfichaB.setSelected(true);
        }
    } else {
        // Guardamos datos para el Jugador 2
        jugador2 = new Jugador(nombre, colorFicha.equals("Blancas") ? "Negras" : "Blancas");
        mostrarMensaje("Éxito", "El jugador 2 se guardó correctamente.");

        // Desactivamos el botón de guardar para evitar cambios adicionales
        btnGuardarSelec.setDisable(true);
    }

}

     private void mostrarMensaje(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    
}
