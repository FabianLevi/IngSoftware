/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.*;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class VentanaCompraController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private TextField lblNombre;
    @FXML
    private TextField lblTarjeta;
    @FXML
    private Button btnFinalizarCompra;
    @FXML
    private Label vacio;
    @FXML
    private Label lblCantidadCarrito;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblNombre.setText("Alejandro Adorjan");
        lblTarjeta.setText("4485 7158 6086 8875");
        
        int cant = 0;
        Venta v = Main.sistema.getVentaActual();
        if (v != null) {
            for (int i = 0; i < v.getArticulos().size(); i++) {
                cant += v.getArticulos().get(i).getCantVendidas();
            }
        }
        lblCantidadCarrito.setText("" + cant);
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }
    @FXML
    private void handleButtonFinalizarCompra(ActionEvent event) throws IOException {
        Venta v = Main.sistema.getVentaActual();
        if(v!=null){
            Main.sistema.agregarVenta(v);
            //Main.sistema.setVentaActual(null);
            Main.sistema.setNombreUsuarioVenta(lblNombre.getText());
            Main.sistema.setNumeroTarjetaUsuarioVenta(lblTarjeta.getText());
            Parent root = FXMLLoader.load(getClass().getResource("VentanaTicket.fxml"));
            Scene scene = new Scene(root);
            Main.ventana.setScene(scene);
        }else{
            vacio.setText("El carrito esta vacio");
        }
    }
}
