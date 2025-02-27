package com.iescamp.PROYECTO;
import java.util.Objects;

public class MetodoPago {
    private int id;
    private String descripcion;

    //CONSTRUCTOR
    public MetodoPago(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "MetodoPago: "+ id + '\n' +"Descripcion: " + descripcion;
    }

    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetodoPago that = (MetodoPago) o;
        return id == that.id && Objects.equals(descripcion, that.descripcion);
    }

    //HASH
    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }









}
