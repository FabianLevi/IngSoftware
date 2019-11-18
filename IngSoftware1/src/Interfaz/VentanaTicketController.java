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
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaTicketController implements Initializable {

    @FXML
    private Label lblFecha;
    @FXML
    private Label lblCodigoTicket;
    @FXML
    private Label lblHora;
    @FXML
    private TableView<?> tablaArticulos;
    @FXML
    private Label lblTotal;
    @FXML
    private ImageView imgCodigoQR;
    @FXML
    private ImageView imgEcoShop;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
