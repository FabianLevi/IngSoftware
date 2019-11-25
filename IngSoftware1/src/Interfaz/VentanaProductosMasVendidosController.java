/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.NodoArticulo;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
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
        XYChart.Series set1 = new  XYChart.Series<>();
        //set1.getData().add(new XYChart.Data("Fa",6));
        for (int i = 0; i < Main.sistema.getListaArticulosVendidos().size(); i++) {
            NodoArticulo a = Main.sistema.getListaArticulosVendidos().get(i);
            String nombre = a.getArticulo().getNombre();
            int cant = a.getCantVendidas();
            set1.getData().add(new XYChart.Data(nombre,cant));
        }
        graficaProductos.getData().addAll(set1);
        
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaEstadisticas.fxml"));
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
