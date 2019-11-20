/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.Articulo;
import Dominio.NodoArticulo;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaConfirmarDonacionController implements Initializable {

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
    private ComboBox<Integer> boxCantidad;
    @FXML
    private Button btnDonar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Articulo a = Main.sistema.getListaArticulo().get(Main.sistema.getArticulo());
        Image img = new Image(a.getRutaImagen());
        imagenArticulo.setImage(img);
        centerImage(imagenArticulo);
        lblNombre.setText(a.getNombre());
        ObservableList<Integer> cantidades = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boxCantidad.setItems(cantidades);
        boxCantidad.getSelectionModel().selectFirst();
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
    private void handleButtonDonar(ActionEvent event) throws IOException {
        Articulo a = Main.sistema.getListaArticulo().get(Main.sistema.getArticulo());
        NodoArticulo nodo = new NodoArticulo();
        nodo.setArticulo(a);
        nodo.setCantDonados(boxCantidad.getSelectionModel().getSelectedItem());
        Main.sistema.getDonacionActual().add(nodo);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
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
