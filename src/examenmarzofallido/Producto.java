/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzofallido;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAW
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String nombreProveedor;
    private int nombreCategoria;
    private double precio;
    private int existencias;
    private int totalVendidos;

    public Producto(int idProducto, String nombreProducto, String nombreProveedor, int nombreCategoria, double precio, int existencias, int totalVendidos) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.nombreProveedor = nombreProveedor;
        this.nombreCategoria = nombreCategoria;
        this.precio = precio;
        this.existencias = existencias;
        this.totalVendidos = totalVendidos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public int getNombreCategoria() {
        return nombreCategoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public int getTotalVendidos() {
        return totalVendidos;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setNombreCategoria(int nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public void setTotalVendidos(int totalVendidos) {
        this.totalVendidos = totalVendidos;
    }
    
     
}
