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
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class LocalController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnAtras2;
    @FXML
    private ImageView btnMenu;
    @FXML
    private WebView webView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /*WebEngine webEngine = webView.getEngine();
       webEngine.load("mapaaa.html");

        StackPane root = new StackPane();
        root.getChildren().add(webView);

        Scene scene = new Scene(root, 300, 250);
        
        Main.ventana.setScene(scene);*/
        
        //webView.getEngine().load(this.getClass().getResource("mapaaa.html").toExternalForm());
        //webView.loadRequest(NSURLRequest(URL: NSURL(fileURLWithPath: NSBundle.mainBundle().pathForResource("mapa", ofType: "html")!)};
    }

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
