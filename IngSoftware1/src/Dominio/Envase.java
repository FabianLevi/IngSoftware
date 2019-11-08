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
    
    //Constructores
    public Envase(String unTipo) {
        tipo = unTipo;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Getter
    public String getTipo() {
        return tipo;
    }
}
