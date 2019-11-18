/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    
}
