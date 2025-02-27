package com.iescamp.PROYECTO;

public class Camisa extends Ropa {

    private String tipoManga;
    private boolean esEstampada;

    public Camisa(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, Material material, boolean activo, int talla, String color, String tipoCierre, String tipoManga, boolean esEstampada) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, material, activo, talla, color, tipoCierre);
        this.tipoManga = tipoManga;
        this.esEstampada = esEstampada;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public boolean isEsEstampada() {
        return esEstampada;
    }

    public void setEsEstampada(boolean esEstampada) {
        this.esEstampada = esEstampada;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "tipoManga='" + tipoManga + '\'' +
                ", esEstampada=" + esEstampada +
                '}';
    }

    public void mostrarDetalles(){
        if (esEstampada){
            System.out.println(getNombre() + " tengo un tipo de manga "+ getTipoManga() +" y tengo un estampado");
        } else {
            System.out.println(getNombre() +  " tengo un tipo 
