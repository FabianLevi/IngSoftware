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
    private int danoAmbiental;

    

    public int getDanoAmbiental() {
        return danoAmbiental;
    }

    public void setDanoAmbiental(int danoAmbiental) {
        this.danoAmbiental = danoAmbiental;
    }


    //Constructores
    public Envase(String unTipo, String unaRutaImagen,int unDanoAmbiental) {
        this.setTipo(unTipo);
        this.setRutaImagen(unaRutaImagen);
        this.setDanoAmbiental(unDanoAmbiental);
    }
    
    public Envase(){
        this.setTipo("");
        this.setDanoAmbiental(0);
        this.setRutaImagen("");
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
    
    @Override
    public String toString() {
        return this.getTipo();
    }
    
}
