/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.ArticuloTabla;
import Dominio.NodoArticulo;
import Dominio.Venta;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

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
    private Label lblTotal;
    @FXML
    private ImageView imgCodigoQR;
    @FXML
    private ImageView imgEcoShop;
    @FXML
    private TableColumn<ArticuloTabla, String> colArticulo;
    @FXML
    private TableColumn<ArticuloTabla, Integer> colCantidad;
    @FXML
    private TableColumn<ArticuloTabla, String> colPrecio;
    @FXML
    private ImageView btnAtras;
    @FXML
    private TableView<ArticuloTabla> tablaArticulos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Venta v = Main.sistema.getVentaActual();
        setearLista(v);
        calcularTotal(v);
        
        
        
        Main.sistema.setVentaActual(null);
    }    

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }
    
    public void setearLista(Venta v) {
        ArrayList<ArticuloTabla> articulos = new ArrayList<>();
        for (int i = 0; i < v.getArticulos().size(); i++) {
            Articulo a = v.getArticulos().get(i).getArticulo();
            String nombre = a.getNombre();
            int precio = a.getPrecio();
            int cantVendidas = v.getArticulos().get(i).getCantVendidas();
            ArticuloTabla artTab = new ArticuloTabla(nombre, precio, cantVendidas);
            if (articulos.contains(artTab)) {
                int pos = articulos.indexOf(artTab);
                ArticuloTabla aux = articulos.get(pos);
                aux.setCantVendidas(aux.getCantVendidas() + artTab.getCantVendidas());
            }
            else {
                articulos.add(artTab);
            }
        }
        ObservableList<ArticuloTabla> listaArticulos = FXCollections.observableArrayList(articulos);
        
        colArticulo.setCellValueFactory(new PropertyValueFactory<ArticuloTabla, String>("nombre"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<ArticuloTabla, Integer>("cantVendidas"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<ArticuloTabla, String>("precio"));
        
        colCantidad.setStyle("-fx-alignment: CENTER-RIGHT;");
        colPrecio.setStyle("-fx-alignment: CENTER-RIGHT;");
        
        tablaArticulos.setItems(listaArticulos);
    }
    
    public void calcularTotal(Venta v) {
        int total = 0;
        for (int i = 0; i < v.getArticulos().size(); i++) {
            int cant = v.getArticulos().get(i).getCantVendidas();
            int precio = v.getArticulos().get(i).getArticulo().getPrecio();
            total += (cant * precio);
        }
        lblTotal.setText("" + total);
    }
}
