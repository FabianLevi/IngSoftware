/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaAgregarArticuloController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnAgregarArticulo;
    @FXML
    private TextField textNombre;
    @FXML
    private TextField textPrecio;
    @FXML
    private TextField textCodigo;
    @FXML
    private TextField textMaterial;
    @FXML
    private TextField textMateriaPrima;
    @FXML
    private CheckBox checkPlastico;
    @FXML
    private CheckBox checkVidrio;
    @FXML
    private CheckBox checkCarton;
    @FXML
    private CheckBox checkNylon;
    @FXML
    private CheckBox checkPapel;
    @FXML
    private CheckBox checkEspumaPlast;
    @FXML
    private ImageView imagenArticulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) {
    }

    @FXML
    private void handleButtonMenu(MouseEvent event) {
    }

    @FXML
    private void handleButtonAgregarAlCarrito(ActionEvent event) {
    }
    
}
