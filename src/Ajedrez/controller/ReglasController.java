
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
public class ReglasController extends Controller implements Initializable {

    @FXML
    private TextArea txAreaReglas;
    @FXML
    private Button btnVolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Mostrar las reglas
        txAreaReglas.setText(
            "Objetivo del juego: Derrotar al oponente dando jaque mate a su rey, es decir, colocar al rey del oponente en una posición donde no pueda escapar de un ataque.\n\n" +
            
            "Movimientos de piezas:\n" +
            
            "Peón: Mueve una casilla hacia adelante, pero captura en diagonal. En su primer movimiento, puede avanzar dos casillas.\n" +
            
            "Torre: Mueve en línea recta, ya sea horizontal o verticalmente.\n" +
            
            "Alfil: Mueve en diagonal tantas casillas como desee.\n" +
            
            "Dama (Reina): Combina los movimientos de la torre y el alfil; puede moverse en cualquier dirección (horizontal, vertical, o diagonal).\n" +
            
            "Rey: Mueve una casilla en cualquier dirección.\n" +
            
            "Caballo: Mueve en forma de 'L' (dos casillas en una dirección y luego una perpendicularmente). Puede saltar sobre otras piezas.\n\n" +
            
           "Enroque: Movimiento especial del rey y una de las torres. El rey mueve dos casillas hacia la torre,"
         + " que luego salta por encima del rey y se coloca junto a él. Esto solo es posible si:\n" +
            " - Ni el rey ni la torre han movido antes.\n" +
            " - No hay piezas entre el rey y la torre.\n" +
            " - El rey no está en jaque, ni las casillas por las que pasa o donde aterriza están atacadas.\n\n" +
            "Captura al paso (en passant): Si un peón mueve dos casillas desde su posición inicial y aterriza junto a un peón enemigo,"
         + " el peón enemigo puede capturarlo 'al paso' como si hubiera movido solo una casilla."
         
         + " Esto debe realizarse inmediatamente en el turno siguiente.\n" +
            
            "Promoción de peón: Cuando un peón llega al otro extremo del tablero, puede promoverse a dama, torre, alfil o caballo, independientemente de las piezas ya capturadas.\n\n" +
            
            "Jaque y jaque mate:\n" +
            
            "Jaque: El rey está bajo amenaza de ser capturado. Debe moverse, bloquear el ataque o capturar la pieza que lo amenaza.\n" +
           
            "Jaque mate: No hay ninguna opción de escapar del jaque, y el juego termina.\n\n" +
            
            "Tablas (empate): El juego puede terminar en empate en varias circunstancias:\n" +
            " - Ahogado: El jugador no tiene movimientos legales y su rey no está en jaque.\n" +
            " - Repetición de posición: Si la misma posición se repite tres veces con el mismo jugador al turno, cualquiera de los jugadores puede reclamar tablas.\n" +
            " - Regla de los 50 movimientos: Si en 50 movimientos no se ha capturado ninguna pieza ni movido ningún peón, cualquiera de los jugadores puede reclamar tablas.\n" +
            " - Insuficiencia de material: Si ninguna de las partes tiene suficiente material para dar jaque mate, el juego termina en tablas.\n\n" +
            "Estas son las reglas principales. El juego se basa en una mezcla de estrategia, táctica y planificación a largo plazo. ¡Cada partida es única!"
        );
        
    }    

    @Override
    public void initialize() {

    }

    @FXML
    private void onActionVolver(ActionEvent event) {
        FlowController.getInstance().goView("InicioView");
    }
    
}
