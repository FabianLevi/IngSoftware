/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Sabrina
 */
public class VentanaVentasEnMesController implements Initializable {

    @FXML
    private ImageView btnSalir;
    @FXML
    private ImageView btnAtras;
    @FXML
    private ImageView btnAtras2;
    @FXML
    private ImageView btnMenu;
    @FXML
    private BarChart<?, ?> graficaVentasMes;
    @FXML
    private ComboBox<String> boxMes;
    @FXML
    private Button btnEmpezar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> cantidades = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        boxMes.setItems(cantidades);
        boxMes.getSelectionModel().selectFirst();
        //inicializarGrafica();
        
        
    }    

    @FXML
    private void handleButtonSalir(MouseEvent event) {
         Main.ventana.close();
        
    }

    @FXML
    private void handleButtonAtras(MouseEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("VentanaEstadisticas.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    @FXML
    private void handleButtonMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        Main.ventana.setScene(scene);
    }

    private void inicializarGrafica() {
       int mes = Integer.parseInt(boxMes.getSelectionModel().getSelectedItem());
       int cantVentas = Main.sistema.cantidadDeVentasEnMes(mes);
       XYChart.Series set1 = new  XYChart.Series<>();
       set1.getData().add(new XYChart.Data(mes,cantVentas));
       graficaVentasMes.getData().addAll(set1);
       
    }

    @FXML
    private void handleButtonEmpezar(ActionEvent event) {
       int mes = Integer.parseInt(boxMes.getSelectionModel().getSelectedItem());
       int cantVentas = Main.sistema.cantidadDeVentasEnMes(mes);
       if(mes != 0){
        XYChart.Series set1 = new  XYChart.Series<>();
        String mesString = mes + "";
        set1.getData().add(new XYChart.Data(mesString,cantVentas));
        graficaVentasMes.getData().addAll(set1);
       }
    }
    
}
