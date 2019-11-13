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
public class IngSoftware1 extends Application {
    //public static Sistema sistema;
    public static Stage ventana;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ventana = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMenuUsuario.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        //launch(args);
        Sistema s = new Sistema();
        Envase e1 = new Envase("Latas");
        Envase e2 = new Envase("Cajones");
        Envase e3 = new Envase("Bolsa");
        Envase e4 = new Envase("Bolsa Descartable");
        s.agregarEnvase(e1);
        s.agregarEnvase(e2);
        s.agregarEnvase(e3);
        s.agregarEnvase(e4);
        ArrayList<Envase>aux = new ArrayList<Envase>();
        aux.add(e1);
        aux.add(e2);
        ArrayList<Envase>aux2 = new ArrayList<Envase>();
        aux2.add(e1);
        aux2.add(e3);
        aux2.add(e4);
//        for (int i = 0; i < s.getListaEnvases().size(); i++) {
//            System.out.println(s.getListaEnvases().get(i).getTipo());
//        }
        Articulo a1 = new Articulo("Banana","origenA",100,"materialA","codigoA",aux,e1,"imagenA");
        Articulo a2 = new Articulo("Manzana","origenB",10,"materialB","codigoB",aux2,e2,"imagenB");
        Articulo a3 = new Articulo("Pera","origenC",100,"materialC","codigoC",aux,e3,"imagenC");
        s.agregarArticulo(a1);
        s.agregarArticulo(a2);
        s.agregarArticulo(a3);
//        for (int i = 0; i < s.getListaArticulo().size(); i++) {
//            System.out.println(s.getListaArticulo().get(i).getNombre());
//        }
       
        Usuario u = new Usuario("Fabian",21,"mail","fa");
        PuntoDeVenta pdv =  new PuntoDeVenta("direccion");
        ArrayList<Articulo>aux4 = new ArrayList<Articulo>();
        aux4.add(a2);
        aux4.add(a2);
        aux4.add(a3);
        ArrayList<Articulo>aux5 = new ArrayList<Articulo>();
        aux5.add(a1);
        aux5.add(a3);
        ArrayList<Articulo>aux6 = new ArrayList<Articulo>();
        //aux6.add(a1);
        aux6.add(a3);
        Date fecha = new Date();
        fecha.setMonth(12);
        
        Date fecha2 = new Date();
        fecha2.setMonth(11);
        
        Date fecha3 = new Date();
        fecha3.setMonth(11);
        
        Venta v = new Venta(aux4,pdv,u,fecha);
        Venta v2 = new Venta(aux5,pdv,u,fecha2);
        Venta v3 = new Venta(aux6,pdv,u,fecha3);
        s.agregarVenta(v);
        s.agregarVenta(v2);
        s.agregarVenta(v3);
        
        PreVenta pv1 = new PreVenta(fecha,v,"codigo1");
        PreVenta pv2 = new PreVenta(fecha2,v2,"codigo2");
        PreVenta pv3 = new PreVenta(fecha3,v3,"codigo3");
        s.agregarPreVenta(pv1);
        s.agregarPreVenta(pv2);
        s.agregarPreVenta(pv3);
        
//        ArrayList<Venta>res=s.getListaVentas();
//        for (int i = 0; i < res.size(); i++) {
//            ArrayList<Articulo>articulos=res.get(i).getArticulos();
//            for (int j = 0; j <articulos.size(); j++) {
//                System.out.println(articulos.get(j).getNombre());
//            }
//        }
        
        s.realizarVenta(pv1);
        s.realizarVenta(pv2);
        s.realizarVenta(pv3);
        ArrayList<Venta>res2=s.getListaVentas();
        for (int i = 0; i < res2.size(); i++) {
            ArrayList<Articulo>articulos=res2.get(i).getArticulos();
            for (int j = 0; j <articulos.size(); j++) {
                System.out.println(articulos.get(j).getNombre());
            }
        }
        
        
//        ArrayList<PreVenta>res = s.preVentasDespuesDeFecha();
//        for (int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i).getCodigo());
//        }
        
        //int num = s.cantidadDeVentasEnMes(11);
        //System.out.println(num);
        
//        for (int i = 0; i < s.getListaVentas().size(); i++) {
//            Venta vAux = s.getListaVentas().get(i);
//            for (int j = 0; j < vAux.getArticulos().size(); j++) {
//                System.out.println(vAux.getArticulos().get(j).getNombre());
//            }
//        }
        
//         ArrayList<NodoArticulo>res = s.articulosMasVendidos();
//         for (int i = 0; i < res.size(); i++) {
//             System.out.println(res.get(i).getArticulo().getNombre() + res.get(i).getCantVendidas());
//        }
//        ArrayList<NodoEnvase>res =s.envasesReutilizables();
//        for (int i = 0; i < res.size(); i++) {
//            if(res.get(i).getCantVendidas()>0){
//                System.out.println(res.get(i).getEnvase().getTipo());
//            }
//        }
        //ArrayList<NodoArticulo> nodo = s.articulosMasVendidos();
    }
    
//    @Override
//    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        launch(args);
//    }
    
}
