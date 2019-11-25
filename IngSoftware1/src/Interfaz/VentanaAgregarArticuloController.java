/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.*;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaAgregarArticuloController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnMenu;
    @FXML
    private Button btnAgregarArticulo;
    @FXML
    private TextField textNombre;
    @FXML
    private TextField textPrecio;
    @FXML
    private TextField textCodigo;
    @FXML
    private TextField textMaterial;
    @FXML
    private TextField textMateriaPrima;
    @FXML
    private CheckBox checkPlastico;
    @FXML
    private CheckBox checkVidrio;
    @FXML
    private CheckBox checkCarton;
    @FXML
    private CheckBox checkNylon;
    @FXML
    private CheckBox checkPapel;
    @FXML
    private CheckBox checkEspumaPlast;
    @FXML
    private ImageView imagenArticulo;
    @FXML
    private Button elegirImagen;
    @FXML
    private Label vacio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void handleButtonAgregarAlCarrito(ActionEvent event) throws IOException {
        String nombre = textNombre.getText();
        String precio = textPrecio.getText();
        int precioN=0;
        if(!precio.equals("")){
            precioN = Integer.parseInt(precio);
        }
        String codigo = textCodigo.getText();
        String material = textMaterial.getText();
        String materiaPrima = textMateriaPrima.getText();
        boolean plastico = checkPlastico.isSelected();
        boolean vidirio = checkVidrio.isSelected();
        boolean carton = checkCarton.isSelected();
        boolean nylon=checkNylon.isSelected();
        boolean papel = checkPapel.isSelected();
        boolean espumaplast = checkEspumaPlast.isSelected();
        ArrayList<Envase> lista = new ArrayList<Envase>();
        this.agregarEnvaseALista(lista, plastico, "plastico");
        this.agregarEnvaseALista(lista, vidirio, "vidirio");
        this.agregarEnvaseALista(lista, carton, "carton");
        this.agregarEnvaseALista(lista, nylon, "nylon");
        this.agregarEnvaseALista(lista, papel, "papel");
        this.agregarEnvaseALista(lista, espumaplast, "espuma plast");
        if(!nombre.equals("") && !precio.equals("") && !codigo.equals("") && !material.equals("")&&!materiaPrima.equals("")){
            Articulo a = new Articulo(nombre,materiaPrima,precioN,material,codigo,lista,null,"/Imagenes/imagen.jpg");
            Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
            Scene scene = new Scene(root);
            Main.ventana.setScene(scene);   
        }else{
            vacio.setText("Hay algun campo vacio");
        }
    }
    
    private void agregarEnvaseALista(ArrayList<Envase> lista,boolean material, String nombreMaterial){
        if(material){
            for (int i = 0; i < Main.sistema.getListaEnvases().size(); i++) {
                Envase e = Main.sistema.getListaEnvases().get(i);
                if(e.getTipo().equals(nombreMaterial)){
                    lista.add(e);
                }
            }
        }
        
    }

    @FXML
    private void handleButtonElegirImahen(ActionEvent event) {   
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Eliga imagen");
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".jpg","jpg");
            fileChooser.setFileFilter(filter);
            Component modalToComponent = null;
            if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                File destination = new File("C:\\Users\\Fabian\\Desktop\\IngSoftware\\IngSoftware1\\src\\Imagenes\\imagen.jpg");
                try{
                    Files.copy(file.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }catch(IOException e){
                    e.printStackTrace();
                }
                
               
            }
        }
    
    
}
