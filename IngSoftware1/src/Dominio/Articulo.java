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

    //Constructores
    public Articulo(String unNombre, String unOrigenMatPrima, int unPrecio, String unMaterial, String unCodigo, ArrayList<Envase> listaEnvasesPosibles, Envase unEnvaseElegido) {
        nombre = unNombre;
        origenMatPrima = unOrigenMatPrima;
        precio = unPrecio;
        material = unMaterial;
        codigo = unCodigo;
        envasesPosibles = listaEnvasesPosibles;
        envaseElegido = unEnvaseElegido;
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
}