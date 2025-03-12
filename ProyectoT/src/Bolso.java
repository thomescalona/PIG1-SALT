import java.util.Objects;

public class Bolso extends Accesorio {
    private String tipoCierre;
    private int capacidad;

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    public Bolso(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, Material material, boolean activo, String estilo, boolean esPersonalizado, String tipoCierre, int capacidad) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, material, activo, estilo, esPersonalizado);
        this.tipoCierre = tipoCierre;
        this.capacidad = capacidad;
    }


    public void mostrarDetalles(){
        System.out.println(getNombre() + " tengo un cierre" + getTipoCierre() + " y capacidad:" + getCapacidad());
    }

    @Override
    public String toString() {
        return "Tipo de cierre: " + tipoCierre + ", Capacidad: " + capacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bolso bolso = (Bolso) o;
        return capacidad == bolso.capacidad && Objects.equals(tipoCierre, bolso.tipoCierre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCierre, capacidad);
    }
}