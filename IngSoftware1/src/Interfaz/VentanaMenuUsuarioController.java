/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.Sistema;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaMenuUsuarioController implements Initializable {
    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView imgVenta;
    @FXML
    private ImageView imgPreventa;
    @FXML
    private ImageView imgLocales;
    @FXML
    private ImageView imgDonar;
    @FXML
    private Button btnVenta;
    @FXML
    private Button btnPreventa;
    @FXML
    private Button btnLocales;
    @FXML
    private Button btnDonar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
        
        
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
    private void salioMouseVenta(MouseEvent event) {
        imgVenta.setFitHeight(imgVenta.getFitHeight() - 20);
        imgVenta.setFitWidth(imgVenta.getFitWidth() - 20);
    }

    @FXML
    private void entroMouseVenta(MouseEvent event) {
        imgVenta.setFitHeight(imgVenta.getFitHeight() + 20);
        imgVenta.setFitWidth(imgVenta.getFitWidth() + 20);
    }

    @FXML
    private void salioMousePreventa(MouseEvent event) {
        imgPreventa.setFitHeight(imgPreventa.getFitHeight() - 20);
        imgPreventa.setFitWidth(imgPreventa.getFitWidth() - 20);
    }

    @FXML
    private void entroMousePreventa(MouseEvent event) {
        imgPreventa.setFitHeight(imgPreventa.getFitHeight() + 20);
        imgPreventa.setFitWidth(imgPreventa.getFitWidth() + 20);
    }

    @FXML
    private void salioMouseLocales(MouseEvent event) {
        imgLocales.setFitHeight(imgLocales.getFitHeight() - 20);
        imgLocales.setFitWidth(imgLocales.getFitWidth() - 20);
    }

    @FXML
    private void entroMouseLocales(MouseEvent event) {
        imgLocales.setFitHeight(imgLocales.getFitHeight() + 20);
        imgLocales.setFitWidth(imgLocales.getFitWidth() + 20);
    }

    @FXML
    private void salioMouseDonar(MouseEvent event) {
        imgDonar.setFitHeight(imgDonar.getFitHeight() - 20);
        imgDonar.setFitWidth(imgDonar.getFitWidth() - 20);
    }

    @FXML
    private void entroMouseDonar(MouseEvent event) {
        imgDonar.setFitHeight(imgDonar.getFitHeight() + 20);
        imgDonar.setFitWidth(imgDonar.getFitWidth() + 20);
    }

    @FXML
    private void handleButtonVenta(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonPreventa(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonLocales(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaLocales.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonDonar(ActionEvent event) {
    }

    
}
