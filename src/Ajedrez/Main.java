
package Ajedrez;

import Ajedrez.util.FlowController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FlowController.getInstance().InitializeFlow(stage, null);

        stage.getIcons().add(new Image("/Ajedrez/resources/iconoProyecto.png"));//Establece el icono del programa.
        stage.setTitle("Juego de Ajedrez");
        FlowController.getInstance().goMain("Base");
        FlowController.getInstance().goView("InicioView");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
