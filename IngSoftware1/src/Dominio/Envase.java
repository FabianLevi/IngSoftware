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
public class Envase {
    
    //Atributos
    private String tipo;
    private String rutaImagen;

    //Constructores
    public Envase(String unTipo, String unaRutaImagen) {
        tipo = unTipo;
        rutaImagen = unaRutaImagen;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    //Getter
    public String getTipo() {
        return tipo;
    }
    
    public String getRutaImagen() {
        return rutaImagen;
    }
}
