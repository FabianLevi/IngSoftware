/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    private int posListaArticulos;
    
    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnComprar;
    @FXML
    private TextField textNombre;
    @FXML
    private TextField textPrecio;
    @FXML
    private TextField textCodigo;
    @FXML
    private ImageView imagen1;
    @FXML
    private ImageView imagen2;
    @FXML
    private ImageView btnSiguiente;
    @FXML
    private ImageView btnAnterior;
    @FXML
    private ImageView imagenArticulo;
    @FXML
    private TextField textCodigo1;
    @FXML
    private TextField textCodigo11;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.posListaArticulos = 0;
        
        ArrayList<Articulo> listaArticulos = Main.sistema.getListaArticulo();
        String rutaImg1 = listaArticulos.get(posListaArticulos).getRutaImagen();
        String rutaImg2 = listaArticulos.get(posListaArticulos + 1).getRutaImagen();
        
        Image img1 = new Image(rutaImg1);
        Image img2 = new Image(rutaImg2);
        
        this.imagen1 = new ImageView(img1);
        this.imagen2 = new ImageView(img2);
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
    
}
