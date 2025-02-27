package com.iescamp.PROYECTO;

import java.util.Objects;

public class Articulo {
    private String codigoArticulo;
    private String nombre;
    private float precio;
    private String marca;
    private String descripcion;
    private String imagen;
    private boolean activo;

    public Articulo(String codigoArticulo, String nombre,
                    float precio, String marca, String descripcion,
                    String imagen, boolean activo) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.activo = activo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Float.compare(precio, articulo.precio) == 0 && activo == articulo.activo && Objects.equals(codigoArticulo, articulo.codigoArticulo) && Objects.equals(nombre, articulo.nombre) && Objects.equals(marca, articulo.marca) && Objects.equals(descripcion, articulo.descripcion) && Objects.equals(imagen, articulo.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
    }

    @Override
    public String toString() {
        return "clasesProyecto.Articulo{" +
                "codigoArticulo='" + codigoArticulo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", activo=" + activo +
                '}';
    }
}
