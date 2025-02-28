package com.iescamp.CatalogoM.Model;

import com.iescamp.VentasM.Model.lineaPedido;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Articulo {
    private String codigoArticulo;
    private String nombre;
    private float precio;
    private String marca;
    private String descripcion;
    private String imagen;
    private String color;
    private boolean activo;
    private Material material;
    private ArrayList<lineaPedido> lineasPedidos;

    public Articulo(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, String color, boolean activo, Material material) {
        this.setCodigoArticulo(codigoArticulo);
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setMarca(marca);
        this.setDescripcion(descripcion);
        this.setImagen(imagen);
        this.setColor(color);
        setMaterial(material);
        this.setActivo(activo);
    }

    public String getCodigoArticulo() { return codigoArticulo; }
    public void setCodigoArticulo(String codigoArticulo) {
        if (codigoArticulo == null || codigoArticulo.isEmpty()) {
            throw new IllegalArgumentException("El código de artículo no puede estar vacío");
        }
        this.codigoArticulo = codigoArticulo;
    }

    public ArrayList<lineaPedido> getLineasPedidos() {
        return lineasPedidos;
    }

    public void setLineasPedidos(ArrayList<lineaPedido> lineasPedidos) {
        this.lineasPedidos = lineasPedidos;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getColor() { return color; }
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacío");
        }
        this.color = color;
    }

    public Material getMaterial() { return material; }
    public void setMaterial(Material material) {
        if (material == null) {
            throw new IllegalArgumentException("El material no puede ser nulo.");
        }
        this.material = material;
    }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía");
        }
        this.marca = marca;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;
    }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) {
        if (imagen == null || imagen.isEmpty()) {
            throw new IllegalArgumentException("La imagen no puede estar vacía");
        }
        this.imagen = imagen;
    }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Float.compare(precio, articulo.precio) == 0 &&
                activo == articulo.activo &&
                Objects.equals(codigoArticulo, articulo.codigoArticulo) &&
                Objects.equals(nombre, articulo.nombre) &&
                Objects.equals(marca, articulo.marca) &&
                Objects.equals(descripcion, articulo.descripcion) &&
                Objects.equals(imagen, articulo.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
    }

    @Override
    public String toString() {
        return "- Artículo -\n" +
                "\tCódigo       : " + codigoArticulo + "\n" +
                "\tNombre       : " + nombre + "\n" +
                "\tPrecio       : " + precio + " €\n" +
                "\tMarca        : " + marca + "\n" +
                "\tDescripción  : " + descripcion + "\n" +
                "\tImagen       : " + imagen + "\n" +
                "\tActivo       : " + (activo ? "Sí" : "No") + "\n";
    }
}

