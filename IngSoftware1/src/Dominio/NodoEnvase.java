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
public class NodoEnvase {

    //Atributos no privados porque accedo desde el sistema    
    Envase envase;
    int cantVendidas;
    
    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public int getCantVendidas() {
        return cantVendidas;
    }

    public void setCantVendidas(int cantVendidas) {
        this.cantVendidas = cantVendidas;
    }

    public NodoEnvase(Envase envase, int cantVendidas) {
        this.setEnvase(envase);
        this.setCantVendidas(cantVendidas);
    }
    
    public NodoEnvase(){
        this.setEnvase(null);
        this.setCantVendidas(0);
    }

    
      //Métodos sobreescritos
    @Override
    public boolean equals(Object obj){
        return this.envase.equals(((NodoEnvase) obj).envase);
    }

    
}
