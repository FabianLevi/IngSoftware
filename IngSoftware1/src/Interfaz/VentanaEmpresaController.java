/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaEmpresaController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView imgPreventa;
    @FXML
    private ImageView btnAtras;
    @FXML
    private Button btnAgregarArticulo;
    @FXML
    private Button btnEstadisticas;
    @FXML
    private Button btnEjecutarPreventa;
    @FXML
    private ImageView imgAgregarArticulo;
    @FXML
    private ImageView imgEstadisticas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonAgregarArticulo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaAgregarArticulo.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    private void handleButtonEstadistica(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaEstadisticas.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
        
    }

    @FXML
    private void handleButtonAtras2(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }
    
}
