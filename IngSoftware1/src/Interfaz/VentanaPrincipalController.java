/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Sistema;
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaPrincipalController implements Initializable {
    
    @FXML
    private Button btnEmpresa;
    @FXML
    private Button btnUsuario;
    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView imgEmpresa;
    @FXML
    private ImageView imgUsuario;
    @FXML
    private Label lblEmpresa;
    @FXML
    private Label lblUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonEmpresa(ActionEvent event) {
    }

    @FXML
    private void handleButtonUsuario(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    @FXML
    private void salioMouseEmpresa(MouseEvent event) {
        imgEmpresa.setFitHeight(imgEmpresa.getFitHeight() - 30);
        imgEmpresa.setFitWidth(imgEmpresa.getFitWidth() - 30);
        //lblEmpresa.setPrefSize(lblEmpresa.getPrefWidth() - 30, lblEmpresa.getPrefHeight() - 30);
    }

    @FXML
    private void entroMouseEmpresa(MouseEvent event) {
        imgEmpresa.setFitHeight(imgEmpresa.getFitHeight() + 30);
        imgEmpresa.setFitWidth(imgEmpresa.getFitWidth() + 30);
        //lblEmpresa.setPrefSize(lblEmpresa.getPrefWidth() + 30, lblEmpresa.getPrefHeight() + 30);
    }

    @FXML
    private void salioMouseUsuario(MouseEvent event) {
        imgUsuario.setFitHeight(imgUsuario.getFitHeight() - 30);
        imgUsuario.setFitWidth(imgUsuario.getFitWidth() - 30);
        //lblUsuario.setPrefSize(lblUsuario.getPrefWidth() - 30, lblUsuario.getPrefHeight() - 30);
    }

    @FXML
    private void entroMouseUsuario(MouseEvent event) {
        imgUsuario.setFitHeight(imgUsuario.getFitHeight() + 30);
        imgUsuario.setFitWidth(imgUsuario.getFitWidth() + 30);
        //lblUsuario.setPrefSize(lblUsuario.getPrefWidth() + 30, lblUsuario.getPrefHeight() + 30);
    }
}
