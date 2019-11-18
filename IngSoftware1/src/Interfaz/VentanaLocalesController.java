/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaLocalesController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private ImageView btnAtras2;
    

    

    
    /**
     * Initializes the controller class.
     */
    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
     /* public void start(Stage stage) {
        // create web engine and view
        final WebEngine webEngine = new WebEngine(getClass().getResource("googlemap.html").toString());
        final WebView webView = new WebView(webEngine);
        // create scene
        stage.setTitle("Web Map");
        Scene scene = new Scene(webView,1000,700, Color.web("#666970"));
        stage.setScene(scene);
        // show stage
        stage.setVisible(true);
    }
 
    static { // use system proxy settings when standalone application
        System.setProperty("java.net.useSystemProxies", "true");
    }*/

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }
    

    
    
   
 
    
}
