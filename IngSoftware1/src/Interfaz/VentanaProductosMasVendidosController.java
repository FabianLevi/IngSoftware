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
import javafx.scene.chart.BarChart;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaProductosMasVendidosController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnAtras2;
    @FXML
    private ImageView btnMenu;
    @FXML
    private BarChart<?, ?> graficaProductos;

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
    
}
