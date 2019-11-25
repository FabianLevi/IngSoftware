/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Dominio.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
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
        Envase e5 = new Envase("nylon", "",40);
        Envase e6 = new Envase("papel", "",40);
        
        sistema.agregarEnvase(e1);
        sistema.agregarEnvase(e2);
        sistema.agregarEnvase(e3);
        sistema.agregarEnvase(e4);
        sistema.agregarEnvase(e5);
        sistema.agregarEnvase(e6);
        
        ArrayList<Envase> listaEnvases = new ArrayList<>();
        listaEnvases.add(e1);
        listaEnvases.add(e2);
        listaEnvases.add(e3);
        listaEnvases.add(e4);
        
         ArrayList<Envase> listaEnvases2 = new ArrayList<>();
         listaEnvases2.add(e1);
         listaEnvases2.add(e6);
         listaEnvases2.add(e5);
        
        int numero1 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero2 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero3 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero4 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero5 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero6 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero7 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero8 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero9 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero10 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero11 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        int numero12 = ThreadLocalRandom.current().nextInt(10000, 50000 + 1);
        
        Articulo art1 = new Articulo("bananas", "campo", 12, "orgánico", numero1+"", listaEnvases, e1, "/Imagenes/bananas.jpg");
        Articulo art2 = new Articulo("manzanas", "campo", 15, "organico", numero2+"", listaEnvases, e1, "/Imagenes/manzana.png");
        Articulo art3 = new Articulo("peras", "campo", 12, "orgánico", numero3+"", listaEnvases, e1, "/Imagenes/peras.jpg");
        Articulo art4 = new Articulo("naranjas", "campo", 15, "organico", numero4+"", listaEnvases, e1, "/Imagenes/naranjas.jpg");
        Articulo art5 = new Articulo("limon", "campo", 15, "organico", numero5+"", listaEnvases, e1, "/Imagenes/limon.jpeg");
        Articulo art6 = new Articulo("ciruela", "campo", 34, "organico", numero6+"", listaEnvases, e1, "/Imagenes/ciruela.jpg");
        Articulo art7 = new Articulo("piña", "campo", 45, "organico", numero7+"", listaEnvases, e1, "/Imagenes/pina.jpg");
        Articulo art8 = new Articulo("aguacate", "campo", 55, "organico", numero8+"", listaEnvases2, e1, "/Imagenes/aguacate.jpg");
        Articulo art9 = new Articulo("pomelo", "campo", 5, "organico", numero9+"", listaEnvases, e1, "/Imagenes/pomelo.jpg");
        Articulo art10 = new Articulo("sandia", "campo", 75, "organico", numero10+"", listaEnvases2, e1, "/Imagenes/sandia.jpg");
        Articulo art11= new Articulo("uva", "campo", 9, "organico", numero11+"", listaEnvases, e1, "/Imagenes/uva.jpg");
        Articulo art12 = new Articulo("frutilla", "campo", 25, "organico", numero12+"", listaEnvases2, e1, "/Imagenes/frutilla.jpg");
        
        sistema.agregarArticulo(art1);
        sistema.agregarArticulo(art2);
        sistema.agregarArticulo(art3);
        sistema.agregarArticulo(art4);
        sistema.agregarArticulo(art5);
        sistema.agregarArticulo(art6);
        sistema.agregarArticulo(art7);
        sistema.agregarArticulo(art8);
        sistema.agregarArticulo(art9);
        sistema.agregarArticulo(art10);
        sistema.agregarArticulo(art11);
        sistema.agregarArticulo(art12);
        
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
