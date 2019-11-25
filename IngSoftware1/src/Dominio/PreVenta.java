/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author Fabian
 */
public class PreVenta {

    public PreVenta(Date fecha, Venta ventaRealizar, String codigo) {
        this.fecha = fecha;
        this.ventaRealizar = ventaRealizar;
        this.codigo = codigo;
    }

    public PreVenta() {
        this.fecha = null;
        this.ventaRealizar = null;
        this.codigo="";
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Venta getVentaRealizar() {
        return ventaRealizar;
    }

    public void setVentaRealizar(Venta ventaRealizar) {
        this.ventaRealizar = ventaRealizar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private Date fecha;
    private Venta ventaRealizar;
    private String codigo;
    
      //Métodos sobreescritos
    @Override
    public boolean equals(Object obj){
        return this.codigo.equals(((PreVenta) obj).codigo);
    }

}
