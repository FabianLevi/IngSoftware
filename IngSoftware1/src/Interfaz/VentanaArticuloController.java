/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
public class VentanaArticuloController implements Initializable {
    //private int posListaEnvases;
    
    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnComprar;
    @FXML
    private ImageView imagenArticulo;
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
        inizialiarLabel();
    }    
    
    
    public void inizialiarLabel(){
        lblNombre.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getNombre());
        lblPrecio.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getPrecio() + "");
        lblCodigo.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getCodigo());
        lblMaterial.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getMaterial());
        lblMatPrima.setText(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getOrigenMatPrima());
        Image img = new Image(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getRutaImagen());
        imagenArticulo.setImage(img);
        ObservableList<Envase> lstEnvasesPosibles = FXCollections.observableArrayList(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getEnvasesPosibles());
        lstEnvases.setItems(lstEnvasesPosibles);
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
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    private void handleButtonComprar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaCompra.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

//    @FXML
//    private void handleButtonSiguiente(MouseEvent event) {
//        siguiente();
//    }
//
//    @FXML
//    private void handleButtonAnterior(MouseEvent event) {
//        anterior();
//    }
//    
//    public void siguiente() {
//        ArrayList<Envase> listaEnvases = Main.sistema.getListaEnvases();
//        if (listaEnvases.size() > this.posListaEnvases) {
//            this.imagen1.setImage(imagen2.getImage());
//            setearImagen2();
//            this.posListaEnvases++;
//        }
//    }
//    
//    public void anterior() {
//        if (this.posListaEnvases > 2 ) {
//            this.posListaEnvases -= 3;
//            setearImagen1();
//            this.posListaEnvases++;
//            setearImagen2();
//            this.posListaEnvases++;
//        }
//    }
//    
//    public void setearImagen1() {
//        ArrayList<Envase> listaEnvases = Main.sistema.getListaEnvases();
//        this.imagen1.setVisible(true);
//        String rutaImg1 = listaEnvases.get(posListaEnvases).getRutaImagen();
//        Image img1 = new Image(rutaImg1);
//        this.imagen1.setImage(img1);
//          ArrayList<Envase> listaEnvases = Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getEnvasesPosibles();
//          String rutaImg1 = listaEnvases.get(posListaEnvases).getRutaImagen();
//          Image img1 = new Image(rutaImg1);
//          this.imagen1.setImage(img1);
//    }
//    
//    public void setearImagen2() {
//        ArrayList<Envase> listaEnvases = Main.sistema.getListaEnvases();
//        this.imagen2.setVisible(true);
//        String rutaImg2 = listaEnvases.get(posListaEnvases).getRutaImagen();
//        Image img2 = new Image(rutaImg2);
//        this.imagen2.setImage(img2);
//          ArrayList<Envase> listaEnvases = Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()).getEnvasesPosibles();
//          String rutaImg2 = listaEnvases.get(posListaEnvases).getRutaImagen();
//          Image img2 = new Image(rutaImg2);
//          this.imagen2.setImage(img2);  
//    }

    @FXML
    private void handleButtonAgregarAlCarrito(ActionEvent event) {
        if (lstEnvases.getSelectionModel().isEmpty()) {
            //MESNAJE DE ERROR: Seleccione un elemento de la lista de envases
        }
        else {
            Venta v = Main.sistema.getVentaActual();
            if (v == null) {        //CHEQUEAR ESTO!!
                Venta nuevaVenta = new Venta();
                ArrayList<NodoArticulo> articulos = new ArrayList<>();
                NodoArticulo nodo = new NodoArticulo();
                nodo.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                articulos.add(nodo);
                Main.sistema.setVentaActual(nuevaVenta);
            }
            else {
                actualizarVenta();
            }
        }
    }

    private void actualizarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
