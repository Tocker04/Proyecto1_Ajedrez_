/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez;

import Ajedrez.util.FlowController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FlowController.getInstance().InitializeFlow(stage, null);

        //stage.getIcons().add(new Image("chess/resources/icon_.png"));//Establece el icono del programa.
        stage.setTitle("Esqueleto");
        FlowController.getInstance().goMain("Base");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
