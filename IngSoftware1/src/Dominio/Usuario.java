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
public class Usuario {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Usuario(String nombre, int edad, String mail, String alias) {
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.alias = alias;
    }

    public Usuario() {
        this.nombre = "";
        this.edad = 0;
        this.mail = "";
        this.alias = "";
    }
    
    private String nombre;
    private int edad;
    private String mail;
    private String alias;
    
}
