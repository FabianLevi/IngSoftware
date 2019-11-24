/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Fabian
 */
import java.util.ArrayList;
import java.util.Date;

public class Venta {
    
    //Atributos
    private ArrayList<NodoArticulo> articulos;
    private Date fecha;

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    //Constructores
    public Venta(ArrayList<NodoArticulo> listaArticulos,Date unaFecha) {
        articulos = listaArticulos;
        fecha=unaFecha;
    }

    public Venta(){
        articulos = null;
        this.setFecha(new Date());
    }
    //Setters
    public void setArticulos(ArrayList<NodoArticulo> articulos) {
        this.articulos = articulos;
    }

    //Getters
    public ArrayList<NodoArticulo> getArticulos() {
        return articulos;
    }

     //Métodos sobreescritos
    @Override
    public boolean equals(Object obj){
        return this.articulos.equals(((Venta) obj).articulos);
    }

    
    
    
}
