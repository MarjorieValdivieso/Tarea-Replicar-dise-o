package com.example.mitienda;

import javafx.beans.property.SimpleStringProperty;

public class Producto {

    private SimpleStringProperty codigo;
    private SimpleStringProperty nombre;
    private SimpleStringProperty categoria;
    private SimpleStringProperty precio;
    private SimpleStringProperty stock;
    private SimpleStringProperty estado;

    public Producto(String codigo, String nombre, String categoria, String precio, String stock, String estado) {
        this.codigo = new SimpleStringProperty(codigo);
        this.nombre = new SimpleStringProperty(nombre);
        this.categoria = new SimpleStringProperty(categoria);
        this.precio = new SimpleStringProperty(precio);
        this.stock = new SimpleStringProperty(stock);
        this.estado = new SimpleStringProperty(estado);
    }

    public String getCodigo() { return codigo.get(); }
    public String getNombre() { return nombre.get(); }
    public String getCategoria() { return categoria.get(); }
    public String getPrecio() { return precio.get(); }
    public String getStock() { return stock.get(); }
    public String getEstado() { return estado.get(); }

    public void setCodigo(String v) { codigo.set(v); }
    public void setNombre(String v) { nombre.set(v); }
    public void setCategoria(String v) { categoria.set(v); }
    public void setPrecio(String v) { precio.set(v); }
    public void setStock(String v) { stock.set(v); }
    public void setEstado(String v) { estado.set(v); }
}