package com.iescamp.PROYECTO;

import java.util.Objects;

public class Accesorio extends Articulo {
    private String estilo;
    private boolean esPersonalizado;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isEsPersonalizado() {
        return esPersonalizado;
    }

    public void setEsPersonalizado(boolean esPersonalizado) {
        this.esPersonalizado = esPersonalizado;
    }

    public Accesorio(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, Material material, boolean activo, String estilo, boolean esPersonalizado) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, material, activo);
        this.estilo = estilo;
        this.esPersonalizado = esPersonalizado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Accesorio accesorio = (Accesorio) o;
        return esPersonalizado == accesorio.esPersonalizado && Objects.equals(estilo, accesorio.estilo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), estilo, esPersonalizado);
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "estilo='" + estilo + '\'' +
                ", esPersonalizado=" + esPersonalizado +
                '}';
    }
}
