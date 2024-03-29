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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaVerDonacionController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private TableView<ArticuloTabla> tablaDonacion;
    @FXML
    private TableColumn<ArticuloTabla, String> colArticulo;
    @FXML
    private TableColumn<ArticuloTabla, Integer> colCantidad;
    @FXML
    private Button btnBorrarDonacion;
    @FXML
    private Button btnDonar;
    @FXML
    private Label lblCantidadCarrito;
    @FXML
    private Label vacio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<NodoArticulo> d = Main.sistema.getDonacionActual();
        setearLista(d);
        
        int cant = 0;
        if (d != null) {
            for (int i = 0; i < d.size(); i++) {
                cant += d.get(i).getCantDonados();
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
        Parent root = FXMLLoader.load(getClass().getResource("VentanaDonacion.fxml"));
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
    private void handleButtonBorrarDonacion(ActionEvent event) throws IOException {
        Main.sistema.getDonacionActual().clear();
        Parent root = FXMLLoader.load(getClass().getResource("VentanaDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonDonar(ActionEvent event) throws IOException {
        ArrayList<NodoArticulo> donActual = Main.sistema.getDonacionActual();
        if (!donActual.isEmpty()) {
            for (int i = 0; i < donActual.size(); i++) {
                ArrayList<NodoArticulo> listaArtVendidos = Main.sistema.getListaArticulosVendidos();
                NodoArticulo nodo = donActual.get(i);
                int pos = listaArtVendidos.indexOf(nodo);
                listaArtVendidos.get(pos).setCantDonados(listaArtVendidos.get(pos).getCantDonados() + nodo.getCantDonados());
            }
            donActual.clear();
            Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
            Scene scene = new Scene(root);
            Main.ventana.setScene(scene);
        }
        else {
            vacio.setText("No hay artículos para donar");
        }
    }
    
    public void setearLista(ArrayList<NodoArticulo> d) {
        if (!d.isEmpty()) {
            ArrayList<ArticuloTabla> articulos = new ArrayList<>();
            for (int i = 0; i < d.size(); i++) {
                Articulo a = d.get(i).getArticulo();
                String nombre = a.getNombre();
                int cantDonados = d.get(i).getCantDonados();
                ArticuloTabla artTab = new ArticuloTabla(nombre, 0, cantDonados);
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

            colCantidad.setStyle("-fx-alignment: CENTER-RIGHT;");

            tablaDonacion.setItems(listaArticulos);
        }
    }
    
}
