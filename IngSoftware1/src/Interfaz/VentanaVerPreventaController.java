/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.ArticuloTabla;
import Dominio.PreVenta;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaVerPreventaController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private TableView<PreVenta> tablaAntesDeFecha;
    @FXML
    private TableView<PreVenta> tablaDespuesFecha;
    @FXML
    private TableColumn<PreVenta, String> colCodigo;
    @FXML
    private TableColumn<PreVenta, String> colFecha;
    @FXML
    private TableColumn<PreVenta, String> colCodigo2;
    @FXML
    private TableColumn<PreVenta, String> colFecha2;
    @FXML
    private Button btnEjecutarPreVentas;
    @FXML
    private Label vacio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
         ArrayList<PreVenta> preventa = Main.sistema.preVentasAntesDeFecha();
         ArrayList<PreVenta> preventa2 = Main.sistema.preVentasDespuesDeFecha();
         
        
        ObservableList<PreVenta> listaArticulos = FXCollections.observableArrayList(preventa);
        
        colCodigo.setCellValueFactory(new PropertyValueFactory<PreVenta, String>("codigo"));
        colFecha.setCellValueFactory(new PropertyValueFactory<PreVenta, String>("fecha"));
        
        colCodigo.setStyle("-fx-alignment: CENTER;");
        colFecha.setStyle("-fx-alignment: CENTER;");
        
        tablaAntesDeFecha.setItems(listaArticulos);
        
        ObservableList<PreVenta> listaArticulos2 = FXCollections.observableArrayList(preventa2);
        colCodigo2.setCellValueFactory(new PropertyValueFactory<PreVenta, String>("codigo"));
        colFecha2.setCellValueFactory(new PropertyValueFactory<PreVenta, String>("fecha"));
        
        colCodigo2.setStyle("-fx-alignment: CENTER;");
        colFecha2.setStyle("-fx-alignment: CENTER;");
        
        tablaDespuesFecha.setItems(listaArticulos2);
        tablaAntesDeFecha.getSelectionModel().selectFirst();
        
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
         Main.ventana.close();
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("VentanaEmpresa.fxml"));
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
    private void handleBotonEjecutar(ActionEvent event) throws IOException {
        if(!tablaAntesDeFecha.getSelectionModel().isEmpty()){
            PreVenta pv = tablaAntesDeFecha.getSelectionModel().getSelectedItem();
            Main.sistema.realizarVenta(pv);
            Parent root = FXMLLoader.load(getClass().getResource("VentanaEmpresa.fxml"));
            Scene scene = new Scene(root);
            Main.ventana.setScene(scene);
        }else{
            vacio.setText("No se selecciona una preventa");
        }
    }
    
}
