package com.iescamp.CatalogoM.Model;

import com.iescamp.Enums.TipoRopa;
import com.iescamp.VentasM.Model.lineaPedido;

import java.util.ArrayList;
import java.util.Objects;

public class Chaqueta extends Ropa {

    private boolean impermeable;
    private ArrayList<lineaPedido> lineasPedidos;

    public Chaqueta(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, String color, boolean activo, Material material, int talla, String tipoCierre, TipoRopa tipoRopa, boolean impermeable) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, color, activo, material, talla, tipoCierre, tipoRopa);
        setImpermeable(impermeable);
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable) {
        this.impermeable = impermeable;
    }

    public ArrayList<lineaPedido> getLineasPedidos() {
        return lineasPedidos;
    }

    public void setLineasPedidos(ArrayList<lineaPedido> lineasPedidos) {
        this.lineasPedidos = lineasPedidos;
    }

    @Override
    public String toString() {
        return "Chaqueta:\n" +
                "- Código: " + getCodigoArticulo() + "\n" +
                "- Nombre: " + getNombre() + "\n" +
                "- Precio: " + getPrecio() + " €\n" +
                "- Marca: " + getMarca() + "\n" +
                "- Descripción: " + getDescripcion() + "\n" +
                "- Imagen: " + getImagen() + "\n" +
                "- Color: " + getColor() + "\n" +
                "- Activo: " + (isActivo() ? "Sí" : "No") + "\n" +
                "- Talla: " + getTalla() + "\n" +
                "- Color: " + getColor() + "\n" +
                "- Tipo de Cierre: " + getTipoCierre() + "\n" +
                "- Impermeable: " + (isImpermeable() ? "Sí" : "No") + "\n";
    }

    public void mostrarDetalles() {
        System.out.println(getNombre() + " es una chaqueta " + (isImpermeable() ? "impermeable" : "no impermeable") + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chaqueta chaqueta = (Chaqueta) o;
        return impermeable == chaqueta.impermeable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), impermeable);
    }
}
