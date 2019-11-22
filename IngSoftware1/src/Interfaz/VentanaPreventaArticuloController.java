/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.Envase;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaPreventaArticuloController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private ImageView imagenArticulo;
    @FXML
    private Button btnComprar;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblPrecio;
    @FXML
    private Label lblCodigo;
    @FXML
    private Label lblMaterial;
    @FXML
    private Label lblMatPrima;
    @FXML
    private ListView<Envase> lstEnvases;
    @FXML
    private ComboBox<String> boxCantidad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblNombre.setText("");
        lblPrecio.setText("");
        lblCodigo.setText("");
        lblMaterial.setText("");
        lblMatPrima.setText("");
        inicializarLabel();
    }    
    
    public void inicializarLabel(){
        lblNombre.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getNombre());
        lblPrecio.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getPrecio() + "");
        lblCodigo.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getCodigo());
        lblMaterial.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getMaterial());
        lblMatPrima.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getOrigenMatPrima());
        Image img = new Image(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getRutaImagen());
        imagenArticulo.setImage(img);
        ObservableList<Envase> lstEnvasesPosibles = FXCollections.observableArrayList(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getEnvasesPosibles());
        lstEnvases.setItems(lstEnvasesPosibles);
        lstEnvases.getSelectionModel().selectFirst();
        ObservableList<String> cantidades = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        boxCantidad.setItems(cantidades);
        boxCantidad.getSelectionModel().selectFirst();
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

    private void handleButtonAceptar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventaCodigo.fxml"));
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
    private void handleButtonAgregarAlCarrito(ActionEvent event) throws IOException {
         if (lstEnvases.getSelectionModel().isEmpty()) {
            //MESNAJE DE ERROR: Seleccione un elemento de la lista de envases
        }
        else {
            Venta v = Main.sistema.getPreventaActual();
            if (v == null) {        
                Venta nuevaVenta = new Venta();
                ArrayList<NodoArticulo> articulos = new ArrayList<>();
                NodoArticulo nodo = new NodoArticulo();
                nodo.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                nodo.getArticulo().setEnvaseElegido(lstEnvases.getSelectionModel().getSelectedItem());
                nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                articulos.add(nodo);
                nuevaVenta.setArticulos(articulos);
                Main.sistema.setPreventaActual(nuevaVenta);
                Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
                Scene scene = new Scene(root);
                Main.ventana.setScene(scene);
                
            }
            else {
                NodoArticulo nodo2 = new NodoArticulo();
                nodo2.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                if(v.getArticulos().contains(nodo2)){
                    boolean esta = false;
                    for (int i = 0; i < v.getArticulos().size(); i++) {
                        NodoArticulo a = v.getArticulos().get(i);
                        if(a.getArticulo().equals(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()))){
                            if(a.getArticulo().getEnvaseElegido().getTipo().equals(lstEnvases.getSelectionModel().getSelectedItem().getTipo())){
                                a.setCantVendidas(a.getCantVendidas() + Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                                esta = true;
                                Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
                                Scene scene = new Scene(root);
                                Main.ventana.setScene(scene);
                            }
                        }
                    }
                    if (!esta) {
                        NodoArticulo nodo = new NodoArticulo();
                        Articulo art = new Articulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                        Envase env = lstEnvases.getSelectionModel().getSelectedItem();
                        art.setEnvaseElegido(env);
                        nodo.setArticulo(art);
                        nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                        Main.sistema.getVentaActual().getArticulos().add(nodo);
                        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
                        Scene scene = new Scene(root);
                        Main.ventana.setScene(scene);
                    }
                }else{
                    NodoArticulo nodo = new NodoArticulo();
                    nodo.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                    nodo.getArticulo().setEnvaseElegido(lstEnvases.getSelectionModel().getSelectedItem());
                    nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                    Main.sistema.getVentaActual().getArticulos().add(nodo);
                    Parent root = FXMLLoader.load(getClass().getResource("VentanaPreventa.fxml"));
                    Scene scene = new Scene(root);
                    Main.ventana.setScene(scene);
                }
                    
            }
        }
    }
    
}
