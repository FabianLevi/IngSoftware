/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Darío
 */
import java.util.ArrayList;

public class Articulo {
    
    //Atributos
    private String nombre;
    private String origenMatPrima;
    private int precio;
    private String material;
    private String codigo;
    private ArrayList<Envase> envasesPosibles;
    private Envase envaseElegido;
    private String rutaImagen;
    

    //Constructores
    public Articulo(String unNombre, String unOrigenMatPrima, int unPrecio, String unMaterial, String unCodigo, 
            ArrayList<Envase> listaEnvasesPosibles, Envase unEnvaseElegido, String unaRutaImagen) {
        nombre = unNombre;
        origenMatPrima = unOrigenMatPrima;
        this.setPrecio(unPrecio);
        material = unMaterial;
        codigo = unCodigo;
        envasesPosibles = listaEnvasesPosibles;
        envaseElegido = unEnvaseElegido;
        rutaImagen = unaRutaImagen;
    }
    public Articulo(){
        this.setPrecio(0);
        //this.envasesPosibles = null;
    }
    
    public Articulo(Articulo a) {
        nombre = a.nombre;
        origenMatPrima = a.origenMatPrima;
        precio = a.precio;
        material = a.material;
        codigo = a.codigo;
        envasesPosibles = a.envasesPosibles;
        envaseElegido = a.envaseElegido;
        rutaImagen = a.rutaImagen;
    }
    
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setOrigenMatPrima(String origenMatPrima) {
        this.origenMatPrima = origenMatPrima;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEnvasesPosibles(ArrayList<Envase> envasesPosibles) {
        this.envasesPosibles = envasesPosibles;
    }

    public void setEnvaseElegido(Envase envaseElegido) {
        this.envaseElegido = envaseElegido;
    }
    
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getOrigenMatPrima() {
        return origenMatPrima;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMaterial() {
        return material;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Envase> getEnvasesPosibles() {
        return envasesPosibles;
    }

    public Envase getEnvaseElegido() {
        return envaseElegido;
    }
    
    public String getRutaImagen() {
        return rutaImagen;
    }
    
    
    //Métodos sobreescritos
    @Override
    public boolean equals(Object obj){
        return this.getNombre().equals(((Articulo) obj).getNombre());
    }

}
