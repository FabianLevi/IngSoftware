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
    @FXML
    private Button btnComprar;
    @FXML
    private Label lblDonado;

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
        Articulo a = Main.sistema.getListaArticulo().get(Main.sistema.getArticulo());
        lblNombre.setText(a.getNombre());
        lblPrecio.setText(a.getPrecio() + "");
        lblCodigo.setText(a.getCodigo());
        lblMaterial.setText(a.getMaterial());
        lblMatPrima.setText(a.getOrigenMatPrima());
        Image img = new Image(a.getRutaImagen());
        imagenArticulo.setImage(img);
        centerImage(imagenArticulo);
        ObservableList<Envase> lstEnvasesPosibles = FXCollections.observableArrayList(a.getEnvasesPosibles());
        lstEnvases.setItems(lstEnvasesPosibles);
        ObservableList<String> cantidades = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        boxCantidad.setItems(cantidades);
        boxCantidad.getSelectionModel().selectFirst();
        mostrarOcultarEtiquetaDonado(a);
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
    private void handleButtonAgregarAlCarrito(ActionEvent event) throws IOException {
        if (lstEnvases.getSelectionModel().isEmpty()) {
            //MESNAJE DE ERROR: Seleccione un elemento de la lista de envases
        }
        else {
            Venta v = Main.sistema.getVentaActual();
            if (v == null) {        
                Venta nuevaVenta = new Venta();
                ArrayList<NodoArticulo> articulos = new ArrayList<>();
                NodoArticulo nodo = new NodoArticulo();
                nodo.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                nodo.getArticulo().setEnvaseElegido(lstEnvases.getSelectionModel().getSelectedItem());
                nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                articulos.add(nodo);
                nuevaVenta.setArticulos(articulos);
                Main.sistema.setVentaActual(nuevaVenta);
                Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
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
                                Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
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
                        Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
                        Scene scene = new Scene(root);
                        Main.ventana.setScene(scene);
                    }
                }else{
                    NodoArticulo nodo = new NodoArticulo();
                    nodo.setArticulo(Main.sistema.getListaArticulo().get(Main.sistema.getArticulo()));
                    nodo.getArticulo().setEnvaseElegido(lstEnvases.getSelectionModel().getSelectedItem());
                    nodo.setCantVendidas(Integer.parseInt(boxCantidad.getSelectionModel().getSelectedItem()));
                    Main.sistema.getVentaActual().getArticulos().add(nodo);
                    Parent root = FXMLLoader.load(getClass().getResource("VentanaPreCompra.fxml"));
                    Scene scene = new Scene(root);
                    Main.ventana.setScene(scene);
                }
                    
            }
        }
    }
    
    public void mostrarOcultarEtiquetaDonado(Articulo a) {
        ArrayList<NodoArticulo> listaArtVendidos = Main.sistema.getListaArticulosVendidos();
        NodoArticulo aux = new NodoArticulo();
        aux.setArticulo(a);
        int pos = listaArtVendidos.indexOf(aux);
        NodoArticulo nodo = listaArtVendidos.get(pos);
        if (nodo.getCantDonados() > 0) {
            lblDonado.setVisible(true);
        }
        else {
            lblDonado.setVisible(false);
        }
    }
    
    public void centerImage(ImageView imv) {
        Image img = imv.getImage();
        if (img != null) {
            double w = 0;
            double h = 0;

            double ratioX = imv.getFitWidth() / img.getWidth();
            double ratioY = imv.getFitHeight() / img.getHeight();

            double reducCoeff = 0;
            if(ratioX >= ratioY) {
                reducCoeff = ratioY;
            } else {
                reducCoeff = ratioX;
            }

            w = img.getWidth() * reducCoeff;
            h = img.getHeight() * reducCoeff;

            imv.setX((imv.getFitWidth() - w) / 2);
            imv.setY((imv.getFitHeight() - h) / 2);

        }
    }

  
}
