package com.iescamp.PROYECTO;

public class Pantalón extends Ropa {

    private boolean tieneBolsillo;
    private  String tipoPantalon;

    public boolean isTieneDisenyo() {
        return tieneBolsillo;
    }

    public void setTieneDisenyo(boolean tieneDisenyo) {
        this.tieneBolsillo = tieneDisenyo;
    }

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public Pantalón(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo, int talla, String tipoCierre,
                    String color, boolean tieneDisenyo, String tipoPantalon) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, talla, tipoCierre, color);
        this.tieneBolsillo = tieneDisenyo;
        this.tipoPantalon = tipoPantalon;


    }

    @Override
    public String toString() {
        return "Pantalón{" +
                "tieneDisenyo=" + tieneBolsillo +
                ", tipoPantalon='" + tipoPantalon + '\'' +
                '}';
    }

    public void mostrarDetalles(){
        if (tieneBolsillo){
            System.out.println("Pantalon: " + getNombre() + "y tengo bolsillos");
        } else {
            System.out.println("Pantalon: " + getNombre() + "y no tengo bolsillos");
        }
    }
}
