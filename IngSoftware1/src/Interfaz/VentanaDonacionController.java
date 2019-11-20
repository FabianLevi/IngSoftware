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
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Darío
 */
public class VentanaDonacionController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnDonar;
    @FXML
    private ImageView imagen1;
    @FXML
    private ImageView imagen2;
    @FXML
    private ImageView imagen3;
    @FXML
    private ImageView imagen4;
    @FXML
    private ImageView imagen5;
    @FXML
    private ImageView imagen9;
    @FXML
    private ImageView imagen6;
    @FXML
    private ImageView imagen7;
    @FXML
    private ImageView imagen8;
    @FXML
    private ImageView imagen10;
    @FXML
    private ImageView imagen11;
    @FXML
    private ImageView imagen12;
    @FXML
    private ImageView btnSiguiente;
    @FXML
    private ImageView btnAnterior;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i <= 12; i++) {
            if(i<Main.sistema.getListaArticulo().size()){
                Articulo a = Main.sistema.getListaArticulo().get(i);
                Image img = new Image(a.getRutaImagen());
                switch (i){
                    case 0:
                        imagen1.setImage(img);
                        centerImage(imagen1);
                        break;
                    case 1:
                        imagen2.setImage(img);
                        centerImage(imagen2);
                        break;
                    case 2:
                        imagen3.setImage(img);
                        centerImage(imagen3);
                        break;    
                    case 3:
                        imagen4.setImage(img);
                        centerImage(imagen4);
                        break;
                    case 4:
                        imagen5.setImage(img);
                        centerImage(imagen5);
                        break;
                    case 5:
                        imagen6.setImage(img);
                        centerImage(imagen6);
                        break;
                    case 6:
                        imagen7.setImage(img);
                        centerImage(imagen7);
                        break;
                    case 7:
                        imagen8.setImage(img);
                        centerImage(imagen8);
                        break;
                    case 8:
                        imagen9.setImage(img);
                        centerImage(imagen9);
                        break;
                    case 9:
                        imagen10.setImage(img);
                        centerImage(imagen10);
                        break;
                    case 10:
                        imagen11.setImage(img);
                        centerImage(imagen11);
                        break;
                    case 11:
                        imagen12.setImage(img);
                        centerImage(imagen12);
                        break;
                       
                }
            }
        }
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
        Main.ventana.close();
    }

    
    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
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
        ArrayList<NodoArticulo> donActual = Main.sistema.getDonacionActual();
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
    
    
    @FXML
    private void handleImagen1(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(0);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    
    @FXML
    private void handleImagen2(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(1);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen3(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(2);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen4(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(3);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen5(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(4);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }
    
    @FXML
    private void handleImagen6(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(5);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen7(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(6);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen8(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(7);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen9(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(8);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen10(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(9);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen11(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(10);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }


    @FXML
    private void handleImagen12(MouseEvent event) throws IOException {
        Main.sistema.setArticulo(11);
        Parent root = FXMLLoader.load(getClass().getResource("VentanaConfirmarDonacion.fxml"));
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
