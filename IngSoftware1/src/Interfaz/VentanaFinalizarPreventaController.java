/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.PreVenta;
import Dominio.Venta;
import java.io.IOException;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaFinalizarPreventaController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnFinalizarPreventa;
    @FXML
    private TextField lblNombre;
    @FXML
    private TextField lblTarjeta;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label vacio;
    @FXML
    private Label lblCantidadCarrito;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());
        lblNombre.setText("Alejandro Adorjan");
        lblTarjeta.setText("4485 7158 6086 8875");
        
        int cant = 0;
        Venta pv = Main.sistema.getPreventaActual();
        if (pv != null) {
            for (int i = 0; i < pv.getArticulos().size(); i++) {
                cant += pv.getArticulos().get(i).getCantVendidas();
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
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
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

        if (datePicker.getValue().getYear() != 0) {
            int dia = datePicker.getValue().getDayOfMonth();
            int mes = datePicker.getValue().getMonthValue();
            int ano = datePicker.getValue().getYear();            
            Date fechaPreVenta = new Date();
            fechaPreVenta.setDate(dia);
            fechaPreVenta.setMonth(mes - 1);
            fechaPreVenta.setYear(ano - 1900);
            Venta v = Main.sistema.getPreventaActual();
            if (!lblNombre.getText().isEmpty() && !lblTarjeta.getText().isEmpty()) {
                if (v != null) {
                    PreVenta pv = new PreVenta();
                    pv.setVentaRealizar(v);
                    pv.setFecha(fechaPreVenta);
                    int numero = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
                    pv.setCodigo(numero + "");
                    Main.sistema.agregarPreVenta(pv);
                    Main.sistema.setPreventaActual(null);
                    Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
                    Scene scene = new Scene(root);
                    Main.ventana.setScene(scene);
                } else {
                    vacio.setText("El carrito esta vacio");
                }
            }else {
                vacio.setText("No puede dejar campos vacíos");
            }
        }
    }
}
