/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez.util;

import Ajedrez.Main;
import ajedrez.controller.Controller;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Ivannia Rojas
 */
public class FlowController {

    private static FlowController INSTANCE = null;
    private static Stage mainStage;
    private static ResourceBundle idioma;
    private static HashMap<String, FXMLLoader> loaders = new HashMap<>();
    
    //para guardar los parametros que se pasen entre vistas
    private static HashMap<String, Object> params = new HashMap<>();

    public void addParam(String key, Object value) {
        params.put(key, value);
    }

    public Object getParam(String key) {
        return params.get(key);
    }



    private FlowController() {
    }

    private static void createInstance() {
        if (INSTANCE == null) {
            synchronized (FlowController.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlowController();
                }
            }
        }
    }

    public static FlowController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void InitializeFlow(Stage stage, ResourceBundle idioma) {
        getInstance();
        this.mainStage = stage;
        this.idioma = idioma;
    }

    private FXMLLoader getLoader(String name) {
        FXMLLoader loader = loaders.get(name);
        if (loader == null) {
            synchronized (FlowController.class) {
                if (loader == null) {
                    try {
                        loader = new FXMLLoader(Main.class.getResource("view/" + name + ".fxml"), this.idioma);
                        loader.load();
                        loaders.put(name, loader);
                    } catch (Exception ex) {
                        loader = null;
                        java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Creando loader [" + name + "].", ex);
                    }
                }
            }
        }
        return loader;
    }

    public void goMain(String nombreBase) {
        try {
            this.mainStage.setScene(new Scene(getLoader(nombreBase).getRoot()));
            this.mainStage.show();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Error inicializando la vista base.", ex);
        }
    }

    public void goView(String viewName) {
        goView(viewName, "Center", null, null);//aca hice cambio
    }

    public void goView(String viewName, String accion) {
        goView(viewName, "Center", accion, null);//aca hice cambio
    }

    public void goView(String viewName, String location, String accion, HashMap<String, Object> params) { //aca hice cambio
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setAccion(accion);
        controller.addParams(params); // Agrega los parámetros al controlador //aca hice cambio
        controller.initialize();
        Stage stage = controller.getStage();
        if (stage == null) {
            stage = this.mainStage;
            controller.setStage(stage);
        }
        switch (location) {
            case "Center":
                /*((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().clear();
			((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().add(loader.getRoot()); */
                ((StackPane) ((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().get(1)).getChildren().clear();
                ((StackPane) ((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().get(1)).getChildren().add(loader.getRoot());
                /*((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().get(1);
			((StackPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().get(1);*/

                //((StackPane)((VBox)((StackPane)principal.getScene().getRoot()).getChildren().get(1)).getChildren().get(1)).getChildren().clear();
                //((StackPane)((VBox)((StackPane)principal.getScene().getRoot()).getChildren().get(1)).getChildren().get(1)).getChildren().add(pantalla.getRoot());
                break;
            case "Top":
                /*((VBox) ((BorderPane) stage.getScene().getRoot()).getTop()).getChildren().clear();
				((StackPane)stage.getScene().getRoot()).getChildren().clear();
                ((VBox) ((BorderPane) stage.getScene().getRoot()).getTop()).getChildren().add(loader.getRoot());*/
                break;
            case "Bottom":
                break;
            case "Right":
                break;
            case "Left":
                break;
            default:
                break;
        }
    }

    public void goViewInStage(String viewName, Stage stage) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setStage(stage);
        stage.getScene().setRoot(loader.getRoot());
    }

    public void goViewInWindow(String viewName) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        // stage.getIcons().add(new Image("unaplanilla2/resources/Agregar-48.png"));
        //stage.setTitle(" prueba");
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void goViewInWindowModal(String viewName, Stage parentStage, Boolean resizable) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        //stage.getIcons().add(new Image("unaplanilla2/resources/Agregar-48.png"));
        // stage.setTitle("prueba");
        stage.setResizable(resizable);
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(parentStage);
        stage.centerOnScreen();
        stage.showAndWait();

    }

    public Controller getController(String viewName) {
        return getLoader(viewName).getController();
    }

    public static void setIdioma(ResourceBundle idioma) {
        FlowController.idioma = idioma;
    }

    public void initialize() {
        this.loaders.clear();
    }

    public void salir() {
        this.mainStage.close();
    }

}
