package com.iescamp.PROYECTO;

public class Zapatos extends Accesorio {
    private int tallaZapatos;

    private String tipoSuela;

    public Zapatos(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo, String estilo, boolean esPersonalizado,
                   int tallaZapatos, String tipoSuela) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, estilo, esPersonalizado);
        this.tallaZapatos = tallaZapatos;
        this.tipoSuela = tipoSuela;
    }

    public int getTallaZapatos() {
        return tallaZapatos;
    }

    public void setTallaZapatos(int tallaZapatos) {
        this.tallaZapatos = tallaZapatos;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

   public void mostrarDetalles(){
       System.out.println(getNombre() + "tengo una talla : " + getTallaZapatos() + " y una suela " + getTipoSuela());
   }
}
