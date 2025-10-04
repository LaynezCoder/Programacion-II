/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

/**
 *
 * @author Laynecito
 */
public class Producto {

    private int id;
    private String barcode;
    private String nombre;
    private double precio;
    private String descripcion;
    private int idProveedor;
    private int idCategoria;
    private String proveedor;
    private String categoria;

    Producto() {

    }

    public Producto(String barcode, String nombre, double precio, String descripcion, int idProveedor, int idCategoria) {
        this.barcode = barcode;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    public Producto(int id, String barcode, String nombre, double precio, String descripcion, int idProveedor) {
        this.id = id;
        this.barcode = barcode;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

}
