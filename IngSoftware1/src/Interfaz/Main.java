/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.*;
import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Fabian
 */
public class Main extends Application {
    public static Sistema sistema;
    public static Stage ventana;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        sistema = new Sistema();
        
        Envase e1 = new Envase("plastico", "/Imagenes/plastico.jpg",10);
        Envase e2 = new Envase("espuma plast", "/Imagenes/espuma plast.jpg",20);
        Envase e3 = new Envase("carton", "/Imagenes/carton.jpg",30);
        Envase e4 = new Envase("vidrio", "/Imagenes/vidrio.jpg",40);
        
        sistema.agregarEnvase(e1);
        sistema.agregarEnvase(e2);
        sistema.agregarEnvase(e3);
        sistema.agregarEnvase(e4);
        
        ArrayList<Envase> listaEnvases = new ArrayList<>();
        listaEnvases.add(e1);
        listaEnvases.add(e2);
        
        Articulo art1 = new Articulo("bananas", "campo", 12, "orgánico", "bananas123", listaEnvases, e1, "/Imagenes/bananas.jpg");
        Articulo art2 = new Articulo("manzanas", "campo", 15, "organico", "manzanas123", listaEnvases, e2, "/Imagenes/manzana.png");
        Articulo art3 = new Articulo("peras", "campo", 12, "orgánico", "peras123", listaEnvases, e1, "/Imagenes/peras.jpg");
        Articulo art4 = new Articulo("naranjas", "campo", 15, "organico", "naranjas123", listaEnvases, e2, "/Imagenes/naranjas.jpg");
        
        sistema.agregarArticulo(art1);
        sistema.agregarArticulo(art2);
        sistema.agregarArticulo(art3);
        sistema.agregarArticulo(art4);
        
        ventana = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
}
